package start.final_project_instagram.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import start.final_project_instagram.dto.response.CommentResponse;
import start.final_project_instagram.entities.Comment;
import start.final_project_instagram.service.serviceImpl.CommentServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
@RequiredArgsConstructor
public class CommentApi {
    private final CommentServiceImpl commentService;

    @PostMapping("/save")
    public ResponseEntity<Comment> saveComment(
            @RequestParam Long postId,
            @RequestParam Long userId,
            @RequestParam String text) {
        return ResponseEntity.ok(commentService.saveComment(postId, userId, text));
    }

    @GetMapping("/post/{postId}")
    public ResponseEntity<List<CommentResponse>> getCommentsByPostId(@PathVariable Long postId) {
        return ResponseEntity.ok(commentService.findAllByPostId(postId));
    }

    @DeleteMapping("/{commentId}")
    public ResponseEntity<String> deleteComment(@PathVariable Long commentId) {
        commentService.deleteById(commentId);
        return ResponseEntity.ok("Comment deleted successfully");
    }

    @GetMapping("/{commentId}/post")
    public ResponseEntity<Long> getPostIdByCommentId(@PathVariable Long commentId) {
        return ResponseEntity.ok(commentService.findPostIdByCommentId(commentId));
    }
}