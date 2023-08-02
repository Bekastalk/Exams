package bekks.repasitory;

import bekks.entity.Comment;

import java.util.List;

public interface CommetRepos {
    void saveComment(Long postID, Long userId, Comment comment);

    List<Comment> findCommentByPostId(Long postId);

    void updateComment(Long id, String text);

    void deleteComment(Comment comment);
}
