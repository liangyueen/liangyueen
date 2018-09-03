package nc.vo.ifm.redeem;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

/**
 * <b> �˴���Ҫ�������๦�� </b>
 * <p>
 *   �˴������۵�������Ϣ
 * </p>
 *  ��������:2018-9-3
 * @author YONYOU NC
 * @version NCPrj ??
 */
 
public class InvestRedeemVO extends SuperVO {
	
/**
*�Զ�����8
*/
public static final String VDEF8="vdef8";
;
/**
*�Զ�����9
*/
public static final String VDEF9="vdef9";
;
/**
*��֯���ҽ��
*/
public static final String OLCMONEY="olcmoney";
;
/**
*���ű��ҽ��
*/
public static final String GLCMOENY="glcmoeny";
;
/**
*ȫ�ֱ������
*/
public static final String GLLMOENY="gllmoeny";
;
/**
*��������
*/
public static final String ISSUEBANK="issuebank";
;
/**
*���״̬
*/
public static final String BILLSTATUS="billstatus";
;
/**
*�տ��˻�
*/
public static final String GATHERINGACCOUNT="gatheringaccount";
;
/**
*�����˻�
*/
public static final String INVESTACCOUNT="investaccount";
;
/**
*�������
*/
public UFDate redeemdate;
/**
*��ؽ��
*/
public static final String REDEEMMONEY="redeemmoney";
;
/**
*��������
*/
public static final String INTERESTDAY="interestday";
;
/**
*Ԥ��������
*/
public static final String EXPECTEDRATE="expectedrate";
;
/**
*�ϴ��������
*/
public UFDate lastdate;
/**
*�ϴ�����
*/
public static final String LASTMONEY="lastmoney";
;
/**
*��ؼƻ�
*/
public static final String REDEEMPLAN="redeemplan";
;
/**
*��������
*/
public UFDate incomedate;
/**
*����˰��
*/
public static final String INCOMERATE="incomerate";
;
/**
*����˰��
*/
public static final String INCOMEMONEY="incomemoney";
;
/**
*ʵ����Ԥ�ڲ��
*/
public static final String BALANCE="balance";
;
/**
*ʱ���
*/
public UFDateTime ts;
    
    
/**
* ���� vdef8��Getter����.���������Զ�����8
*  ��������:2018-9-3
* @return java.lang.String
*/
public String getVdef8() {
return (java.lang.String) this.getAttributeValue( InvestRedeemVO.VDEF8);
} 

/**
* ����vdef8��Setter����.���������Զ�����8
* ��������:2018-9-3
* @param newVdef8 java.lang.String
*/
public void setVdef8 ( String vdef8) {
this.setAttributeValue( InvestRedeemVO.VDEF8,vdef8);
} 
 
/**
* ���� vdef9��Getter����.���������Զ�����9
*  ��������:2018-9-3
* @return java.lang.String
*/
public String getVdef9() {
return (java.lang.String) this.getAttributeValue( InvestRedeemVO.VDEF9);
} 

/**
* ����vdef9��Setter����.���������Զ�����9
* ��������:2018-9-3
* @param newVdef9 java.lang.String
*/
public void setVdef9 ( String vdef9) {
this.setAttributeValue( InvestRedeemVO.VDEF9,vdef9);
} 
 
/**
* ���� olcmoney��Getter����.����������֯���ҽ��
*  ��������:2018-9-3
* @return nc.vo.pub.lang.UFDouble
*/
public UFDouble getOlcmoney() {
return (nc.vo.pub.lang.UFDouble) this.getAttributeValue( InvestRedeemVO.OLCMONEY);
} 

/**
* ����olcmoney��Setter����.����������֯���ҽ��
* ��������:2018-9-3
* @param newOlcmoney nc.vo.pub.lang.UFDouble
*/
public void setOlcmoney ( String olcmoney) {
this.setAttributeValue( InvestRedeemVO.OLCMONEY,olcmoney);
} 
 
/**
* ���� glcmoeny��Getter����.�����������ű��ҽ��
*  ��������:2018-9-3
* @return nc.vo.pub.lang.UFDouble
*/
public UFDouble getGlcmoeny() {
return (nc.vo.pub.lang.UFDouble) this.getAttributeValue( InvestRedeemVO.GLCMOENY);
} 

/**
* ����glcmoeny��Setter����.�����������ű��ҽ��
* ��������:2018-9-3
* @param newGlcmoeny nc.vo.pub.lang.UFDouble
*/
public void setGlcmoeny ( String glcmoeny) {
this.setAttributeValue( InvestRedeemVO.GLCMOENY,glcmoeny);
} 
 
/**
* ���� gllmoeny��Getter����.��������ȫ�ֱ������
*  ��������:2018-9-3
* @return java.lang.String
*/
public String getGllmoeny() {
return (java.lang.String) this.getAttributeValue( InvestRedeemVO.GLLMOENY);
} 

/**
* ����gllmoeny��Setter����.��������ȫ�ֱ������
* ��������:2018-9-3
* @param newGllmoeny java.lang.String
*/
public void setGllmoeny ( String gllmoeny) {
this.setAttributeValue( InvestRedeemVO.GLLMOENY,gllmoeny);
} 
 
/**
* ���� issuebank��Getter����.����������������
*  ��������:2018-9-3
* @return nc.vo.bd.banktype.BankTypeVO
*/
public String getIssuebank() {
return (String) this.getAttributeValue( InvestRedeemVO.ISSUEBANK);
} 

/**
* ����issuebank��Setter����.����������������
* ��������:2018-9-3
* @param newIssuebank nc.vo.bd.banktype.BankTypeVO
*/
public void setIssuebank ( String issuebank) {
this.setAttributeValue( InvestRedeemVO.ISSUEBANK,issuebank);
} 
 
/**
* ���� billstatus��Getter����.�����������״̬
*  ��������:2018-9-3
* @return nc.vo.ifm.RedeemStatusEnum
*/
public Integer getBillstatus() {
return (Integer) this.getAttributeValue( InvestRedeemVO.BILLSTATUS);
} 

/**
* ����billstatus��Setter����.�����������״̬
* ��������:2018-9-3
* @param newBillstatus nc.vo.ifm.RedeemStatusEnum
*/
public void setBillstatus ( Integer billstatus) {
this.setAttributeValue( InvestRedeemVO.BILLSTATUS,billstatus);
} 
 
/**
* ���� gatheringaccount��Getter����.���������տ��˻�
*  ��������:2018-9-3
* @return nc.vo.bd.bankaccount.BankAccSubVO
*/
public String getGatheringaccount() {
return (String) this.getAttributeValue( InvestRedeemVO.GATHERINGACCOUNT);
} 

/**
* ����gatheringaccount��Setter����.���������տ��˻�
* ��������:2018-9-3
* @param newGatheringaccount nc.vo.bd.bankaccount.BankAccSubVO
*/
public void setGatheringaccount ( String gatheringaccount) {
this.setAttributeValue( InvestRedeemVO.GATHERINGACCOUNT,gatheringaccount);
} 
 
/**
* ���� investaccount��Getter����.�������������˻�
*  ��������:2018-9-3
* @return nc.vo.bd.bankaccount.BankAccSubVO
*/
public String getInvestaccount() {
return (String) this.getAttributeValue( InvestRedeemVO.INVESTACCOUNT);
} 

/**
* ����investaccount��Setter����.�������������˻�
* ��������:2018-9-3
* @param newInvestaccount nc.vo.bd.bankaccount.BankAccSubVO
*/
public void setInvestaccount ( String investaccount) {
this.setAttributeValue( InvestRedeemVO.INVESTACCOUNT,investaccount);
} 
 
/**
* ���� redeemdate��Getter����.���������������
*  ��������:2018-9-3
* @return nc.vo.pub.lang.UFDate
*/
public UFDate getRedeemdate() {
return (nc.vo.pub.lang.UFDate) this.getAttributeValue("redeemdate");
} 

/**
* ����redeemdate��Setter����.���������������
* ��������:2018-9-3
* @param newRedeemdate nc.vo.pub.lang.UFDate
*/
public void setRedeemdate ( UFDate redeemdate) {
this.setAttributeValue("redeemdate",redeemdate);
} 
 
/**
* ���� redeemmoney��Getter����.����������ؽ��
*  ��������:2018-9-3
* @return nc.vo.pub.lang.UFDouble
*/
public UFDouble getRedeemmoney() {
return (nc.vo.pub.lang.UFDouble) this.getAttributeValue( InvestRedeemVO.REDEEMMONEY);
} 

/**
* ����redeemmoney��Setter����.����������ؽ��
* ��������:2018-9-3
* @param newRedeemmoney nc.vo.pub.lang.UFDouble
*/
public void setRedeemmoney ( String redeemmoney) {
this.setAttributeValue( InvestRedeemVO.REDEEMMONEY,redeemmoney);
} 
 
/**
* ���� interestday��Getter����.����������������
*  ��������:2018-9-3
* @return java.lang.Integer
*/
public Integer getInterestday() {
return (java.lang.Integer) this.getAttributeValue( InvestRedeemVO.INTERESTDAY);
} 

/**
* ����interestday��Setter����.����������������
* ��������:2018-9-3
* @param newInterestday java.lang.Integer
*/
public void setInterestday ( Integer interestday) {
this.setAttributeValue( InvestRedeemVO.INTERESTDAY,interestday);
} 
 
/**
* ���� expectedrate��Getter����.��������Ԥ��������
*  ��������:2018-9-3
* @return nc.vo.pub.lang.UFDouble
*/
public UFDouble getExpectedrate() {
return (nc.vo.pub.lang.UFDouble) this.getAttributeValue( InvestRedeemVO.EXPECTEDRATE);
} 

/**
* ����expectedrate��Setter����.��������Ԥ��������
* ��������:2018-9-3
* @param newExpectedrate nc.vo.pub.lang.UFDouble
*/
public void setExpectedrate ( String expectedrate) {
this.setAttributeValue( InvestRedeemVO.EXPECTEDRATE,expectedrate);
} 
 
/**
* ���� lastdate��Getter����.���������ϴ��������
*  ��������:2018-9-3
* @return nc.vo.pub.lang.UFDate
*/
public UFDate getLastdate() {
return (nc.vo.pub.lang.UFDate) this.getAttributeValue( "lastdate");
} 

/**
* ����lastdate��Setter����.���������ϴ��������
* ��������:2018-9-3
* @param newLastdate nc.vo.pub.lang.UFDate
*/
public void setLastdate ( UFDate lastdate) {
this.setAttributeValue( "lastdate",lastdate);
} 
 
/**
* ���� lastmoney��Getter����.���������ϴ�����
*  ��������:2018-9-3
* @return nc.vo.pub.lang.UFDouble
*/
public UFDouble getLastmoney() {
return (nc.vo.pub.lang.UFDouble) this.getAttributeValue( InvestRedeemVO.LASTMONEY);
} 

/**
* ����lastmoney��Setter����.���������ϴ�����
* ��������:2018-9-3
* @param newLastmoney nc.vo.pub.lang.UFDouble
*/
public void setLastmoney ( String lastmoney) {
this.setAttributeValue( InvestRedeemVO.LASTMONEY,lastmoney);
} 
 
/**
* ���� redeemplan��Getter����.����������ؼƻ�
*  ��������:2018-9-3
* @return java.lang.String
*/
public String getRedeemplan() {
return (java.lang.String) this.getAttributeValue( InvestRedeemVO.REDEEMPLAN);
} 

/**
* ����redeemplan��Setter����.����������ؼƻ�
* ��������:2018-9-3
* @param newRedeemplan java.lang.String
*/
public void setRedeemplan ( String redeemplan) {
this.setAttributeValue( InvestRedeemVO.REDEEMPLAN,redeemplan);
} 
 
/**
* ���� incomedate��Getter����.����������������
*  ��������:2018-9-3
* @return nc.vo.pub.lang.UFDate
*/
public UFDate getIncomedate() {
return (nc.vo.pub.lang.UFDate) this.getAttributeValue("incomedate");
} 

/**
* ����incomedate��Setter����.����������������
* ��������:2018-9-3
* @param newIncomedate nc.vo.pub.lang.UFDate
*/
public void setIncomedate ( UFDate incomedate) {
this.setAttributeValue("incomedate",incomedate);
} 
 
/**
* ���� incomerate��Getter����.������������˰��
*  ��������:2018-9-3
* @return nc.vo.pub.lang.UFDouble
*/
public UFDouble getIncomerate() {
return (nc.vo.pub.lang.UFDouble) this.getAttributeValue( InvestRedeemVO.INCOMERATE);
} 

/**
* ����incomerate��Setter����.������������˰��
* ��������:2018-9-3
* @param newIncomerate nc.vo.pub.lang.UFDouble
*/
public void setIncomerate ( String incomerate) {
this.setAttributeValue( InvestRedeemVO.INCOMERATE,incomerate);
} 
 
/**
* ���� incomemoney��Getter����.������������˰��
*  ��������:2018-9-3
* @return nc.vo.pub.lang.UFDouble
*/
public UFDouble getIncomemoney() {
return (nc.vo.pub.lang.UFDouble) this.getAttributeValue("incomemoney");
} 

/**
* ����incomemoney��Setter����.������������˰��
* ��������:2018-9-3
* @param newIncomemoney nc.vo.pub.lang.UFDouble
*/
public void setIncomemoney ( String incomemoney) {
this.setAttributeValue( InvestRedeemVO.INCOMEMONEY,incomemoney);
} 
 
/**
* ���� balance��Getter����.��������ʵ����Ԥ�ڲ��
*  ��������:2018-9-3
* @return nc.vo.pub.lang.UFDouble
*/
public UFDouble getBalance() {
return (nc.vo.pub.lang.UFDouble) this.getAttributeValue( InvestRedeemVO.BALANCE);
} 

/**
* ����balance��Setter����.��������ʵ����Ԥ�ڲ��
* ��������:2018-9-3
* @param newBalance nc.vo.pub.lang.UFDouble
*/
public void setBalance ( String balance) {
this.setAttributeValue( InvestRedeemVO.BALANCE,balance);
} 
 
/**
* ���� ����ʱ�����Getter����.��������ʱ���
*  ��������:2018-9-3
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getTs() {
return this.ts;
}
/**
* ��������ʱ�����Setter����.��������ʱ���
* ��������:2018-9-3
* @param newts nc.vo.pub.lang.UFDateTime
*/
public void setTs(UFDateTime ts){
this.ts=ts;
} 
     
    @Override
    public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("ifm.redeem");
    }
   }
    