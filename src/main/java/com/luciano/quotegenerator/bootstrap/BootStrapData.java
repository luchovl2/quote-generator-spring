package com.luciano.quotegenerator.bootstrap;

import com.luciano.quotegenerator.domain.Quote;
import com.luciano.quotegenerator.repositories.QuoteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner
{
    private final QuoteRepository repository;

    public BootStrapData(QuoteRepository repository)
    {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception
    {
        System.out.println("Loading the f*cking data...");

        //cargar los datos en la DB
        Quote quote = new Quote();
        quote.setQuote("¡Ay, por ahí no!");
        quote.setAuthor("Tu vieja");
        repository.save(quote);

        Quote quote2 = new Quote();
        quote2.setQuote("Me faltó llevarme el uno");
        quote2.setAuthor("Albert Einstein");
        repository.save(quote2);

        Quote quote3 = new Quote();
        quote3.setQuote("Eeeeeehhhh eeeeehhhhh");
        quote3.setAuthor("Diego Maradona");
        repository.save(quote3);

        Quote quote4 = new Quote();
        quote4.setQuote("Cuando haiga la calor...");
        quote4.setAuthor("Jorge Luis Borges");
        repository.save(quote4);

        Quote quote5 = new Quote();
        quote5.setQuote("Se van a ye... yemontar a la estratósfera");
        quote5.setAuthor("Carlos Menem");
        repository.save(quote5);

        Quote quote6 = new Quote();
        quote6.setQuote("¿Mauricio? Buen pibe, me cae bárbaro.");
        quote6.setAuthor("Cristina Kirchner");
        repository.save(quote6);

        Quote quote7 = new Quote();
        quote7.setQuote("Me pica la nariz y la put...");
        quote7.setAuthor("Stephen Hawking");
        repository.save(quote7);

        System.out.println("The f*cking data is loaded, papá.");
    }
}
