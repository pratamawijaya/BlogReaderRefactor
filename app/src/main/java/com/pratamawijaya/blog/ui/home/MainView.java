package com.pratamawijaya.blog.ui.home;

import com.pratamawijaya.blog.domain.entity.Post;
import java.util.List;

/**
 * Created by pratama
 * Date : Mar - 3/23/17
 * Project Name : BlogReaderRefactor
 */

public interface MainView {
  void showLoading();

  void displayArticles(List<Post> posts);

  void displayNoArticle();
}
