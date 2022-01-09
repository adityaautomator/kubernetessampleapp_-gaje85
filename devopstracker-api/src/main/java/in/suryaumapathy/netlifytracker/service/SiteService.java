package in.suryaumapathy.netlifytracker.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

@Service
public class SiteService {

    @Autowired
    RestTemplate restTemplate;

    private final String API_TOKEN = "w8mTb6I8coN4r7xnbqiVaVROSJFbbk1o8Iyo8tmn298"; // d67be73eebe3cecd000c8155c818197894d5fed7";
    private final String URL = "https://api.netlify.com/api/v1/sites";

    private HttpHeaders getHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer " + API_TOKEN);
        return headers;
    }

    public Object create(Object data) {
        // HttpHeaders headers = new HttpHeaders();
        // headers.setContentType(MediaType.APPLICATION_JSON);
        // headers.set("Authorization", "Bearer " + API_TOKEN);
        // HttpEntity<Object> entity = new HttpEntity<Object>(data, headers);
        HttpEntity<Object> entity = new HttpEntity<Object>(data, getHeaders());
        ResponseEntity<Object> response = restTemplate.exchange(URL, HttpMethod.POST, entity, Object.class);
        System.out.println(response.getBody());
        return response.getBody();
    }

    public Object list() {
        HttpEntity<Object> entity = new HttpEntity<Object>(getHeaders());
        ResponseEntity<Object> response = restTemplate.exchange(URL, HttpMethod.GET, entity, Object.class);
        System.out.println();
        return response.getBody();
    }


    public Object details(String id){
        HttpEntity<Object> entity = new HttpEntity<Object>(getHeaders());
        ResponseEntity<Object> response = restTemplate.exchange(URL+"/"+id , HttpMethod.GET, entity, Object.class);
        System.out.println();
        return response.getBody();
    }

}
