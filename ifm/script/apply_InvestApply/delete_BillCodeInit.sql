DELETE FROM pub_bcr_candiattr WHERE pk_nbcr = '0001Z61000000002M56L';
DELETE FROM pub_bcr_elem WHERE pk_billcodebase in ( select pk_billcodebase from pub_bcr_RuleBase where nbcrcode = '3641' );
DELETE FROM pub_bcr_RuleBase WHERE nbcrcode = '3641';
DELETE FROM pub_bcr_nbcr WHERE pk_nbcr = '0001Z61000000002M56L';
DELETE FROM pub_bcr_OrgRela WHERE pk_billcodebase = '0001Z61000000002M56M';
DELETE FROM pub_bcr_RuleBase WHERE pk_billcodebase = '0001Z61000000002M56M';
DELETE FROM pub_bcr_elem WHERE pk_billcodeelem = '0001Z61000000002M56N';
DELETE FROM pub_bcr_elem WHERE pk_billcodeelem = '0001Z61000000002M56O';
DELETE FROM pub_bcr_elem WHERE pk_billcodeelem = '0001Z61000000002M56P';
