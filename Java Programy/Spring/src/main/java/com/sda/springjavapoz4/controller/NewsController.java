package com.sda.springjavapoz4.controller;

import com.sda.springjavapoz4.model.News;
import com.sda.springjavapoz4.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("news")
public class NewsController {

    @Autowired
    NewsService newsService;
    //Rzutowanie na nasz formularz allNews <form> atrybutem @ModelAttribute
    @PostMapping
    public String postNews(@ModelAttribute News news){
        int index = newsService.addNews(news);
        return  "redirect:/news/" + index;
    }

    @GetMapping
    public ModelAndView getAllNews(){

        ModelAndView news = new ModelAndView("allNews");
        news.addObject("allNews", newsService.getAllService());
        return news;
    }
    //w mappingu i przy pathvariable musi byc ta sama nazwa
    @GetMapping("{id}")
    public ModelAndView getNews(@PathVariable("id") int id){
        ModelAndView news = new ModelAndView("News");
        news.addObject("news",newsService.getNews(id));
        return news;

    }
}
