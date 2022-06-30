package com.technews.repository;

import com.technews.model.Comment;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface CommentRepository extends JpaRepository <Comment, Integer> {
}
