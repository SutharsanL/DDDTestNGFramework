package com.vcentry.hrm.testcase;

import org.testng.annotations.Test;

import com.vcentry.hrm.utils.CommonFunctions;

public class AddDeleteEmp extends CommonFunctions{
  @Test(priority =3)
  public void addEmp() throws InterruptedException {
	  home.navigateToEmpList()
	.addEmp("Rocky", "bhai", "rockybhai", "test@1234");  
  }
  @Test(priority = 4)
  public void deleteEmp() throws InterruptedException {
	  home.searchEmployee("Rocky", "bhai")
	  .deleteEmployee("Rocky");
  }
}
