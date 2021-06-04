package example.micronaut;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hey")
public class HelloController {

    @Get(produces = MediaType.TEXT_PLAIN)
    public String hello() {
        return "HELL";
    }
}
