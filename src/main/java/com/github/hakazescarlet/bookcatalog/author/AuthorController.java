package com.github.hakazescarlet.bookcatalog.author;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AuthorController {

    @GetMapping("/author")
    public List<AuthorDto> getAuthors() {
        return new ArrayList<>();
    }
}
