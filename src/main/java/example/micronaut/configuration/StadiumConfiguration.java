package example.micronaut.configuration;

import io.micronaut.context.annotation.EachProperty;
import io.micronaut.context.annotation.Parameter;
import io.micronaut.serde.annotation.Serdeable;
import lombok.Getter;
import lombok.Setter;

@Serdeable
@Getter
@Setter
@EachProperty("stadium")
public class StadiumConfiguration {
    private String name;
    private String city;
    private Integer size;

    public StadiumConfiguration(@Parameter String name) {
        this.name = name;
    }

}