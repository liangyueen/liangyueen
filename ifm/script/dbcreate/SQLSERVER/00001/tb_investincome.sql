/* tablename: ifm_income */
create table ifm_income (
pk_income nchar(20) not null 
/*主键*/,
vbillno nvarchar(40) null 
/*申购编号*/,
vbillstatus int null 
/*审批状态*/,
pk_group nvarchar(20) null default '~' 
/*集团*/,
pk_org nvarchar(20) null default '~' 
/*财务组织*/,
pk_org_v nvarchar(20) null default '~' 
/*财务组织版本*/,
pk_currtype nvarchar(20) null default '~' 
/*币种*/,
pk_olccurr nvarchar(20) null default '~' 
/*组织本位币*/,
remark nvarchar(181) null 
/*备注*/,
vdef1 nvarchar(101) null 
/*自定义项1*/,
vdef2 nvarchar(101) null 
/*自定义项2*/,
vdef3 nvarchar(101) null 
/*自定义项3*/,
vdef4 nvarchar(101) null 
/*自定义项4*/,
vdef5 nvarchar(101) null 
/*自定义项5*/,
vdef6 nvarchar(101) null 
/*自定义项6*/,
vdef7 nvarchar(101) null 
/*自定义项7*/,
vdef8 nvarchar(101) null 
/*自定义项8*/,
vdef9 nvarchar(101) null 
/*自定义项9*/,
vdef10 nvarchar(101) null 
/*自定义项10*/,
vdef11 nvarchar(101) null 
/*自定义项11*/,
vdef12 nvarchar(101) null 
/*自定义项12*/,
vdef13 nvarchar(101) null 
/*自定义项13*/,
vdef14 nvarchar(101) null 
/*自定义项14*/,
vdef15 nvarchar(101) null 
/*自定义项15*/,
vdef16 nvarchar(101) null 
/*自定义项16*/,
vdef17 nvarchar(101) null 
/*自定义项17*/,
vdef18 nvarchar(101) null 
/*自定义项18*/,
vdef19 nvarchar(101) null 
/*自定义项19*/,
vdef20 nvarchar(101) null 
/*自定义项20*/,
olcrate decimal(15,8) null 
/*组织本币汇率*/,
olcmoeny decimal(28,8) null 
/*组织本币金额*/,
glcrate decimal(15,8) null 
/*集团本币汇率*/,
glcmoeny decimal(28,8) null 
/*集团本币金额*/,
gllcrate decimal(15,8) null 
/*全局本币汇率*/,
gllmoeny decimal(28,8) null 
/*全局本币金额*/,
billmaker nvarchar(20) null default '~' 
/*制单人*/,
billmakedate nchar(19) null 
/*制单日期*/,
billmaketime nchar(19) null 
/*制单时间*/,
approver nvarchar(20) null default '~' 
/*审批人*/,
approvedate nchar(19) null 
/*审批日期*/,
approvenote nvarchar(1024) null 
/*审批批语*/,
creator nvarchar(20) null default '~' 
/*创建人*/,
creationtime nchar(19) null 
/*创建时间*/,
modifier nvarchar(20) null default '~' 
/*最后修改人*/,
modifiedtime nchar(19) null 
/*最后修改时间*/,
pk_busitype nvarchar(20) null default '~' 
/*业务流程*/,
pk_billtypeid nvarchar(50) null 
/*单据类型主键*/,
pk_billtypecode nvarchar(50) null 
/*单据类型*/,
productcode nvarchar(20) null default '~' 
/*产品代码*/,
productname nvarchar(50) null 
/*产品名称*/,
issuebank nvarchar(20) null default '~' 
/*发行银行*/,
billstatus nvarchar(50) null 
/*单据状态*/,
gathering nvarchar(20) null default '~' 
/*收款银行账户*/,
investaccount nvarchar(20) null default '~' 
/*理财账户*/,
interestday int null 
/*利息天数*/,
expectedrate decimal(28,8) null 
/*预期收益率*/,
expectedmoney decimal(28,8) null 
/*预期收益*/,
enddate nchar(19) null 
/*到期日期*/,
actualmoeny decimal(28,8) null 
/*实际收益*/,
incomerate decimal(28,8) null 
/*收益税率*/,
incomemoney decimal(28,8) null 
/*收益税额*/,
source int null 
/*来源*/,
incomefundplanpro nvarchar(20) null default '~' 
/*收益资金计划项目*/,
taxfundplanpro nvarchar(20) null default '~' 
/*税额资金计划项目*/,
investvariety nvarchar(20) null default '~' 
/*投资品种*/,
gatheringdate nchar(19) null 
/*到账日期*/,
pk_srcbill nvarchar(50) null 
/*来源单据ID*/,
pk_srcbilltype nvarchar(20) null default '~' 
/*来源单据类型*/,
srcbilltypecode nvarchar(50) null default '~' 
/*来源单据类型编码*/,
srcbillno nvarchar(50) null 
/*来源单据号*/,
 constraint pk_ifm_income primary key (pk_income),
 ts char(19) null default convert(char(19),getdate(),20),
dr smallint null default 0
)
go

