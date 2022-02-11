package wkos.news.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import wkos.news.model.NewsDto;
import wkos.news.service.NewsService;

@RestController
@RequiredArgsConstructor
public class NewsController {
    private final NewsService newsService;

    @GetMapping("/news")
    @Nullable
    public NewsDto getNews(){
        return NewsService.getNews();
    }
}
