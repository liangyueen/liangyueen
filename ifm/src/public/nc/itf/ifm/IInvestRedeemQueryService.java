package nc.itf.ifm;


import nc.vo.ifm.redeem.AggInvestRedeemVO;
import nc.vo.pub.BusinessException;

public interface IInvestRedeemQueryService {
	/**
	 * 创建日期:
	 * @return AggBankProtocolVO[]
	 */
	public AggInvestRedeemVO[] queryRedeemByPks (String[] pks) throws BusinessException;
	/**
	 * 创建日期:
	 * @return String[]
	 */
	public String[] queryRedeemBySchema (nc.ui.querytemplate.querytree.IQueryScheme querySchema) throws BusinessException;
	
	/**
	 * 验证单据号是否重复
	 * @param pk_bankprotocol
	 * @param contractcode
	 * @return ture: 重复；false：不重复
	 * @throws BusinessException
	 */
	Boolean isBillNoDuplicate(String[] pk_redeemcol, String[] redeemcode) throws BusinessException;
}
