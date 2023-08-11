package me.gnoyes.boardservice.repository;

import me.gnoyes.boardservice.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}