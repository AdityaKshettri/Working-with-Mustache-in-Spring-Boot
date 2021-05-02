package com.aditya.project.mustache.service;

import com.aditya.project.mustache.model.Article;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService {

    public List<Article> generateArticles() {
        List<Article> articles = new ArrayList<>();
        articles.add(new Article(1, "First", null, "Aditya"));
        articles.add(new Article(2, "Second", "second article", "Aditya"));
        articles.add(new Article(3, "Third", "third article", "Aditya"));
        return articles;
    }
}
