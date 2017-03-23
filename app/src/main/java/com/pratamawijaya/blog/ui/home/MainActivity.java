package com.pratamawijaya.blog.ui.home;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.pratamawijaya.blog.R;
import com.pratamawijaya.blog.data.repository.PostRepositoryImpl;
import com.pratamawijaya.blog.domain.entity.Post;
import com.pratamawijaya.blog.domain.repository.PostRepository;
import com.pratamawijaya.blog.ui.home.adapter.MainAdapter;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView {

  @BindView(R.id.contentView) SwipeRefreshLayout contentView;
  @BindView(R.id.noContentView) TextView noContentView;
  @BindView(R.id.recyclerView) RecyclerView recyclerView;

  private MainPresenter presenter;
  private PostRepository postRepository;
  private MainAdapter adapter;
  private List<Post> posts;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
    postRepository = new PostRepositoryImpl();

    presenter = new MainPresenter(this, postRepository);

    setupRecyclerView();

    presenter.loadListArticles();
  }

  private void setupRecyclerView() {
    posts = new ArrayList<>();
    adapter = new MainAdapter(this, posts);
    recyclerView.setLayoutManager(new LinearLayoutManager(this));
    recyclerView.setAdapter(adapter);
  }

  @Override public void showLoading() {

  }

  @Override public void displayArticles(List<Post> posts) {

  }

  @Override public void displayNoArticle() {

  }
}
