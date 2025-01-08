package com.github.hakazescarlet.bookcatalog.author;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @GetMapping("/")
    public List<AuthorDto> getAuthors() {
        return new ArrayList<>();
    }
}
