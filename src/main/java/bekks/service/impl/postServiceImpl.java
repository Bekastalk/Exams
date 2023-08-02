package bekks.service.impl;

import bekks.entity.Post;
import bekks.repasitory.PostRepos;
import bekks.repasitory.impl.PostReposImpl;
import bekks.service.PostService;

import java.util.List;

public class postServiceImpl implements PostService {
    PostRepos postRepos=new PostReposImpl();
    @Override
    public void savePost(Long userId, Post post) {
        postRepos.savePost(userId, post);
    }

    @Override
    public List<Post> getPostByUserId(Long userId) {
        return postRepos.getPostByUserId(userId);
    }

    @Override
    public Post searchPost(String image) {
        return postRepos.searchPost(image);
    }

    @Override
    public void deletePostById(Long id) {
        postRepos.deletePostById(id);
    }
}
