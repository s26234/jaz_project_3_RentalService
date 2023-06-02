package pl.pjatk.RentalService.film.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.pjatk.RentalService.film.model.Movies;

import java.net.URI;

@Service
public class RentalService {

    public final RestTemplate restTemplate;

    public RentalService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Movies getMovieById (Long id) {
        String url = "http://localhost:8080/movies/" + id;
        return restTemplate.getForObject(URI.create(url), Movies.class);
    }

//    public Movies returnMovie(Long id) {
//        return Movies(getMovieById(id));
//    }
}
