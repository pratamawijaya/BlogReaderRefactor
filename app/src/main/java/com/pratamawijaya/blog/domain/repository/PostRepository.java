package com.pratamawijaya.blog.domain.repository;

import com.pratamawijaya.blog.domain.entity.Post;
import java.util.List;

/**
 * Created by pratama
 * Date : Mar - 3/23/17
 * Project Name : BlogReaderRefactor
 */

public interface PostRepository {
  List<Post> posts();
}
