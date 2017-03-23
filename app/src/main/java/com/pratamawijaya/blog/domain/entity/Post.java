package com.pratamawijaya.blog.domain.entity;

import java.util.Date;

/**
 * Created by pratama
 * Date : Mar - 3/23/17
 * Project Name : BlogReaderRefactor
 */

public class Post {
  public int id;
  public String name;
  public Date published;

  public Post(int id, String name) {
    this.id = id;
    this.name = name;
  }
}
