package com.pratamawijaya.blog.ui.home;

import com.pratamawijaya.blog.domain.entity.Post;
import com.pratamawijaya.blog.domain.repository.PostRepository;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by pratama
 * Date : Mar - 3/23/17
 * Project Name : BlogReaderRefactor
 */

@RunWith(MockitoJUnitRunner.class) public class MainPresenterTest {
  private MainPresenter presenter;

  @Mock MainView view;
  @Mock PostRepository postRepository;
  private List<Post> posts;

  @Before public void setUp() throws Exception {
    presenter = new MainPresenter(view, postRepository);
  }

  @Test public void testLoadArticles() throws Exception {
    posts = createMockObj();
    when(postRepository.posts()).thenReturn(posts);

    presenter.loadListArticles();

    verify(view).showLoading();
    verify(view).displayArticles(posts);
  }

  @Test public void testShowNoArticles() throws Exception {
    when(postRepository.posts()).thenReturn(createZeroObj());
    presenter.loadListArticles();
    verify(view).showLoading();
    verify(view).displayNoArticle();
  }

  private List<Post> createZeroObj() {
    return null;
  }

  private List<Post> createMockObj() {
    List<Post> posts = new ArrayList<>();
    posts.add(new Post(1, "title 1"));
    posts.add(new Post(2, "title 2"));
    return posts;
  }
}