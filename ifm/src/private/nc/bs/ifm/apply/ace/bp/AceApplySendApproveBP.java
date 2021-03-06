package nc.bs.ifm.apply.ace.bp;

import nc.bs.ifm.apply.plugin.bpplugin.ApplyPluginPoint;
import nc.bs.ifm.pub.rule.RegisterWriteBankAccAfterRule;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.impl.pubapp.pattern.data.bill.template.UpdateBPTemplate;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.ifm.apply.AggInvestApplyVO;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * 标准单据送审的BP
 */
public class AceApplySendApproveBP {
	/**
	 * 送审动作
	 * 
	 * @param vos
	 *            单据VO数组
	 * @param script
	 *            单据动作脚本对象
	 * @return 送审后的单据VO数组
	 */

	public AggInvestApplyVO[] sendApprove(AggInvestApplyVO[] clientBills,
			AggInvestApplyVO[] originBills) {
		for (AggInvestApplyVO clientFullVO : clientBills) {
			clientFullVO.getParentVO().setAttributeValue("vbillstatus",
					BillStatusEnum.COMMIT.value());
			clientFullVO.getParentVO().setAttributeValue("billstatus", 1);
			clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
		}
		// 数据持久化
		AggInvestApplyVO[] returnVos = new BillUpdate<AggInvestApplyVO>().update(
				clientBills, originBills);	
		return returnVos;
	}	
}
