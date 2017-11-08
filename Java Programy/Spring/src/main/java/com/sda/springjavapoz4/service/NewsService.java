package com.sda.springjavapoz4.service;

import com.sda.springjavapoz4.model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class NewsService {

    private List<News> newsList;


    @Autowired
    UserService userService;


    public NewsService() {
        this.newsList = new ArrayList<>();

    }

@PostConstruct
    public void init(){
    newsList.add(newNews());
    newsList.add(newNews());
    newsList.add(newNews());
    newsList.add(newNews());
    newsList.add(newNews());
    newsList.add(newNews());

}

    public News newNews() {
        News news = new News(1L,
                "gdsggs",
                "Lorem ipsum dolor sit amet,\n" +
                "            consectetur adipisicing elit. Ab adipisci aliquid architecto\n" +
                "            at atque culpa dolor dolore ducimus earum et excepturi\n" +
                "            explicabo harum ipsa, minus molestiae mollitia necessitatibus\n" +
                "            nobis nostrum, odit officiis perferendis quis sed\n" +
                "            similique sunt tempora ullam voluptates.\n" +
                "            Accusantium aut ex, fuga fugit iste maiores nemo repellat sed.",
                LocalDate.now(),
                "path1",
                "path2",
                userService.getExampleUser());
        return news;

    }

    public List<News> getAllService() {
        return newsList;
    }


    public News getNews(int id) {
        News news = newsList.get(id);
        return news;
    }

    public int addNews(News news) {
        news.setAuthor(userService.getExampleUser());
        newsList.add(news);
    return newsList.size()-1;
    }
}
