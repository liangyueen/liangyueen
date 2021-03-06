package nccloud.web.ifm.income.handler;

import nc.vo.ifm.income.AggInvestIncomeVO;
import nc.vo.ifm.income.InvestIncomeVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDate;
import nc.voifm.ifm.util.IncomeUtil;
import nc.voifm.ifm.util.RedeemUtil;
import nccloud.framework.web.container.SessionContext;
import nccloud.framework.web.convert.translate.Translator;
import nccloud.framework.web.processor.template.BillCardConvertProcessor;
import nccloud.framework.web.ui.pattern.billcard.BillCard;
import nccloud.framework.web.ui.pattern.billcard.BillCardFormulaHandler;
import nccloud.framework.web.ui.pattern.billcard.CardHeadAfterEditEvent;
import nccloud.web.tmpub.afteredit.bean.UIProp;
import nccloud.web.tmpub.handler.AbstractCommonAfterEditHandler;

public class IncomeCurrtypeEditAfterHandler extends AbstractCommonAfterEditHandler<CardHeadAfterEditEvent, BillCard>{

	@Override
	protected BillCard processAfterEdit(CardHeadAfterEditEvent event, UIProp uiProp) throws BusinessException {
		BillCard card = event.getCard();
		BillCardConvertProcessor processor = new BillCardConvertProcessor();
		AggInvestIncomeVO vo = processor.fromBillCard(card);
		if (vo == null || vo.getParentVO() == null) {
			throw new BusinessException("编辑后事件处理错误！");
		}
		// 处理精度
		InvestIncomeVO pvo = (InvestIncomeVO) IncomeUtil.processPrecision(vo.getParentVO(), true, getBusiDate());
		vo.setParentVO(pvo);
		setExecAdjForIncome(vo);
		card = doReturn(vo);
		return card;
	}
	private void setExecAdjForIncome(AggInvestIncomeVO vo) throws BusinessException {
		InvestIncomeVO revo = vo.getParentVO();
		String pk_olccurr = RedeemUtil.getOrgStandardCurrtype(revo.getPk_org());
		revo.setPk_olccurr(pk_olccurr);
		if(revo.getActualmoeny()!=null && revo.getOlcrate()!=null){
			//组织的组织本位币
			revo.setOlcmoeny(revo.getActualmoeny().multiply(revo.getOlcrate()));
		}
		vo.setParentVO(revo);
	}
	
	/**
	 * 处理返回值
	 * @param vos
	 * @return
	 */
	protected BillCard doReturn(AggInvestIncomeVO vo) {
		// 把结果进行封装返回
		BillCardConvertProcessor processor = new BillCardConvertProcessor();
		BillCard billCard = processor.convert("36670IPR_CARD", vo);
		// 卡片参照翻译
		Translator translator = new Translator();
		translator.translate(billCard);
		// 处理模板显示公式
		BillCardFormulaHandler handler = new BillCardFormulaHandler(billCard);
		handler.handleLoadFormula();
		// handler.handleBodyLoadFormula();
		return billCard;
	}
	
	
	/**
	 * 获取当前业务时间
	 * @return
	 */
	private UFDate getBusiDate() {
		return new UFDate(SessionContext.getInstance().getClientInfo().getBizDateTime());
	}
	
}
