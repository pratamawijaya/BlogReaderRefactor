package com.pratamawijaya.blog.ui.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.pratamawijaya.blog.R;
import com.pratamawijaya.blog.data.repository.PostRepositoryImpl;
import com.pratamawijaya.blog.domain.entity.Post;
import com.pratamawijaya.blog.domain.repository.PostRepository;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView {

  private MainPresenter presenter;
  private PostRepository postRepository;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    postRepository = new PostRepositoryImpl();

    presenter = new MainPresenter(this, postRepository);

    presenter.loadListArticles();
  }

  @Override public void showLoading() {

  }

  @Override public void displayArticles(List<Post> posts) {

  }

  @Override public void displayNoArticle() {

  }
}
