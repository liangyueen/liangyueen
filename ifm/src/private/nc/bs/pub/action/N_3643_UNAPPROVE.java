package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.UnapproveStatusCheckRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.pub.BusinessException;
import nc.vo.pub.VOStatus;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

import nc.bs.ifm.income.plugin.bpplugin.InvestIncomePluginPoint;
import nc.vo.ifm.income.AggInvestIncomeVO;
import nc.itf.ifm.IInvestIncomeMaintain;

public class N_3643_UNAPPROVE extends AbstractPfAction<AggInvestIncomeVO> {

	@Override
	protected CompareAroundProcesser<AggInvestIncomeVO> getCompareAroundProcesserWithRules(
			Object userObj) {
		CompareAroundProcesser<AggInvestIncomeVO> processor = new CompareAroundProcesser<AggInvestIncomeVO>(
				InvestIncomePluginPoint.UNAPPROVE);
		// TODO 在此处添加前后规则
//		processor.addBeforeRule(new UnapproveStatusCheckRule());

		return processor;
	}

	@Override
	protected AggInvestIncomeVO[] processBP(Object userObj,
			AggInvestIncomeVO[] clientFullVOs, AggInvestIncomeVO[] originBills) {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		AggInvestIncomeVO[] bills = null;
		try {
			IInvestIncomeMaintain operator = NCLocator.getInstance()
					.lookup(IInvestIncomeMaintain.class);
			bills = operator.unapprove(clientFullVOs, originBills);
		} catch (BusinessException e) {
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
		return bills;
	}

}
