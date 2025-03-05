package start.final_project_instagram.service;
import org.springframework.stereotype.Service;
import start.final_project_instagram.dto.response.CommentResponse;
import start.final_project_instagram.entities.Comment;

import java.util.List;
@Service
public interface CommentService {
    Comment saveComment(Long postId, Long userId, String text);
    List<CommentResponse> findAllByPostId(Long postId);
    void deleteById(Long commentId);
    Long findPostIdByCommentId(Long commentId);
}