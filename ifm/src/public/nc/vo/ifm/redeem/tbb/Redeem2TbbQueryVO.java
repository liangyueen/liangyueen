/*
 * @(#)AllocateAgree2TbbQueryVO.java 2011-3-15
 * Copyright 2010 UFIDA Software CO.LTD. All rights reserved.
 */
package nc.vo.ifm.redeem.tbb;

import nc.itf.ifm.pub.tbb.IIFM4TbbConst;
import nc.vo.ifm.constants.TMIFMConst;
import nc.vo.ifm.pub.tbb.IFMToTbbQueryVO;
import nc.vo.ifm.redeem.InvestRedeemVO;
import nc.vo.pub.pf.IPfRetCheckInfo;
import nc.vo.tmpub.util.StringUtil;

/**
 * 投资收益-预算VO转换类
 */
public class Redeem2TbbQueryVO extends IFMToTbbQueryVO{

	
    /**
	 * 字段注释
	 */
	private static final long serialVersionUID = -7776075437540439463L;
	// 财务组织
	private String pk_org;
	// 币种
	private String pk_currtype;
	// 资金计划项目
	private String[] capitalproject;
	// 发行银行
	private String issuebank;
	// 投资品种
	private String investvariety;
	// 银行账户
	private String gathering;
	
	// 计划项目字段名
	private static final String PK_FUNDPLAN_KEY = "capitalproject";
	
	@Override
	public String[] getDataItemNames() {
		return new String[]{
//				IIFM4TbbConst.PK_ORG_3642,
//				IIFM4TbbConst.PK_CURRTYPE_3642,
//				IIFM4TbbConst.PK_FUNDPLAN_3642,
//				IIFM4TbbConst.PK_BANKACC_P_3642,
//				IIFM4TbbConst.PK_FINVAR_3642,
//				IIFM4TbbConst.PK_BANKACC_R_3642
				
				"pk_org","pk_currtype","capitalproject","issuebank","investvariety","gatheringaccount"
		};
	}
	

	
	@Override
	public String[] getAttributeNames() {
		return new String[] { PK_FUNDPLAN_KEY };
	}
	
	@Override
	public boolean isLevelCtrl(String key) {
		if(IIFM4TbbConst.PK_FUNDPLAN_3642.equals(key)){
			return true;
		}
		return false;
	}
	/**
	 * 根据档案获取档案值
	 */
	@Override
	public Object getAttributeValue(String name) {
		if(name.equals(IIFM4TbbConst.PK_ORG_3642)){
			return getPk_org();
		}
		else if(name.equals(IIFM4TbbConst.PK_CURRTYPE_3642)){
			return getPk_currtype();
		}
		else if(name.equals(IIFM4TbbConst.PK_FUNDPLAN_3642)){
			return getCapitalproject();
		}
		else if(name.equals(IIFM4TbbConst.PK_BANKACC_P_3642)){
			return getIssuebank();
		}
		else if(name.equals(IIFM4TbbConst.PK_FINVAR_3642)){
			return getInvestvariety();
		}
		else if(name.equals(IIFM4TbbConst.PK_BANKACC_R_3642)){
			return getGathering();
		}
		return null;
	}
	/**
	 * 根据档案属性设置档案值
	 */
	@Override
	public void setAttributeValue(String name, Object value) {
		if(name.equals(IIFM4TbbConst.PK_ORG_3642)){
			setPk_org(StringUtil.toString(value));
		}
		else if(name.equals(IIFM4TbbConst.PK_CURRTYPE_3642)){
			setPk_currtype(StringUtil.toString(value));
		}
		else if(name.equals(IIFM4TbbConst.PK_FUNDPLAN_3642)){
			setCapitalproject((String[])value);
		}
		else if(name.equals(IIFM4TbbConst.PK_BANKACC_P_3642)){
			setIssuebank(StringUtil.toString(value));
		}
		else if(name.equals(IIFM4TbbConst.PK_FINVAR_3642)){
			setPk_finvar(StringUtil.toString(value));
		}
		else if(name.equals(IIFM4TbbConst.PK_BANKACC_R_3642)){
			setGathering(StringUtil.toString(value));
		}
		
	}
	
	@Override
	public String getHeadTableName() {
		
		return TMIFMConst.HeadTableName_redeem;
	}
	@Override
	public String getBodyTableName() {
		
//		return TMIFMConst.BodyTableName;
		return null;
	}

	@Override
	public String getJoinPart() {
//		return TMIFMConst.HeadTableName + DISPOINT + TMIFMConst.PrimaryKey + " = "
//	       + TMIFMConst.BodyTableName + DISPOINT + TMIFMConst.PrimaryKey;
		return "";
	}

	@Override
	public String getIncludingUneffectivePart() {
		if (!isIncludinguneffective()) {
			// 不包含未生效的单据的情况
//			return " ifm_redeem.vbillstatus = 1 ";
		}
		return null;
	}
	public  String getUfindOrPrefindPart(){
		if(getFlag_readyorrun().equals(IIFM4TbbConst.Flag_Ufind)){
			return " 1 = 2 ";
		}
		else{
			return getHeadTableName() + DISPOINT + InvestRedeemVO.VBILLSTATUS + " <> " +
					/*TMIFMConst.BS_redeem_FINSHED*/IPfRetCheckInfo.PASSING ;
		}
	};
	
	/**
	 * 返回  去除表体作废的行 SQL
	 * @return
	 * @author chengfei
	 * @since NC6.0
	 */
	public  String getBodyDisUsePart(){
		return null;
	};
	/**
	 *
	 * 方法功能描述：返回单据日期字段名。
	 */
	public String getDateKeyName() {
		if(getDateType().equals(IIFM4TbbConst.RedeemAccountDateFiled)){//到账日期
			return getHeadTableName() + DISPOINT + InvestRedeemVO.INCOMEDATE;
		}
		else{
			return getHeadTableName() + DISPOINT + getDateType();
		}
		
	}

	@Override
	public String changeAttrToBillItemName(String attr) {
		if(StringUtil.isNotNull(attr)){
			if( attr.equals(IIFM4TbbConst.PK_FUNDPLAN_3642)){
				return getBodyTableName() + DISPOINT + InvestRedeemVO.CAPITALPROJECT;//收益资金计划项目
			}
			else if(attr.equals(IIFM4TbbConst.PK_BANKACC_P_3642)){
				return getBodyTableName() + DISPOINT + InvestRedeemVO.ISSUEBANK;
			}
			else if(attr.equals(IIFM4TbbConst.PK_FINVAR_3642)){
				return getBodyTableName() + DISPOINT + InvestRedeemVO.INVESTVARIETY;//投资品种
			}
			else if(attr.equals(IIFM4TbbConst.PK_BANKACC_R_3642)){
				return getBodyTableName() + DISPOINT + InvestRedeemVO.GATHERINGACCOUNT;//收款账户
			}
			else if(attr.length() > 5){
				return getBodyTableName() + DISPOINT + attr.substring(0,attr.length()-5);
			}
		}
		return null;
	}
	
	/**
	 *
	 * 方法功能描述：返回选择字段名。 返回原币金额，组织本币金额，集团本币金额，全局本币金额
	 */
	@Override
	public String[] getToSelecltKeyName() {
		String[] selectkeys = null;
		
		selectkeys = new String[4];
		selectkeys[0] = "  isnull(" + getHeadTableName() + DISPOINT + InvestRedeemVO.REDEEMMONEY + ",0) ";
		
		selectkeys[1] = "  isnull(" + getHeadTableName() + DISPOINT + InvestRedeemVO.OLCMONEY + ",0)";
		
		selectkeys[2] = "  isnull(" + getHeadTableName() + DISPOINT + InvestRedeemVO.GLCMOENY + ",0)";
		
		selectkeys[3] = "  isnull(" + getBodyTableName() + DISPOINT + InvestRedeemVO.GLLMOENY+ ",0)";
		
		return selectkeys;
	}

	/**
	 * 返回单据类型
	 * @return
	 */
	public String getBilltypecode(){
		return "3642";
	}

	/**
	 * @return the pk_org
	 */
	public String getPk_org() {
		return pk_org;
	}



	/**
	 * @param pk_org the pk_org to set
	 */
	public void setPk_org(String pk_org) {
		this.pk_org = pk_org;
	}



	/**
	 * @return the pk_currtype
	 */
	public String getPk_currtype() {
		return pk_currtype;
	}



	/**
	 * @param pk_currtype the pk_currtype to set
	 */
	public void setPk_currtype(String pk_currtype) {
		this.pk_currtype = pk_currtype;
	}






	/**
	 * @return the issuebank
	 */
	public String getIssuebank() {
		return issuebank;
	}



	/**
	 * @param issuebank the issuebank to set
	 */
	public void setIssuebank(String issuebank) {
		this.issuebank = issuebank;
	}



	/**
	 * @return the pk_finvar
	 */
	public String getInvestvariety() {
		return investvariety;
	}



	/**
	 * @param pk_finvar the pk_finvar to set
	 */
	public void setInvestvariety(String investvariety) {
		this.investvariety = investvariety;
	}



	/**
	 * @return the gathering
	 */
	public String getGathering() {
		return gathering;
	}



	/**
	 * @param gathering the gathering to set
	 */
	public void setGathering(String gathering) {
		this.gathering = gathering;
	}



	/**
	 * @return the pkFundplanKey
	 */
	public static String getPkFundplanKey() {
		return PK_FUNDPLAN_KEY;
	}

	/**
	 * @return the capitalproject
	 */
	public String[] getCapitalproject() {
		return capitalproject;
	}



	/**
	 * @param capitalproject the capitalproject to set
	 */
	public void setCapitalproject(String[] capitalproject) {
		this.capitalproject = capitalproject;
	}

	
}
