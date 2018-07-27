package com.test1;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test(priority=1)
  public void f() {
	  
	  System.out.println("in f()");
  }
  @Test(priority=2)
  public void abc() {
	  
	  System.out.println("in abc()");
  }
  @Test(priority=2)
  public void xyz() {
	  
	  System.out.println("in xyz()");
  }
  @Test(priority=4)
  public void xyztest() {
	  
	  System.out.println("in xyztest()");
	  
  }
}
