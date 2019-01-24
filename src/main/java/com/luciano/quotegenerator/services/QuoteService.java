package com.luciano.quotegenerator.services;

import com.luciano.quotegenerator.domain.Quote;

import java.util.List;

public interface QuoteService
{
    Quote getRandomQuote();

    List<Quote> getAllQuotes();
}
