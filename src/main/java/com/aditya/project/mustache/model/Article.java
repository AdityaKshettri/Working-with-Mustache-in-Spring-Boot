package com.aditya.project.mustache.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Article {

    private int id;
    private String name;
    private String description;
    private String author;
}
