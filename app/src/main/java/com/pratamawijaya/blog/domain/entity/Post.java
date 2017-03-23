package com.pratamawijaya.blog.domain.entity;

/**
 * Created by pratama
 * Date : Mar - 3/23/17
 * Project Name : BlogReaderRefactor
 */

public class Post {
  public int id;
  public String name;

  public Post(int id, String name) {
    this.id = id;
    this.name = name;
  }
}
