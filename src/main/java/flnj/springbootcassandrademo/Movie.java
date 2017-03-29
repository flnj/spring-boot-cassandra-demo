package flnj.springbootcassandrademo;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

/**
 * Created by alisak on 3/28/17.
 */
@Table
public class Movie {
    @PrimaryKey
    private String movieid;

    @Column
    private String name;
    // add getters, setters, equals, hashCode


    public String getMovieid() {
        return movieid;
    }

    public void setMovieid(String movieid) {
        this.movieid = movieid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
