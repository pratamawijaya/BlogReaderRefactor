package com.pratamawijaya.blog.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;

/**
 * Created by pratama
 * Date : Mar - 3/23/17
 * Project Name : BlogReaderRefactor
 */
@RunWith(MockitoJUnitRunner.class) public class DateUtilsTest {
  private DateUtils dateUtils;

  @Before public void setUp() throws Exception {
    dateUtils = new DateUtils();
  }

  @Test public void testConvertDateToFormattedString() throws Exception {
    SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
    Date date = dateformat.parse("23/03/2017");

    assertTrue(dateUtils.formatDate(date, DateUtils.FORMAT_DATE_SERVER).equals("2017-03-23"));
  }
}