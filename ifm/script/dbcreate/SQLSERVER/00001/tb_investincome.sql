/* tablename: ifm_income */
create table ifm_income (
pk_income nchar(20) not null 
/*����*/,
vbillno nvarchar(40) null 
/*�깺���*/,
vbillstatus int null 
/*����״̬*/,
pk_group nvarchar(20) null default '~' 
/*����*/,
pk_org nvarchar(20) null default '~' 
/*������֯*/,
pk_org_v nvarchar(20) null default '~' 
/*������֯�汾*/,
pk_currtype nvarchar(20) null default '~' 
/*����*/,
pk_olccurr nvarchar(20) null default '~' 
/*��֯��λ��*/,
remark nvarchar(181) null 
/*��ע*/,
vdef1 nvarchar(101) null 
/*�Զ�����1*/,
vdef2 nvarchar(101) null 
/*�Զ�����2*/,
vdef3 nvarchar(101) null 
/*�Զ�����3*/,
vdef4 nvarchar(101) null 
/*�Զ�����4*/,
vdef5 nvarchar(101) null 
/*�Զ�����5*/,
vdef6 nvarchar(101) null 
/*�Զ�����6*/,
vdef7 nvarchar(101) null 
/*�Զ�����7*/,
vdef8 nvarchar(101) null 
/*�Զ�����8*/,
vdef9 nvarchar(101) null 
/*�Զ�����9*/,
vdef10 nvarchar(101) null 
/*�Զ�����10*/,
vdef11 nvarchar(101) null 
/*�Զ�����11*/,
vdef12 nvarchar(101) null 
/*�Զ�����12*/,
vdef13 nvarchar(101) null 
/*�Զ�����13*/,
vdef14 nvarchar(101) null 
/*�Զ�����14*/,
vdef15 nvarchar(101) null 
/*�Զ�����15*/,
vdef16 nvarchar(101) null 
/*�Զ�����16*/,
vdef17 nvarchar(101) null 
/*�Զ�����17*/,
vdef18 nvarchar(101) null 
/*�Զ�����18*/,
vdef19 nvarchar(101) null 
/*�Զ�����19*/,
vdef20 nvarchar(101) null 
/*�Զ�����20*/,
olcrate decimal(15,8) null 
/*��֯���һ���*/,
olcmoeny decimal(28,8) null 
/*��֯���ҽ��*/,
glcrate decimal(15,8) null 
/*���ű��һ���*/,
glcmoeny decimal(28,8) null 
/*���ű��ҽ��*/,
gllcrate decimal(15,8) null 
/*ȫ�ֱ��һ���*/,
gllmoeny decimal(28,8) null 
/*ȫ�ֱ��ҽ��*/,
billmaker nvarchar(20) null default '~' 
/*�Ƶ���*/,
billmakedate nchar(19) null 
/*�Ƶ�����*/,
billmaketime nchar(19) null 
/*�Ƶ�ʱ��*/,
approver nvarchar(20) null default '~' 
/*������*/,
approvedate nchar(19) null 
/*��������*/,
approvenote nvarchar(1024) null 
/*��������*/,
creator nvarchar(20) null default '~' 
/*������*/,
creationtime nchar(19) null 
/*����ʱ��*/,
modifier nvarchar(20) null default '~' 
/*����޸���*/,
modifiedtime nchar(19) null 
/*����޸�ʱ��*/,
pk_busitype nvarchar(20) null default '~' 
/*ҵ������*/,
pk_billtypeid nvarchar(50) null 
/*������������*/,
pk_billtypecode nvarchar(50) null 
/*��������*/,
productcode nvarchar(20) null default '~' 
/*��Ʒ����*/,
productname nvarchar(50) null 
/*��Ʒ����*/,
issuebank nvarchar(20) null default '~' 
/*��������*/,
billstatus nvarchar(50) null 
/*����״̬*/,
settleaccount nvarchar(20) null default '~' 
/*�տ������˻�*/,
invest nvarchar(20) null default '~' 
/*�����˻�*/,
interestday int(10) null 
/*��Ϣ����*/,
expectedrate decimal(28,8) null 
/*Ԥ��������*/,
expectedmoney decimal(28,8) null 
/*Ԥ������*/,
enddate nchar(19) null 
/*��������*/,
actualmoeny decimal(28,8) null 
/*ʵ������*/,
incomerate decimal(28,8) null 
/*����˰��*/,
incomemoney decimal(28,8) null 
/*����˰��*/,
source int null 
/*��Դ*/,
incomefundplanpro nvarchar(40) null default '~' 
/*�����ʽ�ƻ���Ŀ*/,
taxfundplanpro nvarchar(40) null default '~' 
/*˰���ʽ�ƻ���Ŀ*/,
investvariety nvarchar(20) null default '~' 
/*Ͷ��Ʒ��*/,
incomedate nchar(19) null 
/*��������*/,
 constraint pk_ifm_income primary key (pk_income),
 ts char(19) null default convert(char(19),getdate(),20),
dr smallint null default 0
)
go
