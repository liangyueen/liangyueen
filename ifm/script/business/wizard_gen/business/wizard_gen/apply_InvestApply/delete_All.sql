DELETE FROM pub_bcr_candiattr WHERE pk_nbcr = '0001Z61000000002M56L';
DELETE FROM pub_bcr_elem WHERE pk_billcodebase in ( select pk_billcodebase from pub_bcr_RuleBase where nbcrcode = '3641' );
DELETE FROM pub_bcr_RuleBase WHERE nbcrcode = '3641';
DELETE FROM pub_bcr_nbcr WHERE pk_nbcr = '0001Z61000000002M56L';
DELETE FROM pub_bcr_OrgRela WHERE pk_billcodebase = '0001Z61000000002M56M';
DELETE FROM pub_bcr_RuleBase WHERE pk_billcodebase = '0001Z61000000002M56M';
DELETE FROM pub_bcr_elem WHERE pk_billcodeelem = '0001Z61000000002M56N';
DELETE FROM pub_bcr_elem WHERE pk_billcodeelem = '0001Z61000000002M56O';
DELETE FROM pub_bcr_elem WHERE pk_billcodeelem = '0001Z61000000002M56P';
DELETE FROM bd_billtype2 WHERE pk_billtypeid = '0001Z61000000002M568';
DELETE FROM bd_fwdbilltype WHERE pk_billtypeid = '0001Z61000000002M568';
DELETE FROM pub_function WHERE pk_billtype = '3641';
DELETE FROM pub_billaction WHERE pk_billtypeid = '0001Z61000000002M568';
DELETE FROM pub_billactiongroup WHERE pk_billtype = '3641';
DELETE FROM bd_billtype WHERE pk_billtypeid = '0001Z61000000002M568';
delete from temppkts;
DELETE FROM sm_rule_type WHERE pk_rule_type = null;
DELETE FROM sm_permission_res WHERE pk_permission_res = null;
DELETE FROM pub_billaction WHERE pk_billaction = '0001Z61000000002M569';
DELETE FROM pub_billaction WHERE pk_billaction = '0001Z61000000002M56A';
DELETE FROM pub_billaction WHERE pk_billaction = '0001Z61000000002M56B';
DELETE FROM pub_billaction WHERE pk_billaction = '0001Z61000000002M56C';
DELETE FROM pub_billaction WHERE pk_billaction = '0001Z61000000002M56D';
DELETE FROM pub_billaction WHERE pk_billaction = '0001Z61000000002M56E';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001Z61000000002M56F';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001Z61000000002M56G';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001Z61000000002M56H';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001Z61000000002M56I';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001Z61000000002M56J';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001Z61000000002M56K';
DELETE FROM pub_systemplate_base where pk_systemplate = '0001Z61000000002M567';
delete from pub_print_datasource where ctemplateid = '0001Z61000000002M502';
delete from pub_print_cell where ctemplateid = '0001Z61000000002M502';
delete from pub_print_line where ctemplateid = '0001Z61000000002M502';
delete from pub_print_variable where ctemplateid = '0001Z61000000002M502';
delete from pub_print_template where ctemplateid = '0001Z61000000002M502';
DELETE FROM pub_systemplate_base where pk_systemplate = '0001Z61000000002M501';
delete from pub_query_condition where pk_templet = '0001Z61000000002M4Y4';
delete from pub_query_templet where id = '0001Z61000000002M4Y4';
DELETE FROM pub_systemplate_base where pk_systemplate = '0001Z61000000002M4Y3';
delete from pub_billtemplet_b where pk_billtemplet = '0001Z61000000002M4W4';
delete from pub_billtemplet where pk_billtemplet = '0001Z61000000002M4W4';
DELETE FROM pub_billtemplet_t WHERE pk_billtemplet = '0001Z61000000002M4W4';
DELETE FROM sm_menuitemreg WHERE pk_menuitem = '0001Z61000000002M4W3';
DELETE FROM sm_funcregister WHERE cfunid = '0001Z61000000002M4W1';
DELETE FROM sm_paramregister WHERE pk_param = '0001Z61000000002M4W2';
