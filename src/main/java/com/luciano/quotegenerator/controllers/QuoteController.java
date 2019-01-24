package com.luciano.quotegenerator.controllers;

import com.luciano.quotegenerator.domain.Quote;
import com.luciano.quotegenerator.services.QuoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

//@RestController
@Controller
@RequestMapping("/v1/quotes")
public class QuoteController
{
    private final QuoteService service;

    public QuoteController(QuoteService service)
    {
        this.service = service;
    }

    @GetMapping("/quote")
    public String getQuote(Model model)
    {
        return "quotes";
    }

    @GetMapping("/quote/new")
    @ResponseBody
    public Quote getNewQuote(Model model)
    {
        return service.getRandomQuote();
    }

    @GetMapping("/all")
    @ResponseBody
    public List<Quote> getAllQuotes()
    {
        return service.getAllQuotes();
    }

    @RequestMapping("/error")
    public String error()
    {
        return "error";
    }
}
