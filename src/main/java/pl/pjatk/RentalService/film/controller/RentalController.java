package pl.pjatk.RentalService.film.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.pjatk.RentalService.film.model.Movies;
import pl.pjatk.RentalService.film.service.RentalService;

@RestController
public class RentalController {
   private final RentalService rentalService;

    public RentalController(RentalService rentalService) {
        this.rentalService = rentalService;
    }


    @GetMapping("/movies/{id}")
    public ResponseEntity<Movies> findById(@PathVariable Long id) {
        return ResponseEntity.ok(rentalService.getMovieById(id));
    }

//    @GetMapping("/moviess/{id}")
//    public ResponseEntity<Movies> findById(@PathVariable Long id) {
//        return ResponseEntity.ok(rentalService.getMovieById(id));
//    }

}
