/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 12 15:45:44 GMT 2025
 */

package com.rems.boot.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import com.rems.boot.entity.MessageEntity;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MessageEntity_ESTest extends MessageEntity_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MessageEntity.MessageEntityBuilder messageEntity_MessageEntityBuilder0 = MessageEntity.builder();
      MockDate mockDate0 = new MockDate((-501), (-501), (-2070), 1, 1);
      messageEntity_MessageEntityBuilder0.updateTime(mockDate0);
      MessageEntity messageEntity0 = messageEntity_MessageEntityBuilder0.build();
      Date date0 = messageEntity0.getUpdateTime();
      assertSame(date0, mockDate0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MessageEntity messageEntity0 = new MessageEntity();
      String string0 = messageEntity0.getMsgUsername();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      MockDate mockDate0 = new MockDate((-1), (-1), 0, 0, (-1), 1);
      MessageEntity messageEntity0 = new MessageEntity(integer0, "|w`Wy,27y8$", "+=4&", "u6~", mockDate0, mockDate0);
      String string0 = messageEntity0.getMsgUsername();
      assertEquals("|w`Wy,27y8$", string0);
      assertEquals("+=4&", messageEntity0.getMsgUserFace());
      assertEquals("u6~", messageEntity0.getMsgContent());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MessageEntity.MessageEntityBuilder messageEntity_MessageEntityBuilder0 = new MessageEntity.MessageEntityBuilder();
      MessageEntity messageEntity0 = messageEntity_MessageEntityBuilder0.build();
      messageEntity0.setMsgUserFace("MessageEntity(id=null, msgUsername=null, msgUserFace=null, msgContent=null, createTime=Sat Feb 13 15:24:00 GMT 1666, updateTime=Wed Apr 12 14:24:43 GMT 1899)");
      String string0 = messageEntity0.getMsgUserFace();
      assertEquals("MessageEntity(id=null, msgUsername=null, msgUserFace=null, msgContent=null, createTime=Sat Feb 13 15:24:00 GMT 1666, updateTime=Wed Apr 12 14:24:43 GMT 1899)", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Integer integer0 = new Integer(516);
      MockDate mockDate0 = new MockDate(516, 964, 516);
      MessageEntity messageEntity0 = new MessageEntity(integer0, "", "", "", mockDate0, mockDate0);
      String string0 = messageEntity0.getMsgUserFace();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MessageEntity messageEntity0 = new MessageEntity();
      String string0 = messageEntity0.getMsgContent();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MessageEntity messageEntity0 = new MessageEntity();
      messageEntity0.setMsgContent("");
      String string0 = messageEntity0.getMsgContent();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MessageEntity.MessageEntityBuilder messageEntity_MessageEntityBuilder0 = new MessageEntity.MessageEntityBuilder();
      Integer integer0 = new Integer(0);
      MessageEntity.MessageEntityBuilder messageEntity_MessageEntityBuilder1 = messageEntity_MessageEntityBuilder0.id(integer0);
      MessageEntity messageEntity0 = messageEntity_MessageEntityBuilder1.build();
      Integer integer1 = messageEntity0.getId();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MessageEntity.MessageEntityBuilder messageEntity_MessageEntityBuilder0 = new MessageEntity.MessageEntityBuilder();
      Integer integer0 = new Integer(1);
      MessageEntity.MessageEntityBuilder messageEntity_MessageEntityBuilder1 = messageEntity_MessageEntityBuilder0.id(integer0);
      MessageEntity messageEntity0 = messageEntity_MessageEntityBuilder1.build();
      Integer integer1 = messageEntity0.getId();
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MessageEntity messageEntity0 = new MessageEntity();
      Integer integer0 = new Integer((-25));
      messageEntity0.setId(integer0);
      Integer integer1 = messageEntity0.getId();
      assertEquals((-25), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Integer integer0 = new Integer(516);
      MockDate mockDate0 = new MockDate(516, 964, 516);
      MessageEntity messageEntity0 = new MessageEntity(integer0, "", "", "", mockDate0, mockDate0);
      Date date0 = messageEntity0.getCreateTime();
      assertSame(date0, mockDate0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MessageEntity messageEntity0 = new MessageEntity();
      boolean boolean0 = messageEntity0.canEqual(messageEntity0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Integer integer0 = new Integer(0);
      MockDate mockDate0 = new MockDate(363L);
      MessageEntity messageEntity0 = new MessageEntity(integer0, ", updateTime=", "G", "j';;z", mockDate0, mockDate0);
      messageEntity0.canEqual("G");
      assertEquals(", updateTime=", messageEntity0.getMsgUsername());
      assertEquals("j';;z", messageEntity0.getMsgContent());
      assertEquals("G", messageEntity0.getMsgUserFace());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MessageEntity messageEntity0 = new MessageEntity();
      String string0 = messageEntity0.getMsgUserFace();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MessageEntity messageEntity0 = new MessageEntity();
      Date date0 = messageEntity0.getUpdateTime();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Integer integer0 = new Integer((-4750));
      MockDate mockDate0 = new MockDate((-4750), (-4750), 43);
      MessageEntity messageEntity0 = new MessageEntity(integer0, "", "", (String) null, mockDate0, mockDate0);
      String string0 = messageEntity0.getMsgUsername();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MessageEntity messageEntity0 = new MessageEntity();
      Integer integer0 = messageEntity0.getId();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Integer integer0 = new Integer((-1664));
      MockDate mockDate0 = new MockDate((-1664));
      MessageEntity messageEntity0 = new MessageEntity(integer0, (String) null, "", "MessageEntity(id=", mockDate0, mockDate0);
      String string0 = messageEntity0.getMsgContent();
      assertEquals("", messageEntity0.getMsgUserFace());
      assertNotNull(string0);
      assertEquals("MessageEntity(id=", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MessageEntity.MessageEntityBuilder messageEntity_MessageEntityBuilder0 = new MessageEntity.MessageEntityBuilder();
      MessageEntity messageEntity0 = messageEntity_MessageEntityBuilder0.build();
      Date date0 = messageEntity0.getCreateTime();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MessageEntity messageEntity0 = new MessageEntity();
      MockDate mockDate0 = new MockDate();
      messageEntity0.setUpdateTime(mockDate0);
      MessageEntity.MessageEntityBuilder messageEntity_MessageEntityBuilder0 = new MessageEntity.MessageEntityBuilder();
      MessageEntity.MessageEntityBuilder messageEntity_MessageEntityBuilder1 = messageEntity_MessageEntityBuilder0.updateTime(mockDate0);
      MessageEntity messageEntity1 = messageEntity_MessageEntityBuilder1.build();
      boolean boolean0 = messageEntity0.equals(messageEntity1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MessageEntity messageEntity0 = new MessageEntity();
      MockDate mockDate0 = new MockDate();
      messageEntity0.setUpdateTime(mockDate0);
      MessageEntity messageEntity1 = new MessageEntity();
      boolean boolean0 = messageEntity1.equals(messageEntity0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MessageEntity messageEntity0 = new MessageEntity();
      MockDate mockDate0 = new MockDate();
      MessageEntity messageEntity1 = new MessageEntity();
      assertTrue(messageEntity1.equals((Object)messageEntity0));
      
      messageEntity1.setUpdateTime(mockDate0);
      boolean boolean0 = messageEntity1.equals(messageEntity0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0, 0, 0);
      MessageEntity.MessageEntityBuilder messageEntity_MessageEntityBuilder0 = MessageEntity.builder();
      messageEntity_MessageEntityBuilder0.createTime(mockDate0);
      MessageEntity messageEntity0 = messageEntity_MessageEntityBuilder0.build();
      MessageEntity messageEntity1 = messageEntity_MessageEntityBuilder0.build();
      boolean boolean0 = messageEntity0.equals(messageEntity1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MessageEntity.MessageEntityBuilder messageEntity_MessageEntityBuilder0 = new MessageEntity.MessageEntityBuilder();
      MessageEntity messageEntity0 = messageEntity_MessageEntityBuilder0.build();
      MockDate mockDate0 = new MockDate(43, 43, 0);
      MessageEntity messageEntity1 = messageEntity_MessageEntityBuilder0.build();
      assertTrue(messageEntity1.equals((Object)messageEntity0));
      
      messageEntity0.setCreateTime(mockDate0);
      boolean boolean0 = messageEntity1.equals(messageEntity0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MessageEntity messageEntity0 = new MessageEntity();
      MockDate mockDate0 = new MockDate(0, 0, 0, 0, 0);
      MessageEntity.MessageEntityBuilder messageEntity_MessageEntityBuilder0 = MessageEntity.builder();
      messageEntity_MessageEntityBuilder0.createTime(mockDate0);
      MessageEntity messageEntity1 = messageEntity_MessageEntityBuilder0.build();
      boolean boolean0 = messageEntity1.equals(messageEntity0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MessageEntity.MessageEntityBuilder messageEntity_MessageEntityBuilder0 = MessageEntity.builder();
      MessageEntity.MessageEntityBuilder messageEntity_MessageEntityBuilder1 = messageEntity_MessageEntityBuilder0.msgContent("MessageEntity(id=0, msgUsername=null, msgUserFace=null, msgContent=null, createTime=null, updateTime=null)");
      MessageEntity messageEntity0 = messageEntity_MessageEntityBuilder1.build();
      MessageEntity messageEntity1 = messageEntity_MessageEntityBuilder0.build();
      boolean boolean0 = messageEntity0.equals(messageEntity1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MessageEntity messageEntity0 = new MessageEntity();
      MessageEntity.MessageEntityBuilder messageEntity_MessageEntityBuilder0 = MessageEntity.builder();
      MessageEntity.MessageEntityBuilder messageEntity_MessageEntityBuilder1 = messageEntity_MessageEntityBuilder0.msgContent("MessageEntity(id=0, msgUsername=null, msgUserFace=null, msgContent=null, createTime=null, updateTime=null)");
      MessageEntity messageEntity1 = messageEntity_MessageEntityBuilder1.build();
      boolean boolean0 = messageEntity1.equals(messageEntity0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MessageEntity messageEntity0 = new MessageEntity();
      messageEntity0.setMsgUserFace(", msgContent=");
      MessageEntity messageEntity1 = new MessageEntity();
      assertFalse(messageEntity1.equals((Object)messageEntity0));
      
      messageEntity1.setMsgUserFace(", msgContent=");
      boolean boolean0 = messageEntity0.equals(messageEntity1);
      assertTrue(messageEntity1.equals((Object)messageEntity0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MessageEntity messageEntity0 = new MessageEntity();
      MessageEntity messageEntity1 = new MessageEntity();
      assertTrue(messageEntity1.equals((Object)messageEntity0));
      
      messageEntity1.setMsgUserFace("MessageEntity.MessageEntityBuilder(id=");
      boolean boolean0 = messageEntity0.equals(messageEntity1);
      assertFalse(messageEntity1.equals((Object)messageEntity0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MessageEntity messageEntity0 = new MessageEntity();
      messageEntity0.setMsgUserFace(", msgContent=");
      MessageEntity messageEntity1 = new MessageEntity();
      boolean boolean0 = messageEntity0.equals(messageEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MessageEntity messageEntity0 = new MessageEntity();
      MessageEntity messageEntity1 = new MessageEntity();
      messageEntity0.setMsgUsername("");
      assertFalse(messageEntity0.equals((Object)messageEntity1));
      
      messageEntity1.setMsgUsername("");
      boolean boolean0 = messageEntity1.equals(messageEntity0);
      assertTrue(messageEntity0.equals((Object)messageEntity1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MessageEntity messageEntity0 = new MessageEntity();
      MessageEntity messageEntity1 = new MessageEntity();
      assertTrue(messageEntity1.equals((Object)messageEntity0));
      
      messageEntity1.setMsgUsername("MessageEntity(id=null, msgUsername=null, msgUserFace=null, msgContent=null, createTime=null, updateTime=null)");
      boolean boolean0 = messageEntity0.equals(messageEntity1);
      assertFalse(messageEntity1.equals((Object)messageEntity0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MessageEntity messageEntity0 = new MessageEntity();
      MessageEntity messageEntity1 = new MessageEntity();
      assertTrue(messageEntity1.equals((Object)messageEntity0));
      
      messageEntity1.setMsgUsername("");
      boolean boolean0 = messageEntity1.equals(messageEntity0);
      assertFalse(messageEntity1.equals((Object)messageEntity0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MessageEntity messageEntity0 = new MessageEntity();
      MessageEntity messageEntity1 = new MessageEntity();
      assertTrue(messageEntity1.equals((Object)messageEntity0));
      
      Integer integer0 = new Integer(580);
      messageEntity1.setId(integer0);
      boolean boolean0 = messageEntity0.equals(messageEntity1);
      assertFalse(messageEntity1.equals((Object)messageEntity0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MessageEntity messageEntity0 = new MessageEntity();
      Integer integer0 = new Integer(1);
      MessageEntity messageEntity1 = new MessageEntity();
      assertTrue(messageEntity1.equals((Object)messageEntity0));
      
      messageEntity1.setId(integer0);
      boolean boolean0 = messageEntity1.equals(messageEntity0);
      assertFalse(messageEntity1.equals((Object)messageEntity0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MessageEntity messageEntity0 = new MessageEntity();
      MessageEntity.MessageEntityBuilder messageEntity_MessageEntityBuilder0 = MessageEntity.builder();
      boolean boolean0 = messageEntity0.equals(messageEntity_MessageEntityBuilder0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MessageEntity messageEntity0 = new MessageEntity();
      boolean boolean0 = messageEntity0.equals(messageEntity0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MessageEntity messageEntity0 = new MessageEntity();
      messageEntity0.setMsgUserFace("n`:A]8k'Z");
      messageEntity0.hashCode();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MessageEntity messageEntity0 = new MessageEntity();
      messageEntity0.setMsgUsername("#,m[#z!b_gv;@e");
      messageEntity0.hashCode();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MessageEntity messageEntity0 = new MessageEntity();
      Integer integer0 = new Integer(0);
      messageEntity0.setId(integer0);
      messageEntity0.hashCode();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MessageEntity.MessageEntityBuilder messageEntity_MessageEntityBuilder0 = MessageEntity.builder();
      String string0 = messageEntity_MessageEntityBuilder0.toString();
      assertEquals("MessageEntity.MessageEntityBuilder(id=null, msgUsername=null, msgUserFace=null, msgContent=null, createTime=null, updateTime=null)", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0, 0, 0);
      MessageEntity.MessageEntityBuilder messageEntity_MessageEntityBuilder0 = MessageEntity.builder();
      messageEntity_MessageEntityBuilder0.createTime(mockDate0);
      MessageEntity messageEntity0 = messageEntity_MessageEntityBuilder0.build();
      messageEntity0.hashCode();
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MessageEntity.MessageEntityBuilder messageEntity_MessageEntityBuilder0 = MessageEntity.builder();
      MessageEntity.MessageEntityBuilder messageEntity_MessageEntityBuilder1 = messageEntity_MessageEntityBuilder0.msgContent("MessageEntity(id=0, msgUsername=null, msgUserFace=null, msgContent=null, createTime=null, updateTime=null)");
      MessageEntity messageEntity0 = messageEntity_MessageEntityBuilder1.build();
      messageEntity0.hashCode();
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      MessageEntity.MessageEntityBuilder messageEntity_MessageEntityBuilder0 = MessageEntity.builder();
      MessageEntity.MessageEntityBuilder messageEntity_MessageEntityBuilder1 = messageEntity_MessageEntityBuilder0.msgUserFace("");
      assertSame(messageEntity_MessageEntityBuilder0, messageEntity_MessageEntityBuilder1);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MessageEntity.MessageEntityBuilder messageEntity_MessageEntityBuilder0 = MessageEntity.builder();
      MessageEntity.MessageEntityBuilder messageEntity_MessageEntityBuilder1 = messageEntity_MessageEntityBuilder0.msgUsername("M1KZ@-&");
      assertSame(messageEntity_MessageEntityBuilder1, messageEntity_MessageEntityBuilder0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MessageEntity messageEntity0 = new MessageEntity();
      messageEntity0.setMsgContent("");
      MessageEntity messageEntity1 = new MessageEntity();
      boolean boolean0 = messageEntity1.equals(messageEntity0);
      assertFalse(messageEntity0.equals((Object)messageEntity1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MessageEntity messageEntity0 = new MessageEntity();
      MockDate mockDate0 = new MockDate();
      messageEntity0.setUpdateTime(mockDate0);
      messageEntity0.hashCode();
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MessageEntity messageEntity0 = new MessageEntity();
      Integer integer0 = new Integer(1);
      messageEntity0.setId(integer0);
      MessageEntity messageEntity1 = new MessageEntity();
      assertFalse(messageEntity1.equals((Object)messageEntity0));
      
      messageEntity1.setId(integer0);
      boolean boolean0 = messageEntity1.equals(messageEntity0);
      assertTrue(messageEntity1.equals((Object)messageEntity0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MessageEntity messageEntity0 = new MessageEntity();
      String string0 = messageEntity0.toString();
      assertEquals("MessageEntity(id=null, msgUsername=null, msgUserFace=null, msgContent=null, createTime=null, updateTime=null)", string0);
  }
}
