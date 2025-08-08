package com.ll.jsp.board.boundedContext.article.repository;

import com.ll.jsp.board.boundedContext.article.dto.Article;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.LongStream;

public class ArticleRepository {
    private List<Article> articleList;
    private long lastId;

    public ArticleRepository() {
        articleList = new ArrayList<>();
        makeTestData();
        lastId = articleList.get(articleList.size() - 1).getId();
    }

    public List<Article> findAll() {
        return this.articleList.stream()
                .sorted(Comparator.comparing(Article::getId).reversed()) // id 내림차순
                .toList();
    }

    public long write(String title, String content) {
        long id = ++lastId;
        Article article = new Article(id, title, content);
        articleList.add(article);
        return id;
    }

    private void makeTestData() {
        LongStream.rangeClosed(1, 5).forEach(i -> {
            Article article = new Article(i, "제목 " + i, "내용 " + i);
            articleList.add(article);
        });
    }
}
