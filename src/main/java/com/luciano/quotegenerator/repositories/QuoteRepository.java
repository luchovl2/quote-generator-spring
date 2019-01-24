package com.luciano.quotegenerator.repositories;

import com.luciano.quotegenerator.domain.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteRepository extends JpaRepository<Quote, Long>
{
}
