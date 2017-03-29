package flnj.springbootcassandrademo;

import org.springframework.data.cassandra.repository.TypedIdCassandraRepository;

/**
 * Created by alisak on 3/28/17.
 */
public interface MovieRepository extends TypedIdCassandraRepository<Movie, String> {
}
