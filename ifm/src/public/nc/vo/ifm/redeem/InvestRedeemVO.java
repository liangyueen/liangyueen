package nc.vo.ifm.redeem;

import java.util.HashMap;

import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;
import nc.vo.trade.pub.IExAggVO;

/**
 * <b> 此处简要描述此类功能 </b>
 * <p>
 * 此处添加累的描述信息
 * </p>
 * 创建日期:2018-9-3
 * 
 * @author YONYOU NC
 * @version NCPrj ??
 */

public class InvestRedeemVO extends SuperVO implements IExAggVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8598162369826740590L;
	public static final String PK_ORG = "pk_org";
	public static final String PK_ORG_V = "pk_org_v";
	public static final String PK_GROUP = "pk_group";
	public static final String PK_REDEEM = "pk_redeem";
	public static final String PK_APPLY = "pk_apply";
	public static final String PRODUCTCODE = "productcode";
	public static final String PRODUCTNAME = "productname";
	public static final String VBILLTYPE = "vbilltype";
	public static final String VBILLNO = "vbillno";
	public static final String HOLDMONEY = "holdmoney";
	public static final String HOLDNUMBER = "holdnumber";
	public static final String VDEF1 = "vdef1";
	public static final String VDEF2 = "vdef2";
	public static final String VDEF3 = "vdef3";
	public static final String VDEF4 = "vdef4";
	public static final String VDEF5 = "vdef5";
	public static final String VDEF6 = "vdef6";
	public static final String VDEF7 = "vdef7";
	public static final String VDEF10 = "vdef10";
	public static final String VDEF11 = "vdef11";
	public static final String VDEF12 = "vdef12";
	public static final String VDEF13 = "vdef13";
	public static final String VDEF14 = "vdef14";
	public static final String VDEF15 = "vdef15";
	public static final String VDEF16 = "vdef16";
	public static final String VDEF17 = "vdef17";
	public static final String VDEF18 = "vdef18";
	public static final String VDEF19 = "vdef19";
	public static final String VDEF20 = "vdef20";
	public static final String OLCRATE = "olcrate";
	public static final String GLCRATE = "glcrate";
	public static final String GLLCRATE = "gllcrate";
	public static final String BILLMAKER = "billmaker";
	public static final String BILLMAKEDATE = "billmakedate";
	public static final String BILLMAKETIME = "billmaketime";
	public static final String APPROVER = "approver";
	public static final String APPROVEDATE = "approvedate";
	public static final String APPROVENOTE = "approvenote";
	public static final String CREATOR = "creator";
	public static final String CREATIONTIME = "creationtime";
	public static final String MODIFIER = "modifier";
	public static final String MODIFIEDTIME = "modifiedtime";
	public static final String PK_BUSITYPE = "pk_busitype";
	public static final String PK_BILLTYPEID = "pk_billtypeid";
	public static final String PK_BILLTYPECODE = "pk_billtypecode";
	public static final String INTERACTFIELD = "interactfield";
	public static final String REMARK = "remark";
	 public static final String VBILLSTATUS = "vbillstatus";
	 public static final String REDEEMNUMBER = "redeemnumber";
	  public static final String UNITNETVALUE = "unitnetvalue";
	  public static final String REALREANING = "realreaning";
	  public static final String PK_OLCCURR = " pk_olccurr";
	//来源单据四个字段 
	  public static final String PK_SRCBILL = "pk_srcbill";
	  public static final String PK_SRCBILLTYPE = "pk_srcbilltype";
	  public static final String SRCBILLTYPECODE = "srcbilltypecode";
	  public static final String SRCBILLNO = "srcbillno";
	  public Integer getHoldnumber() {
			return (Integer) this.getAttributeValue( InvestRedeemVO.HOLDNUMBER);
		} 

		public void setHoldnumber ( Integer holdnumber) {
			this.setAttributeValue( InvestRedeemVO.HOLDNUMBER,holdnumber);
		} 
	  public String getPk_srcbill() {
			return (String) this.getAttributeValue( InvestRedeemVO.PK_SRCBILL);
		} 

		public void setPk_srcbill ( String pk_srcbill) {
			this.setAttributeValue( InvestRedeemVO.PK_SRCBILL,pk_srcbill);
		} 
		public String getPk_srcbilltype() {
			return (String) this.getAttributeValue( InvestRedeemVO.PK_SRCBILLTYPE);
		} 

		public void setPk_srcbilltype ( String pk_srcbilltype) {
			this.setAttributeValue( InvestRedeemVO.PK_SRCBILLTYPE,pk_srcbilltype);
		} 
		public String getSrcbilltypecode() {
			return (String) this.getAttributeValue( InvestRedeemVO.SRCBILLTYPECODE);
		} 

		public void setSrcbilltypecode ( String srcbilltypecode) {
			this.setAttributeValue( InvestRedeemVO.SRCBILLTYPECODE,srcbilltypecode);
		} 
		public String getSrcbillno() {
			return (String) this.getAttributeValue( InvestRedeemVO.SRCBILLNO);
		} 

		public void setSrcbillno ( String srcbillno) {
			this.setAttributeValue( InvestRedeemVO.SRCBILLNO,srcbillno);
		} 
	  
	  public java.lang.String getPk_olccurr() {
			return (java.lang.String) getAttributeValue(PK_OLCCURR);
		}

		public void setPk_olccurr(java.lang.String newPk_olccurr) {
			setAttributeValue(PK_OLCCURR, newPk_olccurr);
		}
	public UFDouble getUnitnetvalue()
	   {
	      return (UFDouble)getAttributeValue("unitnetvalue");
	    }
	
	public void setGlcrate(UFDouble glcrate) {
		setAttributeValue(GLCRATE, glcrate);
	}
	public UFDouble getGlcrate() {
		return (UFDouble)getAttributeValue("glcrate");
	}
	public void setGllcrate(UFDouble gllcrate) {
		setAttributeValue(GLLCRATE, gllcrate);
	}
	public UFDouble getGllcrate() {
		return (UFDouble)getAttributeValue("gllcrate");
	}
	
	//pk_currtype
	 public static final String PK_CURRTYPE = "pk_currtype";
	 public void setPk_currtype(java.lang.String newPk_currtype) {
			setAttributeValue("pk_currtype", newPk_currtype);
		}
	public static final String INVESTVARIETY = "investvariety";
	 
	 
	public UFDouble getOlcrate() {
		 return (UFDouble)getAttributeValue("olcrate");
	}
	public void setOlcrate(UFDouble olcrate) {
		setAttributeValue(OLCRATE, olcrate);
	}
	public void setRealreaning(UFDouble realreaning) {
		setAttributeValue(REALREANING, realreaning);
	}
	public UFDouble getRealreaning() {
		return (UFDouble)getAttributeValue(REALREANING);
	}
	
	 public java.lang.Integer getRedeemnumber () {
			return (java.lang.Integer) getAttributeValue(REDEEMNUMBER);
		}   
	//pk_currtype
	 public static String getPkCurrtype() {
		return PK_CURRTYPE;
	}
	 
	 
	 
	 public static String getPkOrg() {
		return PK_ORG;
	}
	public static String getPkGroup() {
		return PK_GROUP;
	}
	public static String getPkRedeem() {
		return PK_REDEEM;
	}
	public static String getPkApply() {
		return PK_APPLY;
	}
	public static String getVdef1() {
		return VDEF1;
	}
	public static String getVdef2() {
		return VDEF2;
	}
	public static String getVdef3() {
		return VDEF3;
	}
	public static String getVdef4() {
		return VDEF4;
	}
	public static String getVdef5() {
		return VDEF5;
	}
	public static String getVdef6() {
		return VDEF6;
	}
	public static String getVdef7() {
		return VDEF7;
	}
	public static String getVdef10() {
		return VDEF10;
	}
	public static String getVdef11() {
		return VDEF11;
	}
	public static String getVdef12() {
		return VDEF12;
	}
	public static String getVdef13() {
		return VDEF13;
	}
	public static String getVdef14() {
		return VDEF14;
	}
	public static String getVdef15() {
		return VDEF15;
	}
	public static String getVdef16() {
		return VDEF16;
	}
	public static String getVdef17() {
		return VDEF17;
	}
	public static String getVdef18() {
		return VDEF18;
	}
	public static String getVdef19() {
		return VDEF19;
	}
	public static String getVdef20() {
		return VDEF20;
	}
	
	public static String getPkBusitype() {
		return PK_BUSITYPE;
	}
	public static String getPkBilltypeid() {
		return PK_BILLTYPEID;
	}
	public static String getPkBilltypecode() {
		return PK_BILLTYPECODE;
	}
	public static String getInteractfield() {
		return INTERACTFIELD;
	}
	public String getPk_currtype() {
		return (String) this.getAttributeValue( InvestRedeemVO.PK_CURRTYPE);
		} 
	public java.lang.Integer getVbillstatus () {
			return (java.lang.Integer) getAttributeValue(VBILLSTATUS);
		}   
		public void setVbillstatus (java.lang.Integer newVbillstatus ) {
			setAttributeValue(VBILLSTATUS, newVbillstatus);
		}
	public UFBoolean getIsinitial()
	   {
	      return (UFBoolean)getAttributeValue("isinitial");
	    }
	   
	 
	public void setIsinitial(UFBoolean newIsinitial)
	   {
	     setAttributeValue("isinitial", newIsinitial);
	   }
	/**
	 * 属性billmaketime的Getter方法.属性名：制单时间
	 * 创建日期:
	 * @return nc.vo.pub.lang.UFDateTime
	 */
	public nc.vo.pub.lang.UFDateTime getBillmaketime () {
		return (nc.vo.pub.lang.UFDateTime)getAttributeValue("billmaketime");
	}   
	/**
	 * 属性billmaketime的Setter方法.属性名：制单时间
	 * 创建日期:
	 * @param newBillmaketime nc.vo.pub.lang.UFDateTime
	 */
	public void setBillmaketime (nc.vo.pub.lang.UFDateTime newBillmaketime ) {
	 	setAttributeValue("billmaketime", newBillmaketime);
	} 	  
	
	public String getBillmaker () {
		return (String)getAttributeValue(BILLMAKER);
	}   
	public void setBillmaker (String billmaker ) {
		setAttributeValue(BILLMAKER, billmaker);
	} 	  
	/**
	 * 属性approver的Getter方法.属性名：审批人
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getApprover () {
		return (java.lang.String)getAttributeValue("approver");
	}   
	/**
	 * 属性approver的Setter方法.属性名：审批人
	 * 创建日期:
	 * @param newApprover java.lang.String
	 */
	public void setApprover (java.lang.String newApprover ) {
		setAttributeValue("approver", newApprover);
	} 	  
	
	public java.lang.String getPk_billtypeid () {
		return (java.lang.String)getAttributeValue("pk_billtypeid");
	}   
	public void setPk_billtypeid (java.lang.String pk_billtypeid ) {
		setAttributeValue("pk_billtypeid", pk_billtypeid);
	} 	  
	/**
	 * 属性approver的Setter方法.属性名：审批人
	 * 创建日期:
	 * @param newApprover java.lang.String
	 */
	public void setRemark (java.lang.String newRemark ) {
	 	setAttributeValue("remark", newRemark);
	} 	
	public java.lang.String getRemark () {
		return (java.lang.String)getAttributeValue("remark");
	}   
	
	public nc.vo.pub.lang.UFDate getApprovedate () {
		return (nc.vo.pub.lang.UFDate)getAttributeValue("approvedate");
	}   
	/**
	 * 属性approvedate的Setter方法.属性名：审批日期
	 * 创建日期:
	 * @param newApprovedate nc.vo.pub.lang.UFDate
	 */
	public void setApprovedate (nc.vo.pub.lang.UFDate newApprovedate ) {
	 	setAttributeValue("approvedate", newApprovedate);
	} 	  
	/**
	 * 属性approvenote的Getter方法.属性名：审批批语
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getApprovenote () {
		return (java.lang.String)getAttributeValue("approvenote");
	}   
	/**
	 * 属性approvenote的Setter方法.属性名：审批批语
	 * 创建日期:
	 * @param newApprovenote java.lang.String
	 */
	public void setApprovenote (java.lang.String newApprovenote ) {
	 	setAttributeValue("approvenote", newApprovenote);
	}
	/**
	 * 属性creator的Getter方法.属性名：创建人
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getCreator () {
		return (java.lang.String)getAttributeValue("creator");
	}   
	/**
	 * 属性creator的Setter方法.属性名：创建人
	 * 创建日期:
	 * @param newCreator java.lang.String
	 */
	public void setCreator (java.lang.String newCreator ) {
	 	setAttributeValue("creator", newCreator);
	} 	  
	/**
	 * 属性creationtime的Getter方法.属性名：创建时间
	 * 创建日期:
	 * @return nc.vo.pub.lang.UFDateTime
	 */
	public nc.vo.pub.lang.UFDateTime getCreationtime () {
		return (nc.vo.pub.lang.UFDateTime)getAttributeValue("creationtime");
	}   
	/**
	 * 属性creationtime的Setter方法.属性名：创建时间
	 * 创建日期:
	 * @param newCreationtime nc.vo.pub.lang.UFDateTime
	 */
	public void setCreationtime (nc.vo.pub.lang.UFDateTime newCreationtime ) {
	 	setAttributeValue("creationtime", newCreationtime);
	} 	  
	/**
	 * 属性modifier的Getter方法.属性名：最后修改人
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getModifier () {
		return (java.lang.String)getAttributeValue("modifier");
	}   
	/**
	 * 属性modifier的Setter方法.属性名：最后修改人
	 * 创建日期:
	 * @param newModifier java.lang.String
	 */
	public void setModifier (java.lang.String newModifier ) {
	 	setAttributeValue("modifier", newModifier);
	} 	  
	/**
	 * 属性modifiedtime的Getter方法.属性名：最后修改时间
	 * 创建日期:
	 * @return nc.vo.pub.lang.UFDateTime
	 */
	public nc.vo.pub.lang.UFDateTime getModifiedtime () {
		return (nc.vo.pub.lang.UFDateTime)getAttributeValue("modifiedtime");
	}   
	/**
	 * 属性modifiedtime的Setter方法.属性名：最后修改时间
	 * 创建日期:
	 * @param newModifiedtime nc.vo.pub.lang.UFDateTime
	 */
	public void setModifiedtime (nc.vo.pub.lang.UFDateTime newModifiedtime ) {
	 	setAttributeValue("modifiedtime", newModifiedtime);
	} 	  
	/**
	 * 属性billmakedate的Getter方法.属性名：制单日期
	 * 创建日期:
	 * @return nc.vo.pub.lang.UFDate
	 */
	public nc.vo.pub.lang.UFDate getBillmakedate () {
		return (nc.vo.pub.lang.UFDate)getAttributeValue("billmakedate");
	}   
	/**
	 * 属性billmakedate的Setter方法.属性名：制单日期
	 * 创建日期:
	 * @param newBillmakedate nc.vo.pub.lang.UFDate
	 */
	public void setBillmakedate (nc.vo.pub.lang.UFDate newBillmakedate ) {
	 	setAttributeValue("billmakedate", newBillmakedate);
	} 	  
	/**
	 * 属性pk_billtypecode的Getter方法.属性名：单据类型
	 * 创建日期:
	 * @return java.lang.String
	 */
	public java.lang.String getPk_billtypecode () {
		return (java.lang.String)getAttributeValue("pk_billtypecode");
	}   
	/**
	 * 属性pk_billtypecode的Setter方法.属性名：单据类型
	 * 创建日期:
	 * @param newPk_billtypecode java.lang.String
	 */
	public void setPk_billtypecode (java.lang.String newPk_billtypecode ) {
	 	setAttributeValue("pk_billtypecode", newPk_billtypecode);
	} 	
	/**
	 * 到期日期
	 */
	public static final String ENDDATE = "enddate";
	/**
	 * 自定义项8
	 */
	public static final String VDEF8 = "vdef8";;
	/**
	 * 自定义项9
	 */
	public static final String VDEF9 = "vdef9";;
	/**
	 * 组织本币金额
	 */
	public static final String OLCMONEY = "olcmoney";;
	/**
	 * 集团本币金额
	 */
	public static final String GLCMOENY = "glcmoeny";;
	/**
	 * 全局本机金额
	 */
	public static final String GLLMOENY = "gllmoeny";;
	/**
	 * 发行银行
	 */
	public static final String ISSUEBANK = "issuebank";;
	/**
	 * 赎回状态
	 */
	public static final String BILLSTATUS = "billstatus";;
	/**
	 * 收款账户
	 */
	public static final String GATHERINGACCOUNT = "gatheringaccount";;
	/**
	 * 理财账户
	 */
	public static final String INVESTACCOUNT = "investaccount";;
	/**
	 * 赎回日期
	 */
	public UFDate redeemdate;
	/**
	 * 赎回金额
	 */
	public static final String REDEEMMONEY = "redeemmoney";;
	/**
	 * 利率天数
	 */
	public static final String INTERESTDAY = "interestday";;
	/**
	 * 预期收益率
	 */
	public static final String EXPECTEDRATE = "expectedrate";;
	/**
	 * 上次赎回日期
	 */
	public UFDate lastdate;
	/**
	 * 上次收益
	 */
	public static final String LASTMONEY = "lastmoney";;
	/**
	 * 赎回计划
	 */
	public static final String REDEEMPLAN = "redeemplan";;
	/**
	 * 到账日期
	 */
	public UFDate incomedate;
	/**
	 * 收益税率
	 */
	public static final String INCOMERATE = "incomerate";;
	/**
	 * 收益税额
	 */
	public static final String INCOMEMONEY = "incomemoney";;
	/**
	 * 实际与预期差额
	 */
	public static final String BALANCE = "balance";
	public static final String ISINITIAL = "isinitial";
	public static final String OLCMNY = "olcmny";
	public static final String GLCMNY = "glcmny";
	public static final String GLLCMNY = "gllcmny";
	/**
	 * 时间戳
	 */
	public UFDateTime ts;
	
	public java.lang.String getVbillno() {
		return (java.lang.String) getAttributeValue("vbillno");
	}

	
	public void setVbillno(java.lang.String newVbillno) {
		setAttributeValue("vbillno", newVbillno);
	}
	public java.lang.String getVbilltype() {
		return (java.lang.String) getAttributeValue("vbilltype");
	}

	
	public void setVbilltype(java.lang.String newVbilltype) {
		setAttributeValue("vbilltype", newVbilltype);
	}
	
	
	public UFDate getEnddate() {
		return (UFDate) getAttributeValue(ENDDATE);
	}

	
	public void setEnddate(UFDate enddate) {
		setAttributeValue(ENDDATE, enddate);
	}

	/**
	 * 属性productcode的Getter方法.属性名：协议编号 创建日期:
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getProductname() {
		return (java.lang.String) getAttributeValue("productname");
	}

	/**
	 * 属性productcode的Setter方法.属性名：协议编号 创建日期:
	 * 
	 * @param productcode
	 *            java.lang.String
	 */
	public void setProductname(java.lang.String newProductname) {
		setAttributeValue("productname", newProductname);
	}
	
	public java.lang.String getInvestvariety() {
		return (java.lang.String) getAttributeValue(INVESTVARIETY);
	}
	
	public void setInvestvariety(java.lang.String investvariety) {
		setAttributeValue(INVESTVARIETY, investvariety);
	}
	
	/**
	 * 属性productcode的Getter方法.属性名：协议编号 创建日期:
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getProductcode() {
		return (java.lang.String) getAttributeValue("productcode");
	}

	/**
	 * 属性productcode的Setter方法.属性名：协议编号 创建日期:
	 * 
	 * @param productcode
	 *            java.lang.String
	 */
	public void setProductcode(java.lang.String newProductcode) {
		setAttributeValue("productcode", newProductcode);
	}
	



	/**
	 * 属性 vdef8的Getter方法.属性名：自定义项8 创建日期:2018-9-3
	 * 
	 * @return java.lang.String
	 */
	public String getVdef8() {
		return (java.lang.String) this.getAttributeValue(InvestRedeemVO.VDEF8);
	}

	/**
	 * 属性vdef8的Setter方法.属性名：自定义项8 创建日期:2018-9-3
	 * 
	 * @param newVdef8
	 *            java.lang.String
	 */
	public void setVdef8(String vdef8) {
		this.setAttributeValue(InvestRedeemVO.VDEF8, vdef8);
	}

	/**
	 * 属性 vdef9的Getter方法.属性名：自定义项9 创建日期:2018-9-3
	 * 
	 * @return java.lang.String
	 */
	public String getVdef9() {
		return (java.lang.String) this.getAttributeValue(InvestRedeemVO.VDEF9);
	}

	/**
	 * 属性vdef9的Setter方法.属性名：自定义项9 创建日期:2018-9-3
	 * 
	 * @param newVdef9
	 *            java.lang.String
	 */
	public void setVdef9(String vdef9) {
		this.setAttributeValue(InvestRedeemVO.VDEF9, vdef9);
	}

	/**
	 * 属性 olcmoney的Getter方法.属性名：组织本币金额 创建日期:2018-9-3
	 * 
	 * @return nc.vo.pub.lang.UFDouble
	 */
	public UFDouble getOlcmoney() {
		return (nc.vo.pub.lang.UFDouble) this
				.getAttributeValue(InvestRedeemVO.OLCMONEY);
	}

	/**
	 * 属性olcmoney的Setter方法.属性名：组织本币金额 创建日期:2018-9-3
	 * 
	 * @param newOlcmoney
	 *            nc.vo.pub.lang.UFDouble
	 */
	public void setOlcmoney(String olcmoney) {
		this.setAttributeValue(InvestRedeemVO.OLCMONEY, olcmoney);
	}
	
	/**
	 * 属性 glcmoeny的Getter方法.属性名：持有金额 创建日期:2018-9-3
	 * 
	 * @return nc.vo.pub.lang.UFDouble
	 */
	public UFDouble getHoldmoney() {
		return (nc.vo.pub.lang.UFDouble) this
				.getAttributeValue(InvestRedeemVO.HOLDMONEY);
	}

	/**
	 * 属性glcmoeny的Setter方法.属性名：持有金额 创建日期:2018-9-3
	 * 
	 * @param newGlcmoeny
	 *            nc.vo.pub.lang.UFDouble
	 */
	public void setHoldmoney(String holdmoney) {
		this.setAttributeValue(InvestRedeemVO.HOLDMONEY, holdmoney);
	}

	/**
	 * 属性 glcmoeny的Getter方法.属性名：集团本币金额 创建日期:2018-9-3
	 * 
	 * @return nc.vo.pub.lang.UFDouble
	 */
	public UFDouble getGlcmoeny() {
		return (nc.vo.pub.lang.UFDouble) this
				.getAttributeValue(InvestRedeemVO.GLCMOENY);
	}

	/**
	 * 属性glcmoeny的Setter方法.属性名：集团本币金额 创建日期:2018-9-3
	 * 
	 * @param newGlcmoeny
	 *            nc.vo.pub.lang.UFDouble
	 */
	public void setGlcmoeny(String glcmoeny) {
		this.setAttributeValue(InvestRedeemVO.GLCMOENY, glcmoeny);
	}

	/**
	 * 属性 gllmoeny的Getter方法.属性名：全局本机金额 创建日期:2018-9-3
	 * 
	 * @return java.lang.String
	 */
	public UFDouble getGllmoeny() {
		return (UFDouble) this
				.getAttributeValue(InvestRedeemVO.GLLMOENY);
	}

	/**
	 * 属性gllmoeny的Setter方法.属性名：全局本机金额 创建日期:2018-9-3
	 * 
	 * @param newGllmoeny
	 *            java.lang.String
	 */
	public void setGllmoeny(UFDouble gllmoeny) {
		this.setAttributeValue(InvestRedeemVO.GLLMOENY, gllmoeny);
	}

	/**
	 * 属性 issuebank的Getter方法.属性名：发行银行 创建日期:2018-9-3
	 * 
	 * @return nc.vo.bd.banktype.BankTypeVO
	 */
	public String getIssuebank() {
		return (String) this.getAttributeValue(InvestRedeemVO.ISSUEBANK);
	}

	/**
	 * 属性issuebank的Setter方法.属性名：发行银行 创建日期:2018-9-3
	 * 
	 * @param newIssuebank
	 *            nc.vo.bd.banktype.BankTypeVO
	 */
	public void setIssuebank(String issuebank) {
		this.setAttributeValue(InvestRedeemVO.ISSUEBANK, issuebank);
	}

	/**
	 * 属性 billstatus的Getter方法.属性名：赎回状态 创建日期:2018-9-3
	 * 
	 * @return nc.vo.ifm.RedeemStatusEnum
	 */
	public Integer getBillstatus() {
		return (Integer) this.getAttributeValue(InvestRedeemVO.BILLSTATUS);
	}

	/**
	 * 属性billstatus的Setter方法.属性名：赎回状态 创建日期:2018-9-3
	 * 
	 * @param newBillstatus
	 *            nc.vo.ifm.RedeemStatusEnum
	 */
	public void setBillstatus(Integer billstatus) {
		this.setAttributeValue(InvestRedeemVO.BILLSTATUS, billstatus);
	}

	/**
	 * 属性 gatheringaccount的Getter方法.属性名：收款账户 创建日期:2018-9-3
	 * 
	 * @return nc.vo.bd.bankaccount.BankAccSubVO
	 */
	public String getGatheringaccount() {
		return (String) this.getAttributeValue(InvestRedeemVO.GATHERINGACCOUNT);
	}

	/**
	 * 属性gatheringaccount的Setter方法.属性名：收款账户 创建日期:2018-9-3
	 * 
	 * @param newGatheringaccount
	 *            nc.vo.bd.bankaccount.BankAccSubVO
	 */
	public void setGatheringaccount(String gatheringaccount) {
		this.setAttributeValue(InvestRedeemVO.GATHERINGACCOUNT,
				gatheringaccount);
	}

	/**
	 * 属性 investaccount的Getter方法.属性名：理财账户 创建日期:2018-9-3
	 * 
	 * @return nc.vo.bd.bankaccount.BankAccSubVO
	 */
	public String getInvestaccount() {
		return (String) this.getAttributeValue(InvestRedeemVO.INVESTACCOUNT);
	}

	/**
	 * 属性investaccount的Setter方法.属性名：理财账户 创建日期:2018-9-3
	 * 
	 * @param newInvestaccount
	 *            nc.vo.bd.bankaccount.BankAccSubVO
	 */
	public void setInvestaccount(String investaccount) {
		this.setAttributeValue(InvestRedeemVO.INVESTACCOUNT, investaccount);
	}

	/**
	 * 属性 redeemdate的Getter方法.属性名：赎回日期 创建日期:2018-9-3
	 * 
	 * @return nc.vo.pub.lang.UFDate
	 */
	public UFDate getRedeemdate() {
		return (nc.vo.pub.lang.UFDate) this.getAttributeValue("redeemdate");
	}

	/**
	 * 属性redeemdate的Setter方法.属性名：赎回日期 创建日期:2018-9-3
	 * 
	 * @param newRedeemdate
	 *            nc.vo.pub.lang.UFDate
	 */
	public void setRedeemdate(UFDate redeemdate) {
		this.setAttributeValue("redeemdate", redeemdate);
	}

	/**
	 * 属性 redeemmoney的Getter方法.属性名：赎回金额 创建日期:2018-9-3
	 * 
	 * @return nc.vo.pub.lang.UFDouble
	 */
	public UFDouble getRedeemmoney() {
		return (nc.vo.pub.lang.UFDouble) this
				.getAttributeValue(InvestRedeemVO.REDEEMMONEY);
	}

	/**
	 * 属性redeemmoney的Setter方法.属性名：赎回金额 创建日期:2018-9-3
	 * 
	 * @param newRedeemmoney
	 *            nc.vo.pub.lang.UFDouble
	 */
	public void setRedeemmoney(String redeemmoney) {
		this.setAttributeValue(InvestRedeemVO.REDEEMMONEY, redeemmoney);
	}

	/**
	 * 属性 interestday的Getter方法.属性名：利率天数 创建日期:2018-9-3
	 * 
	 * @return java.lang.Integer
	 */
	public Integer getInterestday() {
		return (java.lang.Integer) this
				.getAttributeValue(InvestRedeemVO.INTERESTDAY);
	}

	/**
	 * 属性interestday的Setter方法.属性名：利率天数 创建日期:2018-9-3
	 * 
	 * @param newInterestday
	 *            java.lang.Integer
	 */
	public void setInterestday(Integer interestday) {
		this.setAttributeValue(InvestRedeemVO.INTERESTDAY, interestday);
	}

	/**
	 * 属性 expectedrate的Getter方法.属性名：预期收益率 创建日期:2018-9-3
	 * 
	 * @return nc.vo.pub.lang.UFDouble
	 */
	public UFDouble getExpectedrate() {
		return (nc.vo.pub.lang.UFDouble) this
				.getAttributeValue(InvestRedeemVO.EXPECTEDRATE);
	}

	/**
	 * 属性expectedrate的Setter方法.属性名：预期收益率 创建日期:2018-9-3
	 * 
	 * @param newExpectedrate
	 *            nc.vo.pub.lang.UFDouble
	 */
	public void setExpectedrate(String expectedrate) {
		this.setAttributeValue(InvestRedeemVO.EXPECTEDRATE, expectedrate);
	}

	/**
	 * 属性 lastdate的Getter方法.属性名：上次赎回日期 创建日期:2018-9-3
	 * 
	 * @return nc.vo.pub.lang.UFDate
	 */
	public UFDate getLastdate() {
		return (nc.vo.pub.lang.UFDate) this.getAttributeValue("lastdate");
	}

	/**
	 * 属性lastdate的Setter方法.属性名：上次赎回日期 创建日期:2018-9-3
	 * 
	 * @param newLastdate
	 *            nc.vo.pub.lang.UFDate
	 */
	public void setLastdate(UFDate lastdate) {
		this.setAttributeValue("lastdate", lastdate);
	}

	/**
	 * 属性 lastmoney的Getter方法.属性名：上次收益 创建日期:2018-9-3
	 * 
	 * @return nc.vo.pub.lang.UFDouble
	 */
	public UFDouble getLastmoney() {
		return (nc.vo.pub.lang.UFDouble) this
				.getAttributeValue(InvestRedeemVO.LASTMONEY);
	}

	/**
	 * 属性lastmoney的Setter方法.属性名：上次收益 创建日期:2018-9-3
	 * 
	 * @param newLastmoney
	 *            nc.vo.pub.lang.UFDouble
	 */
	public void setLastmoney(String lastmoney) {
		this.setAttributeValue(InvestRedeemVO.LASTMONEY, lastmoney);
	}

	/**
	 * 属性 redeemplan的Getter方法.属性名：赎回计划 创建日期:2018-9-3
	 * 
	 * @return java.lang.String
	 */
	public String getRedeemplan() {
		return (java.lang.String) this
				.getAttributeValue(InvestRedeemVO.REDEEMPLAN);
	}

	/**
	 * 属性redeemplan的Setter方法.属性名：赎回计划 创建日期:2018-9-3
	 * 
	 * @param newRedeemplan
	 *            java.lang.String
	 */
	public void setRedeemplan(String redeemplan) {
		this.setAttributeValue(InvestRedeemVO.REDEEMPLAN, redeemplan);
	}

	/**
	 * 属性 incomedate的Getter方法.属性名：到账日期 创建日期:2018-9-3
	 * 
	 * @return nc.vo.pub.lang.UFDate
	 */
	public UFDate getIncomedate() {
		return (nc.vo.pub.lang.UFDate) this.getAttributeValue("incomedate");
	}

	/**
	 * 属性 pk_group的Getter方法.属性名：所属集团 创建日期:2018-8-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getPk_group() {
		return (java.lang.String) getAttributeValue(PK_GROUP);
	}

	public void setPk_group(java.lang.String newPk_group) {
		setAttributeValue(PK_GROUP, newPk_group);
	}

	public java.lang.String getPk_redeem() {
		return (java.lang.String) getAttributeValue(PK_REDEEM);
	}

	public void setPk_redeem(java.lang.String newPk_redeem) {
		setAttributeValue(PK_REDEEM, newPk_redeem);
	}
	
	public java.lang.String getPk_apply() {
		return (java.lang.String) getAttributeValue(PK_APPLY);
	}

	public void setPk_apply(java.lang.String newPk_apply) {
		setAttributeValue(PK_APPLY, newPk_apply);
	}

	/**
	 * 属性incomedate的Setter方法.属性名：到账日期 创建日期:2018-9-3
	 * 
	 * @param newIncomedate
	 *            nc.vo.pub.lang.UFDate
	 */
	public void setIncomedate(UFDate incomedate) {
		this.setAttributeValue("incomedate", incomedate);
	}

	/**
	 * 属性 incomerate的Getter方法.属性名：收益税率 创建日期:2018-9-3
	 * 
	 * @return nc.vo.pub.lang.UFDouble
	 */
	public UFDouble getIncomerate() {
		return (nc.vo.pub.lang.UFDouble) this
				.getAttributeValue(InvestRedeemVO.INCOMERATE);
	}

	/**
	 * 属性incomerate的Setter方法.属性名：收益税率 创建日期:2018-9-3
	 * 
	 * @param newIncomerate
	 *            nc.vo.pub.lang.UFDouble
	 */
	public void setIncomerate(String incomerate) {
		this.setAttributeValue(InvestRedeemVO.INCOMERATE, incomerate);
	}

	/**
	 * 属性 incomemoney的Getter方法.属性名：收益税额 创建日期:2018-9-3
	 * 
	 * @return nc.vo.pub.lang.UFDouble
	 */
	public UFDouble getIncomemoney() {
		return (nc.vo.pub.lang.UFDouble) this.getAttributeValue("incomemoney");
	}

	/**
	 * 属性incomemoney的Setter方法.属性名：收益税额 创建日期:2018-9-3
	 * 
	 * @param newIncomemoney
	 *            nc.vo.pub.lang.UFDouble
	 */
	public void setIncomemoney(String incomemoney) {
		this.setAttributeValue(InvestRedeemVO.INCOMEMONEY, incomemoney);
	}

	/**
	 * 属性 pk_org的Getter方法.属性名：所属组织 创建日期:2018-8-27
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getPk_org() {
		return (java.lang.String) getAttributeValue(PK_ORG);
	}

	public void setPk_org(java.lang.String newPk_org) {
		setAttributeValue(PK_ORG, newPk_org);
	}
	public java.lang.String getPk_org_v() {
		return (java.lang.String) getAttributeValue(PK_ORG_V);
	}
	
	public void setPk_org_v(java.lang.String newPk_org_v) {
		setAttributeValue(PK_ORG_V, newPk_org_v);
	}

	/**
	 * 属性 balance的Getter方法.属性名：实际与预期差额 创建日期:2018-9-3
	 * 
	 * @return nc.vo.pub.lang.UFDouble
	 */
	public UFDouble getBalance() {
		return (nc.vo.pub.lang.UFDouble) this
				.getAttributeValue(InvestRedeemVO.BALANCE);
	}

	/**
	 * 属性balance的Setter方法.属性名：实际与预期差额 创建日期:2018-9-3
	 * 
	 * @param newBalance
	 *            nc.vo.pub.lang.UFDouble
	 */
	public void setBalance(String balance) {
		this.setAttributeValue(InvestRedeemVO.BALANCE, balance);
	}

	/**
	 * 属性 生成时间戳的Getter方法.属性名：时间戳 创建日期:2018-9-3
	 * 
	 * @return nc.vo.pub.lang.UFDateTime
	 */
	public UFDateTime getTs() {
		return this.ts;
	}

	/**
	 * 属性生成时间戳的Setter方法.属性名：时间戳 创建日期:2018-9-3
	 * 
	 * @param newts
	 *            nc.vo.pub.lang.UFDateTime
	 */
	public void setTs(UFDateTime ts) {
		this.ts = ts;
	}

	@Override
	public IVOMeta getMetaData() {
		return VOMetaFactory.getInstance().getVOMeta("ifm.redeem");
	}

	@Override
	public CircularlyAccessibleValueObject[] getAllChildrenVO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CircularlyAccessibleValueObject[] getChildrenVO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SuperVO[] getChildVOsByParentId(String paramString1,
			String paramString2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDefaultTableCode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap getHmEditingVOs() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getParentId(SuperVO paramSuperVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CircularlyAccessibleValueObject getParentVO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getTableCodes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getTableNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CircularlyAccessibleValueObject[] getTableVO(String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setParentId(SuperVO paramSuperVO, String paramString) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setParentVO(
			CircularlyAccessibleValueObject paramCircularlyAccessibleValueObject) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTableVO(
			String paramString,
			CircularlyAccessibleValueObject[] paramArrayOfCircularlyAccessibleValueObject) {
		// TODO Auto-generated method stub

	}
}
