DELETE FROM pub_bcr_candiattr WHERE pk_nbcr = '0001Z61000000002M5PZ';
DELETE FROM pub_bcr_elem WHERE pk_billcodebase in ( select pk_billcodebase from pub_bcr_RuleBase where nbcrcode = '3643' );
DELETE FROM pub_bcr_RuleBase WHERE nbcrcode = '3643';
DELETE FROM pub_bcr_nbcr WHERE pk_nbcr = '0001Z61000000002M5PZ';
DELETE FROM pub_bcr_OrgRela WHERE pk_billcodebase = '0001Z61000000002M5Q0';
DELETE FROM pub_bcr_RuleBase WHERE pk_billcodebase = '0001Z61000000002M5Q0';
DELETE FROM pub_bcr_elem WHERE pk_billcodeelem = '0001Z61000000002M5Q1';
DELETE FROM pub_bcr_elem WHERE pk_billcodeelem = '0001Z61000000002M5Q2';
DELETE FROM pub_bcr_elem WHERE pk_billcodeelem = '0001Z61000000002M5Q3';