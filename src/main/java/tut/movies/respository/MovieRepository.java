package tut.movies.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tut.movies.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Long> {
}
