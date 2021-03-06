package nc.bs.ifm.redeem.ace.bp;

import nc.bs.ifm.redeem.plugin.bpplugin.InvestRedeemPluginPoint;
import nc.vo.ifm.redeem.AggInvestRedeemVO;

import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;


/**
 * 标准单据删除BP
 */
public class AceInvestRedeemDeleteBP {

	public void delete(AggInvestRedeemVO[] bills) {

		DeleteBPTemplate<AggInvestRedeemVO> bp = new DeleteBPTemplate<AggInvestRedeemVO>(
				InvestRedeemPluginPoint.DELETE);
		// 增加执行前规则
		this.addBeforeRule(bp.getAroundProcesser());
		// 增加执行后业务规则
		this.addAfterRule(bp.getAroundProcesser());
		bp.delete(bills);
	}

	private void addBeforeRule(AroundProcesser<AggInvestRedeemVO> processer) {
		// TODO 前规则
		IRule<AggInvestRedeemVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();
		processer.addBeforeRule(rule);
	}

	/**
	 * 删除后业务规则
	 * 
	 * @param processer
	 */
	private void addAfterRule(AroundProcesser<AggInvestRedeemVO> processer) {
		// TODO 后规则

	}
}
