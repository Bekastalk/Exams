package bekks.service.impl;

import bekks.entity.Comment;
import bekks.repasitory.CommetRepos;
import bekks.repasitory.impl.CommentReposImpl;
import bekks.service.CommentService;

import java.util.List;

public class CommentServiceImpl implements CommentService {
    CommetRepos commetRepos=new CommentReposImpl();
    @Override
    public void saveComment(Long postID, Long userId, Comment comment) {
        commetRepos.saveComment(postID, userId, comment);
    }

    @Override
    public List<Comment> findCommentByPostId(Long postId) {
        return commetRepos.findCommentByPostId(postId);
    }

    @Override
    public void updateComment(Long id, String text) {
        commetRepos.updateComment(id, text);
    }

    @Override
    public void deleteComment(Comment comment) {
        commetRepos.deleteComment(comment);
    }
}
