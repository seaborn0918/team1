package com.bitc.templates.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JangdokdaeController {

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String mainPage() {
        return "jangdokdae/main";
    }

    @RequestMapping(value = "/movieDetail", method = RequestMethod.GET)
    public String moveDetailPage() {
        return "jangdokdae/movieDetail";
    }

    @RequestMapping(value = "/movieReview", method = RequestMethod.GET)
    public String moveReviewPage() {
        return "jangdokdae/movieReview";
    }
}
