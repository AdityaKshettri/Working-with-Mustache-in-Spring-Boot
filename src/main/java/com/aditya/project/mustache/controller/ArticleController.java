package com.aditya.project.mustache.controller;

import com.aditya.project.mustache.model.Article;
import com.aditya.project.mustache.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/articles")
    public ModelAndView displayArticle(Map<String, Object> model) {
        List<Article> articles = articleService.generateArticles();
        model.put("articles", articles);
        return new ModelAndView("index", model);
    }
}
