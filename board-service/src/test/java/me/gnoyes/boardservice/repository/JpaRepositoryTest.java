package me.gnoyes.boardservice.repository;

import me.gnoyes.boardservice.config.JpaConfig;
import me.gnoyes.boardservice.domain.Article;
import me.gnoyes.boardservice.domain.ArticleComment;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("JPA 연결 테스트")
@Import(JpaConfig.class)
@DataJpaTest
class JpaRepositoryTest {

    private final ArticleRepository articleRepository;
    private final ArticleCommentRepository articleCommentRepository;

    public JpaRepositoryTest(
            @Autowired ArticleRepository articleRepository,
            @Autowired ArticleCommentRepository articleCommentRepository) {
        this.articleRepository = articleRepository;
        this.articleCommentRepository = articleCommentRepository;
    }

    @Test
    @DisplayName("조회 쿼리가 정상적으로 수행된다")
    void selectTest() {
        // given

        // when
        List<Article> articles = articleRepository.findAll();
        List<ArticleComment> articleComments = articleCommentRepository.findAll();

        // then
        assertThat(articles).isNotNull();
        assertThat(articleComments).isNotNull();
    }

}