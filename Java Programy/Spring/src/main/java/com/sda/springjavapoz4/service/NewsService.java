package com.sda.springjavapoz4.service;

import com.sda.springjavapoz4.model.News;
import com.sda.springjavapoz4.repository.NewsRepository;
import com.sda.springjavapoz4.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class NewsService {

    @Autowired

    NewsRepository newsRepository;


    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;


    public NewsService() {

    }

    @PostConstruct
    public void init() {
        newsRepository.save(newNews());
        newsRepository.save(newNews());
        newsRepository.save(newNews());
        newsRepository.save(newNews());
        newsRepository.save(newNews());
        newsRepository.save(newNews());

    }

    public News newNews() {
        News news = new News(
                "gdsggs",
                "opis opis opis",
                LocalDate.now(),
                "path1",
                "path2",
                userRepository.findOne((long)2));
        return news;

    }

    public List<News> getAllService() {
        List<News> collect = StreamSupport.stream(newsRepository.findAll().spliterator(), false).collect(Collectors.toList());
        return collect;
    }


    public News getNews(int id) {
        News news = newsRepository.findOne((long) id);
        return news;
    }

    public int addNews(News news) {
        long id = newsRepository.save(news).getId();
        return (int) id;
    }

    public int saveNews(News news) {
        return (int) newsRepository.save(news).getId();
    }
}
