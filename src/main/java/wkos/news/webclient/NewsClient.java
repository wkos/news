package wkos.news.webclient;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class NewsClient {

    public static final String NEWS_URL = "https://newsapi.org/v2/top-headlines";
    public static final String API_KEY = "e3681d86a0714dc09154b874029e42b5";
    private RestTemplate restTemplate = new RestTemplate();

    public String getNewsForCategory(String category){
        return restTemplate.getForObject(NEWS_URL + "?country=pl&category={category}&apiKey={apiKey}",
                String.class, category, API_KEY);
    }
}
