package com.github.hakazescarlet.bookcatalog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping("/getBookId")
    public long getBookId(@RequestBody BookCreateUpdateCommand bookCreateUpdateCommand) {
        return 111111111;
    }
}
