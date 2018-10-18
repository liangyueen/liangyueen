package nc.itf.ifm;

import nc.vo.ifm.redeem.InvestRedeemVO;

public interface IIncomeCtrlService {
	/**
	 * �����ɺ�д����������
	 * @param redeemVO
	 * @return boolean �ɹ�����true
	 */
	public boolean WriteIncomeBill(InvestRedeemVO redeemVO);
	
	/**
	 * ��س�����ͬ��ɾ��д����������ݣ�ǰ�������洦�ڿ�ɾ��״̬
	 * @param redeemVO
	 */
	public void RewriteIncomeBill(InvestRedeemVO redeemVO);
	
}