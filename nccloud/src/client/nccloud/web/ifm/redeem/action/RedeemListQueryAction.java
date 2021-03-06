package nccloud.web.ifm.redeem.action;

import java.util.Map;

import nc.itf.ifm.IInvestRedeemQueryService;
import nc.vo.ifm.constants.TMIFMConst;
import nc.vo.ifm.redeem.AggInvestRedeemVO;
import nc.vo.ifm.redeem.InvestRedeemVO;
import nccloud.dto.baseapp.querytree.dataformat.QueryTreeFormatVO;
import nccloud.framework.core.exception.ExceptionUtils;
import nccloud.framework.service.ServiceLocator;
import nccloud.web.ifm.common.action.CommonListQueryAction;

import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.voifm.ifm.util.RedeemUtil;



public class RedeemListQueryAction extends CommonListQueryAction<AggInvestRedeemVO> {

	@Override
	protected AggInvestRedeemVO[] queryBillsByPks(String[] currPagePks) {
		AggInvestRedeemVO[] vos=null;
		try {
			IInvestRedeemQueryService service=ServiceLocator.find(IInvestRedeemQueryService.class);
			vos=service.queryRedeemByPks(currPagePks);
			} catch (BusinessException e) {
				ExceptionUtils.wrapBusinessException(e.getMessage());
		}
		return vos;
	}

	

	


	@Override
	protected Class<? extends SuperVO> getVOClass() {
		// TODO Auto-generated method stub
		return InvestRedeemVO.class;
	}






	@Override
	protected String getAreaCode() {
		// TODO Auto-generated method stub
		return TMIFMConst.CONST_AREACODE_REDEEM_LIST_TABLE;
	}
	
	@Override
	protected Map<String, String> queryGroupData(QueryTreeFormatVO queryParam) {
		Map<String, String> map=RedeemUtil.getGroupData(queryParam);
		return map;
	}

}
