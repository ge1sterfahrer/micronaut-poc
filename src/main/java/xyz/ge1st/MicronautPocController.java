package xyz.ge1st;

import io.micronaut.http.annotation.*;

@Controller("/micronaut-poc")
public class MicronautPocController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}