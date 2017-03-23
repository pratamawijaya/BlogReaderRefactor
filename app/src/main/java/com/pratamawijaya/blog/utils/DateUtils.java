package com.pratamawijaya.blog.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by pratama
 * Date : Mar - 3/23/17
 * Project Name : BlogReaderRefactor
 */

public class DateUtils {

  public static final String FORMAT_DATE_1 = "EEE, d MMM yyyy";
  public static final String FORMAT_DATE_2 = "d MMM yyyy";
  public static final String FORMAT_DATE_3 = "d/MMM/yyyy";
  public static final String FORMAT_DATE_SERVER = "yyyy-MM-dd";

  /**
   * transform Date to formatted string
   */
  public String formatDate(Date date, String format) {
    SimpleDateFormat dateFormat = new SimpleDateFormat(format);
    return dateFormat.format(date);
  }
}
