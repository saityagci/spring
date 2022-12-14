package com.cydeo.repository;

import com.cydeo.entity.MovieCinema;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface MovieCinemaRepository extends JpaRepository<MovieCinema, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to read movie cinema with id
    Optional<MovieCinema> findById(Long id);

    //Write a derived query to count all movie cinemas with a specific cinema id
    Integer countByCinemaId(Long cinemaId);

    //Write a derived query to count all movie cinemas with a specific movie id
    Integer countByMovieId(Long movieId);
    //Write a derived query to list all movie cinemas with higher than a specific date
   // List<MovieCinema> findAllDateTimeAfter(LocalDate localDate);
    //Write a derived query to find the top 3 expensive movies

    //Write a derived query to list all movie cinemas that contain a specific movie name

    //Write a derived query to list all movie cinemas in a specific location

    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query to list all movie cinemas with higher than a specific date

    // ------------------- Native QUERIES ------------------- //

    //Write a native query to count all movie cinemas by cinema id

    //Write a native query that returns all movie cinemas by location name

}