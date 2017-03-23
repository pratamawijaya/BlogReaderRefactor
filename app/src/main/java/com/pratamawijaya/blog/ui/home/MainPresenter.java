package com.pratamawijaya.blog.ui.home;

import com.pratamawijaya.blog.domain.entity.Post;
import com.pratamawijaya.blog.domain.repository.PostRepository;
import java.util.List;

/**
 * Created by pratama
 * Date : Mar - 3/23/17
 * Project Name : BlogReaderRefactor
 */

class MainPresenter {
  private MainView view;
  private PostRepository repository;

  public MainPresenter(MainView view, PostRepository postRepository) {
    this.view = view;
    this.repository = postRepository;
  }

  public void loadListArticles() {
    view.showLoading();
    List<Post> posts = repository.posts();
    if (posts != null && posts.size() > 0) {
      view.displayArticles(posts);
    } else {
      view.displayNoArticle();
    }
  }
}
