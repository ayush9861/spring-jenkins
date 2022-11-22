package com.rest.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import org.springframework.data.annotation.Id;

@Document
public class Server {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;


    private String name;

    private String language;

    private String framework;

    public Server(String id, String name, String language, String framework) {
        this.id = id;
        this.name = name;
        this.language = language;
        this.framework = framework;
    }




    public Server() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    @Override
    public String toString() {
        return "Server [name=" + name + ", id=" + id + ", language=" + language + ", framework=" + framework + "]";
    }


}