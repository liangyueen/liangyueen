package nccloud.web.ifm.redeem.action;

import nc.bs.pub.action.N_3642_SAVE;
import nc.pubitf.org.cache.IOrgUnitPubService_C;
import nc.vo.ifm.constants.TMIFMConst;
import nc.vo.ifm.redeem.AggInvestRedeemVO;
import nc.vo.ifm.redeem.InvestRedeemVO;
import nc.vo.org.OrgVO;
import nc.vo.pub.BusinessException;
import nccloud.framework.service.ServiceLocator;
import nccloud.framework.web.container.SessionContext;
import nccloud.web.ifm.common.action.CommonSaveAction;
import nccloud.framework.core.exception.ExceptionUtils;
import nc.vo.pub.lang.UFDate;
/**
 * �����ͬ����/�޸ı���
 * 
 * @author suxch
 */
public class RedeemSaveAction extends CommonSaveAction<AggInvestRedeemVO> {

	@Override
	protected AggInvestRedeemVO doBusinessSave(AggInvestRedeemVO operaVO) {
		// ��ֵ�����˵���Ϣ
		
		// ��ȡService
		
		try {
			this.doBefore(operaVO);
			operaVO= (AggInvestRedeemVO) callActionScript(TMIFMConst.CONST_ACTION_SAVEBASE,TMIFMConst.CONST_BILLTYPE_REDEEM,new AggInvestRedeemVO[]{operaVO});
		} catch (BusinessException e) {
			ExceptionUtils.wrapBusinessException("���浥��ʧ�ܣ�" + e.getMessage());
		}
		return operaVO;
	}

	
	  @Override protected String getPageCode() {
		  return TMIFMConst.CONST_PAGECODE_CONTRACT_CARD; }
	 
	/**
	 * ����ǰ����
	 * 
	 * @param operaVO
	 */
	private void doBefore(AggInvestRedeemVO operaVO) throws BusinessException{
		InvestRedeemVO vo=operaVO.getParentVO();
		//���������Ϣ
		vo.setPk_group(getGroupByOrg(vo.getPk_org()));
		vo.setAttributeValue("creator",SessionContext.getInstance().getClientInfo().getUserid());
		vo.setAttributeValue("creationtime",new UFDate(SessionContext.getInstance().getClientInfo().getBizDateTime()) );

	}
	
	/**
	 * ��ѯ������֯���ڼ���
	 * @param pk_org
	 * @return
	 */
	public static String getGroupByOrg(String pk_org) throws BusinessException {
		IOrgUnitPubService_C orgUnitQryService = ServiceLocator.find(IOrgUnitPubService_C.class);
		String pk_group = null;
		OrgVO[] orgVOs = orgUnitQryService.getOrgs(new String[] { pk_org }, new String[] { TMIFMConst.FIELD_PK_GROUP });
		if(orgVOs == null || orgVOs.length <= 0){
			ExceptionUtils.wrapBusinessException("��ȡ������֯��Ӧ�ļ���ʧ�ܡ�");
		}
		pk_group = (String) orgVOs[0].getAttributeValue(TMIFMConst.FIELD_PK_GROUP);
		return pk_group;
	}
	
	/**
	 * ��ȡ��ǰ��¼�û�����
	 * @return
	 */
	private String getPk_user() {
		return SessionContext.getInstance().getClientInfo().getUserid();
	}
	
	/**
	 * ��ȡ��ǰ��¼�û�����
	 * @return
	 */
	private UFDate getBusiDate() {
		return new UFDate(SessionContext.getInstance().getClientInfo().getBizDateTime());
	}
		

	

}