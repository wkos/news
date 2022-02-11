package wkos.news.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import wkos.news.model.NewsDto;
import wkos.news.webclient.NewsClient;

@Service
@Slf4j
@RequiredArgsConstructor
public class NewsService {

    static NewsClient newsClient = new NewsClient();

    public static NewsDto getNews(){
        String response = newsClient.getNewsForCategory("business");
        log.info(response);
        return null;
    }

}
