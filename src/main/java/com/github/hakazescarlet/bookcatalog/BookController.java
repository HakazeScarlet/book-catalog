package com.github.hakazescarlet.bookcatalog;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @PostMapping("/books")
    public Long createBook(@RequestBody BookCreateUpdateCommand bookCreateUpdateCommand) {
        return 111111111111L;
    }
}
