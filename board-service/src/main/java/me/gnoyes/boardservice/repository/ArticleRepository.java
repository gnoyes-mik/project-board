package me.gnoyes.boardservice.repository;

import me.gnoyes.boardservice.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}