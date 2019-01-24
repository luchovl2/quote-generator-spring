package com.luciano.quotegenerator.domain;

import org.omg.CORBA.portable.IDLEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Quote
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String quote;
    private String author;

    public Quote()
    {
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getQuote()
    {
        return quote;
    }

    public void setQuote(String quote)
    {
        this.quote = quote;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }
}
