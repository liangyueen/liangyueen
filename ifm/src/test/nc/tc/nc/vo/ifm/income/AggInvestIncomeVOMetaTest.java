package nc.tc.nc.vo.ifm.income;
import org.testng.*;
import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;
import java.util.ArrayList;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import jxl.read.biff.BiffException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.yonyou.uat.util.ExcelDataProvider;
import com.yonyou.uat.util.DBDataProvider;
import com.yonyou.uat.dbmanagement.DBManage;
import com.yonyou.uat.dbmanagement.QueryInfoVO;
import nc.vo.ifm.income.AggInvestIncomeVOMeta;
import nc.bs.framework.common.NCLocator;
import com.yonyou.uat.framework.BaseTestCase;
public class AggInvestIncomeVOMetaTest extends BaseTestCase {
  AggInvestIncomeVOMeta aggInvestIncomeVOMeta=null;
  DBManage dbManage=null;
  
  @BeforeClass 
  public void BeforeClass(){
    aggInvestIncomeVOMeta=NCLocator.getInstance().lookup(AggInvestIncomeVOMeta.class);
  }
  
  @AfterClass 
  public void AfterClass(){
  }
  
  @BeforeMethod 
  public void BeforeMethod(){
    List<String> tableList=new ArrayList<String>();
    tableList.add("pub_wfexptlog");
    dbManage=new DBManage();
    dbManage.setTableList(tableList);
    dbManage.tableExport();
  }
  
  @AfterMethod 
  public void AfterMethod(){
    dbManage.tableRollBack();
  }
}
