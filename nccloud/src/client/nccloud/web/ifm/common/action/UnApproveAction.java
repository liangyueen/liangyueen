package nccloud.web.ifm.common.action;

import nc.vo.ifm.constants.TMIFMConst;
import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;


/**
 * 取消审批
 * @author wuzhwa
 * @version ncc1.0
 * 2018年7月31日
 */
public abstract class UnApproveAction<T  extends AbstractBill> extends AbstractPfAction<T> {


	@Override
	protected String getActionCode() {
		return TMIFMConst.CONST_ACTION_UNAPPROVE;
	}
}
