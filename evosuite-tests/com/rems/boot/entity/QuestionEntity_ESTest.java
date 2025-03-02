/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 12 15:21:08 GMT 2025
 */

package com.rems.boot.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import com.rems.boot.entity.QuestionEntity;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class QuestionEntity_ESTest extends QuestionEntity_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QuestionEntity.QuestionEntityBuilder questionEntity_QuestionEntityBuilder0 = new QuestionEntity.QuestionEntityBuilder();
      questionEntity_QuestionEntityBuilder0.quesSource("");
      QuestionEntity questionEntity0 = questionEntity_QuestionEntityBuilder0.build();
      questionEntity0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QuestionEntity questionEntity0 = new QuestionEntity();
      questionEntity0.setQuesTitle("9B=u+rf|U\"Whk.0W$");
      questionEntity0.hashCode();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QuestionEntity questionEntity0 = new QuestionEntity();
      Date date0 = questionEntity0.getUpdateTime();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QuestionEntity.QuestionEntityBuilder questionEntity_QuestionEntityBuilder0 = new QuestionEntity.QuestionEntityBuilder();
      questionEntity_QuestionEntityBuilder0.quesTxt("HQbLN");
      QuestionEntity questionEntity0 = questionEntity_QuestionEntityBuilder0.build();
      String string0 = questionEntity0.getQuesTxt();
      assertEquals("HQbLN", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QuestionEntity.QuestionEntityBuilder questionEntity_QuestionEntityBuilder0 = new QuestionEntity.QuestionEntityBuilder();
      questionEntity_QuestionEntityBuilder0.quesTxt("");
      QuestionEntity questionEntity0 = questionEntity_QuestionEntityBuilder0.build();
      String string0 = questionEntity0.getQuesTxt();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QuestionEntity questionEntity0 = new QuestionEntity();
      String string0 = questionEntity0.getQuesTitle();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QuestionEntity questionEntity0 = new QuestionEntity();
      questionEntity0.setQuesTitle("&S<3vx-");
      String string0 = questionEntity0.getQuesTitle();
      assertEquals("&S<3vx-", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QuestionEntity.QuestionEntityBuilder questionEntity_QuestionEntityBuilder0 = QuestionEntity.builder();
      QuestionEntity questionEntity0 = questionEntity_QuestionEntityBuilder0.build();
      questionEntity0.setQuesSource("K");
      String string0 = questionEntity0.getQuesSource();
      assertEquals("K", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QuestionEntity.QuestionEntityBuilder questionEntity_QuestionEntityBuilder0 = new QuestionEntity.QuestionEntityBuilder();
      questionEntity_QuestionEntityBuilder0.quesSource("");
      QuestionEntity questionEntity0 = questionEntity_QuestionEntityBuilder0.build();
      String string0 = questionEntity0.getQuesSource();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QuestionEntity.QuestionEntityBuilder questionEntity_QuestionEntityBuilder0 = new QuestionEntity.QuestionEntityBuilder();
      QuestionEntity questionEntity0 = questionEntity_QuestionEntityBuilder0.build();
      Date date0 = questionEntity0.getQuesDate();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Integer integer0 = new Integer(59);
      QuestionEntity questionEntity0 = new QuestionEntity(integer0, (String) null, (String) null, (Date) null, (String) null, "y6t<nBw]vs", (Date) null, (Date) null);
      String string0 = questionEntity0.getQuesAuthor();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Integer integer0 = new Integer((-1902));
      MockDate mockDate0 = new MockDate((-1902));
      QuestionEntity questionEntity0 = new QuestionEntity(integer0, "", "", mockDate0, "", "", mockDate0, mockDate0);
      String string0 = questionEntity0.getQuesAuthor();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QuestionEntity questionEntity0 = new QuestionEntity();
      Integer integer0 = new Integer(1893);
      questionEntity0.setId(integer0);
      Integer integer1 = questionEntity0.getId();
      assertEquals(1893, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QuestionEntity questionEntity0 = new QuestionEntity();
      Integer integer0 = questionEntity0.getId();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1554), 1, (-1554), (-3375), 4944, (-5099));
      Integer integer0 = new Integer((-2239));
      QuestionEntity questionEntity0 = new QuestionEntity(integer0, "", "", mockDate0, "?5=^|yN'HP]", "", mockDate0, (Date) null);
      questionEntity0.getId();
      assertEquals("", questionEntity0.getQuesAuthor());
      assertEquals("", questionEntity0.getQuesTitle());
      assertEquals("?5=^|yN'HP]", questionEntity0.getQuesSource());
      assertEquals("", questionEntity0.getQuesTxt());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QuestionEntity questionEntity0 = new QuestionEntity();
      MockDate mockDate0 = new MockDate(43, 1795, 1901);
      questionEntity0.setCreateTime(mockDate0);
      Date date0 = questionEntity0.getCreateTime();
      assertEquals("Mon Oct 14 00:00:00 GMT 2097", date0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QuestionEntity.QuestionEntityBuilder questionEntity_QuestionEntityBuilder0 = new QuestionEntity.QuestionEntityBuilder();
      QuestionEntity questionEntity0 = questionEntity_QuestionEntityBuilder0.build();
      boolean boolean0 = questionEntity0.canEqual(questionEntity0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QuestionEntity questionEntity0 = new QuestionEntity();
      boolean boolean0 = questionEntity0.canEqual((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QuestionEntity.QuestionEntityBuilder questionEntity_QuestionEntityBuilder0 = new QuestionEntity.QuestionEntityBuilder();
      QuestionEntity questionEntity0 = questionEntity_QuestionEntityBuilder0.build();
      String string0 = questionEntity0.getQuesSource();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Integer integer0 = Integer.valueOf(0);
      MockDate mockDate0 = new MockDate();
      QuestionEntity questionEntity0 = new QuestionEntity(integer0, (String) null, (String) null, mockDate0, (String) null, (String) null, mockDate0, mockDate0);
      Integer integer1 = questionEntity0.getId();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QuestionEntity.QuestionEntityBuilder questionEntity_QuestionEntityBuilder0 = new QuestionEntity.QuestionEntityBuilder();
      QuestionEntity questionEntity0 = questionEntity_QuestionEntityBuilder0.build();
      String string0 = questionEntity0.getQuesTxt();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Integer integer0 = new Integer(0);
      MockDate mockDate0 = new MockDate(0, 0, 2700, (-2588), (-1), 2700);
      String string0 = "\\u#L8ItraC2;a]u";
      QuestionEntity questionEntity0 = new QuestionEntity(integer0, "", string0, mockDate0, "", "", mockDate0, mockDate0);
      questionEntity0.getQuesDate();
      assertEquals("", questionEntity0.getQuesTxt());
      assertEquals("", questionEntity0.getQuesSource());
      assertEquals("\\u#L8ItraC2;a]u", questionEntity0.getQuesAuthor());
      assertEquals("", questionEntity0.getQuesTitle());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Integer integer0 = new Integer(0);
      MockDate mockDate0 = new MockDate(0, 0, 2700, (-2588), (-1), 2700);
      String string0 = "\\u#L8ItraC2;a]u";
      QuestionEntity questionEntity0 = new QuestionEntity(integer0, "", string0, mockDate0, "", "", mockDate0, mockDate0);
      String string1 = questionEntity0.getQuesAuthor();
      assertEquals("", questionEntity0.getQuesSource());
      assertEquals("", questionEntity0.getQuesTxt());
      assertEquals("\\u#L8ItraC2;a]u", string1);
      assertEquals("", questionEntity0.getQuesTitle());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Integer integer0 = new Integer(0);
      MockDate mockDate0 = new MockDate(0, 0, 2700, (-2588), (-1), 2700);
      String string0 = "\\u#L8ItraC2;a]u";
      QuestionEntity questionEntity0 = new QuestionEntity(integer0, "", string0, mockDate0, "", "", mockDate0, mockDate0);
      String string1 = questionEntity0.getQuesTitle();
      assertEquals("", string1);
      assertEquals("\\u#L8ItraC2;a]u", questionEntity0.getQuesAuthor());
      assertEquals("", questionEntity0.getQuesSource());
      assertEquals("", questionEntity0.getQuesTxt());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Integer integer0 = new Integer(0);
      MockDate mockDate0 = new MockDate(0, 0, 2700, (-2588), (-1), 2700);
      String string0 = "\\u#L8ItraC2;a]u";
      QuestionEntity questionEntity0 = new QuestionEntity(integer0, "", string0, mockDate0, "", "", mockDate0, mockDate0);
      questionEntity0.getUpdateTime();
      assertEquals("", questionEntity0.getQuesTitle());
      assertEquals("", questionEntity0.getQuesTxt());
      assertEquals("\\u#L8ItraC2;a]u", questionEntity0.getQuesAuthor());
      assertEquals("", questionEntity0.getQuesSource());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QuestionEntity questionEntity0 = new QuestionEntity();
      QuestionEntity questionEntity1 = new QuestionEntity();
      assertTrue(questionEntity1.equals((Object)questionEntity0));
      
      MockDate mockDate0 = new MockDate();
      questionEntity1.setUpdateTime(mockDate0);
      boolean boolean0 = questionEntity0.equals(questionEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QuestionEntity questionEntity0 = new QuestionEntity();
      MockDate mockDate0 = new MockDate(0, 1538, 2068, 1538, 2068, 1538);
      questionEntity0.setCreateTime(mockDate0);
      QuestionEntity.QuestionEntityBuilder questionEntity_QuestionEntityBuilder0 = QuestionEntity.builder();
      QuestionEntity.QuestionEntityBuilder questionEntity_QuestionEntityBuilder1 = questionEntity_QuestionEntityBuilder0.updateTime(mockDate0);
      questionEntity_QuestionEntityBuilder1.createTime(mockDate0);
      QuestionEntity questionEntity1 = questionEntity_QuestionEntityBuilder1.build();
      boolean boolean0 = questionEntity1.equals(questionEntity0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QuestionEntity questionEntity0 = new QuestionEntity();
      QuestionEntity questionEntity1 = new QuestionEntity();
      assertTrue(questionEntity1.equals((Object)questionEntity0));
      
      MockDate mockDate0 = new MockDate();
      questionEntity0.setCreateTime(mockDate0);
      boolean boolean0 = questionEntity1.equals(questionEntity0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QuestionEntity questionEntity0 = new QuestionEntity();
      QuestionEntity questionEntity1 = new QuestionEntity();
      assertTrue(questionEntity1.equals((Object)questionEntity0));
      
      MockDate mockDate0 = new MockDate(0, 1538, 2068, 1538, 2068, 1538);
      questionEntity0.setCreateTime(mockDate0);
      boolean boolean0 = questionEntity0.equals(questionEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      QuestionEntity questionEntity0 = new QuestionEntity();
      QuestionEntity questionEntity1 = new QuestionEntity();
      assertTrue(questionEntity1.equals((Object)questionEntity0));
      
      questionEntity1.setQuesTxt("]|p%9;M8");
      boolean boolean0 = questionEntity1.equals(questionEntity0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      QuestionEntity questionEntity0 = new QuestionEntity();
      QuestionEntity questionEntity1 = new QuestionEntity();
      assertTrue(questionEntity1.equals((Object)questionEntity0));
      
      questionEntity1.setQuesTxt("");
      boolean boolean0 = questionEntity0.equals(questionEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      QuestionEntity.QuestionEntityBuilder questionEntity_QuestionEntityBuilder0 = QuestionEntity.builder();
      QuestionEntity.QuestionEntityBuilder questionEntity_QuestionEntityBuilder1 = questionEntity_QuestionEntityBuilder0.quesTxt("D9xp'j Zxuk\"");
      QuestionEntity questionEntity0 = questionEntity_QuestionEntityBuilder1.build();
      QuestionEntity questionEntity1 = questionEntity_QuestionEntityBuilder1.build();
      boolean boolean0 = questionEntity0.equals(questionEntity1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      QuestionEntity questionEntity0 = new QuestionEntity();
      questionEntity0.setQuesSource("BRYhkO-\"i3ub");
      QuestionEntity questionEntity1 = new QuestionEntity();
      assertFalse(questionEntity1.equals((Object)questionEntity0));
      
      questionEntity1.setQuesSource("BRYhkO-\"i3ub");
      boolean boolean0 = questionEntity1.equals(questionEntity0);
      assertTrue(questionEntity1.equals((Object)questionEntity0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      QuestionEntity questionEntity0 = new QuestionEntity();
      questionEntity0.setQuesSource("Q\u0006f");
      QuestionEntity questionEntity1 = new QuestionEntity();
      boolean boolean0 = questionEntity1.equals(questionEntity0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      QuestionEntity questionEntity0 = new QuestionEntity();
      QuestionEntity questionEntity1 = new QuestionEntity();
      assertTrue(questionEntity1.equals((Object)questionEntity0));
      
      questionEntity1.setQuesSource(",9(zJ~rG-?");
      boolean boolean0 = questionEntity1.equals(questionEntity0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      QuestionEntity questionEntity0 = new QuestionEntity();
      MockDate mockDate0 = new MockDate((-3085), (-3085), (-3085));
      questionEntity0.setQuesDate(mockDate0);
      QuestionEntity questionEntity1 = new QuestionEntity();
      assertFalse(questionEntity1.equals((Object)questionEntity0));
      
      questionEntity1.setQuesDate(mockDate0);
      boolean boolean0 = questionEntity1.equals(questionEntity0);
      assertTrue(questionEntity1.equals((Object)questionEntity0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      QuestionEntity questionEntity0 = new QuestionEntity();
      MockDate mockDate0 = new MockDate();
      questionEntity0.setQuesDate(mockDate0);
      QuestionEntity questionEntity1 = new QuestionEntity();
      boolean boolean0 = questionEntity1.equals(questionEntity0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      QuestionEntity questionEntity0 = new QuestionEntity();
      questionEntity0.setQuesAuthor("uPg<*%BbAQ@oBq<");
      QuestionEntity questionEntity1 = new QuestionEntity();
      boolean boolean0 = questionEntity0.equals(questionEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      QuestionEntity questionEntity0 = new QuestionEntity();
      QuestionEntity questionEntity1 = new QuestionEntity();
      assertTrue(questionEntity1.equals((Object)questionEntity0));
      
      questionEntity1.setQuesTitle("");
      boolean boolean0 = questionEntity0.equals(questionEntity1);
      assertFalse(questionEntity1.equals((Object)questionEntity0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      QuestionEntity questionEntity0 = new QuestionEntity();
      QuestionEntity questionEntity1 = new QuestionEntity();
      Integer integer0 = new Integer((-1));
      questionEntity0.setId(integer0);
      assertFalse(questionEntity0.equals((Object)questionEntity1));
      
      questionEntity1.setId(integer0);
      boolean boolean0 = questionEntity1.equals(questionEntity0);
      assertTrue(questionEntity0.equals((Object)questionEntity1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      QuestionEntity questionEntity0 = new QuestionEntity();
      Integer integer0 = new Integer(5401);
      questionEntity0.setId(integer0);
      QuestionEntity questionEntity1 = new QuestionEntity();
      boolean boolean0 = questionEntity1.equals(questionEntity0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      QuestionEntity questionEntity0 = new QuestionEntity();
      QuestionEntity questionEntity1 = new QuestionEntity();
      assertTrue(questionEntity1.equals((Object)questionEntity0));
      
      Integer integer0 = new Integer(1510);
      questionEntity1.setId(integer0);
      boolean boolean0 = questionEntity1.equals(questionEntity0);
      assertFalse(questionEntity1.equals((Object)questionEntity0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      QuestionEntity questionEntity0 = new QuestionEntity();
      Object object0 = new Object();
      boolean boolean0 = questionEntity0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      QuestionEntity questionEntity0 = new QuestionEntity();
      boolean boolean0 = questionEntity0.equals(questionEntity0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Integer integer0 = new Integer(0);
      MockDate mockDate0 = new MockDate(0, 0, 2700, (-2588), (-1), 2700);
      String string0 = "\\u#L8ItraC2;a]u";
      QuestionEntity questionEntity0 = new QuestionEntity(integer0, "", string0, mockDate0, "", "", mockDate0, mockDate0);
      questionEntity0.hashCode();
      assertEquals("\\u#L8ItraC2;a]u", questionEntity0.getQuesAuthor());
      assertEquals("", questionEntity0.getQuesSource());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      QuestionEntity.QuestionEntityBuilder questionEntity_QuestionEntityBuilder0 = QuestionEntity.builder();
      QuestionEntity.QuestionEntityBuilder questionEntity_QuestionEntityBuilder1 = questionEntity_QuestionEntityBuilder0.id((Integer) null);
      assertSame(questionEntity_QuestionEntityBuilder1, questionEntity_QuestionEntityBuilder0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      QuestionEntity.QuestionEntityBuilder questionEntity_QuestionEntityBuilder0 = new QuestionEntity.QuestionEntityBuilder();
      QuestionEntity.QuestionEntityBuilder questionEntity_QuestionEntityBuilder1 = questionEntity_QuestionEntityBuilder0.quesTitle("~xOH|#@2ByEtuxD");
      QuestionEntity questionEntity0 = questionEntity_QuestionEntityBuilder1.build();
      QuestionEntity questionEntity1 = questionEntity_QuestionEntityBuilder1.build();
      boolean boolean0 = questionEntity0.equals(questionEntity1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      QuestionEntity.QuestionEntityBuilder questionEntity_QuestionEntityBuilder0 = new QuestionEntity.QuestionEntityBuilder();
      String string0 = questionEntity_QuestionEntityBuilder0.toString();
      assertEquals("QuestionEntity.QuestionEntityBuilder(id=null, quesTitle=null, quesAuthor=null, quesDate=null, quesSource=null, quesTxt=null, createTime=null, updateTime=null)", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      QuestionEntity.QuestionEntityBuilder questionEntity_QuestionEntityBuilder0 = new QuestionEntity.QuestionEntityBuilder();
      QuestionEntity.QuestionEntityBuilder questionEntity_QuestionEntityBuilder1 = questionEntity_QuestionEntityBuilder0.quesAuthor("gkO4Ep*oUVSrcL");
      QuestionEntity questionEntity0 = questionEntity_QuestionEntityBuilder1.build();
      QuestionEntity questionEntity1 = questionEntity_QuestionEntityBuilder1.build();
      boolean boolean0 = questionEntity0.equals(questionEntity1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      QuestionEntity.QuestionEntityBuilder questionEntity_QuestionEntityBuilder0 = new QuestionEntity.QuestionEntityBuilder();
      MockDate mockDate0 = new MockDate(0L);
      QuestionEntity.QuestionEntityBuilder questionEntity_QuestionEntityBuilder1 = questionEntity_QuestionEntityBuilder0.quesDate(mockDate0);
      assertSame(questionEntity_QuestionEntityBuilder1, questionEntity_QuestionEntityBuilder0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 1538, 2068, 1538, 2068, 1538);
      QuestionEntity.QuestionEntityBuilder questionEntity_QuestionEntityBuilder0 = QuestionEntity.builder();
      QuestionEntity.QuestionEntityBuilder questionEntity_QuestionEntityBuilder1 = questionEntity_QuestionEntityBuilder0.updateTime(mockDate0);
      QuestionEntity questionEntity0 = questionEntity_QuestionEntityBuilder1.build();
      QuestionEntity questionEntity1 = questionEntity_QuestionEntityBuilder0.build();
      boolean boolean0 = questionEntity0.equals(questionEntity1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      QuestionEntity questionEntity0 = new QuestionEntity();
      String string0 = questionEntity0.toString();
      assertEquals("QuestionEntity(id=null, quesTitle=null, quesAuthor=null, quesDate=null, quesSource=null, quesTxt=null, createTime=null, updateTime=null)", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      QuestionEntity questionEntity0 = new QuestionEntity();
      questionEntity0.setQuesTitle("");
      QuestionEntity questionEntity1 = new QuestionEntity();
      boolean boolean0 = questionEntity0.equals(questionEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      QuestionEntity.QuestionEntityBuilder questionEntity_QuestionEntityBuilder0 = QuestionEntity.builder();
      QuestionEntity questionEntity0 = questionEntity_QuestionEntityBuilder0.build();
      Date date0 = questionEntity0.getCreateTime();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      QuestionEntity questionEntity0 = new QuestionEntity();
      MockDate mockDate0 = new MockDate();
      questionEntity0.setQuesDate(mockDate0);
      QuestionEntity questionEntity1 = new QuestionEntity();
      boolean boolean0 = questionEntity0.equals(questionEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      QuestionEntity questionEntity0 = new QuestionEntity();
      questionEntity0.setQuesAuthor(")");
      QuestionEntity questionEntity1 = new QuestionEntity();
      boolean boolean0 = questionEntity1.equals(questionEntity0);
      assertFalse(boolean0);
      assertFalse(questionEntity0.equals((Object)questionEntity1));
  }
}
