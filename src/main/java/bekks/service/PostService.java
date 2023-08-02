package bekks.service;

import bekks.entity.Post;

import java.util.List;

public interface PostService {
    void savePost(Long userId, Post post);

    List<Post> getPostByUserId(Long userId);

    Post searchPost(String image);

    void deletePostById(Long id);
}
