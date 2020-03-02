package com.xiaopy.querydsl.config;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

/**
 * @author xiaopeiyu
 * @since 2020/3/2
 */
@Configuration
public class JPAQueryConfig {

    @Bean
    public JPAQueryFactory jpaQueryFactory(EntityManager entityManager){
        return new JPAQueryFactory(entityManager);
    }
}
