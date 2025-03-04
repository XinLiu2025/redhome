/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 12 15:25:46 GMT 2025
 */

package com.rems.boot.model.req;

import org.junit.Test;
import static org.junit.Assert.*;
import com.rems.boot.model.req.ModifyPasswordReq;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ModifyPasswordReq_ESTest extends ModifyPasswordReq_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ModifyPasswordReq modifyPasswordReq0 = new ModifyPasswordReq();
      Integer integer0 = new Integer(0);
      modifyPasswordReq0.setUserId(integer0);
      Integer integer1 = modifyPasswordReq0.getUserId();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ModifyPasswordReq modifyPasswordReq0 = new ModifyPasswordReq();
      Integer integer0 = new Integer(59);
      modifyPasswordReq0.setUserId(integer0);
      Integer integer1 = modifyPasswordReq0.getUserId();
      assertEquals(59, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ModifyPasswordReq modifyPasswordReq0 = new ModifyPasswordReq();
      Integer integer0 = new Integer((-339));
      modifyPasswordReq0.setUserId(integer0);
      Integer integer1 = modifyPasswordReq0.getUserId();
      assertEquals((-339), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ModifyPasswordReq modifyPasswordReq0 = new ModifyPasswordReq();
      modifyPasswordReq0.setPassword("ModifyPasswordReq(userId=null, oldPassword=null, password=null)");
      String string0 = modifyPasswordReq0.getPassword();
      assertEquals("ModifyPasswordReq(userId=null, oldPassword=null, password=null)", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ModifyPasswordReq modifyPasswordReq0 = new ModifyPasswordReq();
      modifyPasswordReq0.setOldPassword("]");
      String string0 = modifyPasswordReq0.getOldPassword();
      assertEquals("]", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ModifyPasswordReq modifyPasswordReq0 = new ModifyPasswordReq();
      modifyPasswordReq0.setOldPassword("");
      String string0 = modifyPasswordReq0.getOldPassword();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ModifyPasswordReq modifyPasswordReq0 = new ModifyPasswordReq();
      boolean boolean0 = modifyPasswordReq0.canEqual(modifyPasswordReq0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ModifyPasswordReq modifyPasswordReq0 = new ModifyPasswordReq();
      Integer integer0 = new Integer(59);
      boolean boolean0 = modifyPasswordReq0.canEqual(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ModifyPasswordReq modifyPasswordReq0 = new ModifyPasswordReq();
      String string0 = modifyPasswordReq0.getPassword();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ModifyPasswordReq modifyPasswordReq0 = new ModifyPasswordReq();
      Integer integer0 = modifyPasswordReq0.getUserId();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ModifyPasswordReq modifyPasswordReq0 = new ModifyPasswordReq();
      String string0 = modifyPasswordReq0.getOldPassword();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ModifyPasswordReq modifyPasswordReq0 = new ModifyPasswordReq();
      ModifyPasswordReq modifyPasswordReq1 = new ModifyPasswordReq();
      modifyPasswordReq0.setPassword("|=8;4Vcv>z:c.LWpi");
      assertFalse(modifyPasswordReq0.equals((Object)modifyPasswordReq1));
      
      modifyPasswordReq1.setPassword("|=8;4Vcv>z:c.LWpi");
      boolean boolean0 = modifyPasswordReq0.equals(modifyPasswordReq1);
      assertTrue(modifyPasswordReq1.equals((Object)modifyPasswordReq0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ModifyPasswordReq modifyPasswordReq0 = new ModifyPasswordReq();
      modifyPasswordReq0.setOldPassword("]");
      ModifyPasswordReq modifyPasswordReq1 = new ModifyPasswordReq();
      modifyPasswordReq1.setPassword("ModifyPasswordReq(userId=null, oldPassword=null, password=null)");
      modifyPasswordReq1.setOldPassword("]");
      boolean boolean0 = modifyPasswordReq0.equals(modifyPasswordReq1);
      assertFalse(modifyPasswordReq1.equals((Object)modifyPasswordReq0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ModifyPasswordReq modifyPasswordReq0 = new ModifyPasswordReq();
      ModifyPasswordReq modifyPasswordReq1 = new ModifyPasswordReq();
      assertTrue(modifyPasswordReq1.equals((Object)modifyPasswordReq0));
      
      modifyPasswordReq1.setPassword("|=8;4Vcv>z:c.LWpi");
      boolean boolean0 = modifyPasswordReq1.equals(modifyPasswordReq0);
      assertFalse(modifyPasswordReq1.equals((Object)modifyPasswordReq0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ModifyPasswordReq modifyPasswordReq0 = new ModifyPasswordReq();
      ModifyPasswordReq modifyPasswordReq1 = new ModifyPasswordReq();
      assertTrue(modifyPasswordReq1.equals((Object)modifyPasswordReq0));
      
      modifyPasswordReq1.setOldPassword("");
      boolean boolean0 = modifyPasswordReq0.equals(modifyPasswordReq1);
      assertFalse(modifyPasswordReq1.equals((Object)modifyPasswordReq0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ModifyPasswordReq modifyPasswordReq0 = new ModifyPasswordReq();
      ModifyPasswordReq modifyPasswordReq1 = new ModifyPasswordReq();
      assertTrue(modifyPasswordReq1.equals((Object)modifyPasswordReq0));
      
      modifyPasswordReq1.setOldPassword("");
      boolean boolean0 = modifyPasswordReq1.equals(modifyPasswordReq0);
      assertFalse(modifyPasswordReq1.equals((Object)modifyPasswordReq0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ModifyPasswordReq modifyPasswordReq0 = new ModifyPasswordReq();
      Integer integer0 = new Integer((-1941));
      modifyPasswordReq0.setUserId(integer0);
      ModifyPasswordReq modifyPasswordReq1 = new ModifyPasswordReq();
      assertFalse(modifyPasswordReq1.equals((Object)modifyPasswordReq0));
      
      modifyPasswordReq1.setUserId(integer0);
      boolean boolean0 = modifyPasswordReq0.equals(modifyPasswordReq1);
      assertTrue(modifyPasswordReq1.equals((Object)modifyPasswordReq0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ModifyPasswordReq modifyPasswordReq0 = new ModifyPasswordReq();
      Integer integer0 = new Integer(1297);
      modifyPasswordReq0.setUserId(integer0);
      ModifyPasswordReq modifyPasswordReq1 = new ModifyPasswordReq();
      boolean boolean0 = modifyPasswordReq1.equals(modifyPasswordReq0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ModifyPasswordReq modifyPasswordReq0 = new ModifyPasswordReq();
      Object object0 = new Object();
      boolean boolean0 = modifyPasswordReq0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ModifyPasswordReq modifyPasswordReq0 = new ModifyPasswordReq();
      boolean boolean0 = modifyPasswordReq0.equals(modifyPasswordReq0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ModifyPasswordReq modifyPasswordReq0 = new ModifyPasswordReq();
      modifyPasswordReq0.setPassword("]_)M");
      modifyPasswordReq0.hashCode();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ModifyPasswordReq modifyPasswordReq0 = new ModifyPasswordReq();
      modifyPasswordReq0.setOldPassword("]");
      modifyPasswordReq0.hashCode();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ModifyPasswordReq modifyPasswordReq0 = new ModifyPasswordReq();
      Integer integer0 = new Integer((-1));
      modifyPasswordReq0.setUserId(integer0);
      modifyPasswordReq0.hashCode();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ModifyPasswordReq modifyPasswordReq0 = new ModifyPasswordReq();
      String string0 = modifyPasswordReq0.toString();
      assertEquals("ModifyPasswordReq(userId=null, oldPassword=null, password=null)", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ModifyPasswordReq modifyPasswordReq0 = new ModifyPasswordReq();
      Integer integer0 = new Integer((-1941));
      modifyPasswordReq0.setUserId(integer0);
      ModifyPasswordReq modifyPasswordReq1 = new ModifyPasswordReq();
      boolean boolean0 = modifyPasswordReq0.equals(modifyPasswordReq1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ModifyPasswordReq modifyPasswordReq0 = new ModifyPasswordReq();
      modifyPasswordReq0.setPassword("");
      String string0 = modifyPasswordReq0.getPassword();
      assertEquals("", string0);
  }
}
