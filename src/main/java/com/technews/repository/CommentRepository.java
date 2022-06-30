package com.technews.repository;

import com.technews.model.Comment;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface CommentRepository extends JpaRepository <Comment, Integer> {
    List<Comment> findAllCommentsByPOstId(int postId);
}
