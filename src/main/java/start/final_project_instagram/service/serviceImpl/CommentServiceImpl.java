package start.final_project_instagram.service.serviceImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import start.final_project_instagram.dto.response.CommentResponse;
import start.final_project_instagram.entities.Comment;
import start.final_project_instagram.entities.Like;
import start.final_project_instagram.entities.Post;
import start.final_project_instagram.entities.User;
import start.final_project_instagram.repositories.CommentRepository;
import start.final_project_instagram.repositories.LikeRepository;
import start.final_project_instagram.repositories.PostRepository;
import start.final_project_instagram.repositories.UserRepository;
import start.final_project_instagram.service.CommentService;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl  {
//    private final CommentRepository commentRepository;
//    private final LikeRepository likeRepository;
//    private final PostRepository postRepository;
//    private final UserRepository userRepository;
//
//    public Comment saveComment(Long postId, Long userId, String text) {
//        Post post = postRepository.findById(postId)
//                .orElseThrow(() -> new RuntimeException("Post not found"));
//        User user = userRepository.findById(userId)
//                .orElseThrow(() -> new RuntimeException("User not found"));
//
//        Comment comment = Comment.builder()
//                .comment(text)
//                .likeCount(0)
//                .user(user)
//                .post(post)
//                .createdAt(LocalDate.now())
//                .build();
//
//        commentRepository.save(comment);
//
//        Like like = Like.builder()
//                .comment(comment)
//                .user(user)
//                .post(post)
//                .isLiked(false)
//                .build();
//
//        likeRepository.save(like);
//
//        return comment;
//    }
//
//    public List<CommentResponse> findAllByPostId(Long postId) {
//        return commentRepository.findAllByPostId(postId);
//    }
//    public void deleteById(Long commentId) {
//        Comment comment = commentRepository.findById(commentId)
//                .orElseThrow(() -> new RuntimeException("Comment not found"));
//
//        likeRepository.deleteAll(comment.getLikes());
//
//        commentRepository.deleteById(commentId);
//    }
//
//    public Long findPostIdByCommentId(Long commentId) {
//        Comment comment = commentRepository.findById(commentId).orElseThrow(() -> new RuntimeException("Comment not found"));
//        return comment.getPost().getId();
//    }

}

