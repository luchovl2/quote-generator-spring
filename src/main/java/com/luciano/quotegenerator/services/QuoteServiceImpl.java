package com.luciano.quotegenerator.services;

import com.luciano.quotegenerator.domain.Quote;
import com.luciano.quotegenerator.repositories.QuoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class QuoteServiceImpl implements QuoteService
{
    private final QuoteRepository repository;

    public QuoteServiceImpl(QuoteRepository repository)
    {
        this.repository = repository;
    }

    @Override
    public Quote getRandomQuote()
    {
        List<Quote> quotes = repository.findAll();
        Random random = new Random();

        return quotes.get(random.nextInt(quotes.size()));
    }

    @Override
    public List<Quote> getAllQuotes()
    {
        return repository.findAll();
    }
}
