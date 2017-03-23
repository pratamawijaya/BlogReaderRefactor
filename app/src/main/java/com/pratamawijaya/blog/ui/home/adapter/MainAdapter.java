package com.pratamawijaya.blog.ui.home.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.pratamawijaya.blog.R;
import com.pratamawijaya.blog.domain.entity.Post;
import com.pratamawijaya.blog.utils.DateUtils;
import java.util.List;

/**
 * Created by pratama
 * Date : Mar - 3/23/17
 * Project Name : BlogReaderRefactor
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainHolder> {
  private Context context;
  private List<Post> posts;

  public MainAdapter(Context context, List<Post> posts) {
    this.context = context;
    this.posts = posts;
  }

  @Override public MainHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    return new MainHolder(
        LayoutInflater.from(context).inflate(R.layout.layout_item_post, parent, false));
  }

  @Override public void onBindViewHolder(MainHolder holder, int position) {
    holder.bindItem(posts.get(position));
  }

  @Override public int getItemCount() {
    return posts.size();
  }

  public class MainHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.tvPostTitle) TextView title;
    @BindView(R.id.tvPostDate) TextView date;
    private DateUtils dateUtils;

    public MainHolder(View itemView) {
      super(itemView);
      ButterKnife.bind(this, itemView);
      dateUtils = new DateUtils();
    }

    public void bindItem(Post post) {
      title.setText(post.name);
      date.setText(dateUtils.formatDate(post.published, DateUtils.FORMAT_DATE_1));
    }
  }
}
