package me.gnoyes.boardservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@EnableJpaAuditing
@Configuration
public class JpaConfig {


    /**
     * JPA Entity에서 @CreatedBy 또는 @LastModifiedBy에 대해서 값을 넣어줄 때 사용된다.
     * @return
     */
    @Bean
    public AuditorAware<String> auditorAware() {
        return () -> Optional.of("TestSystem"); // TODO : 스프링 시큐리티로 인증 기능을 붙이게 될 때 수정 필요함
    }
}
