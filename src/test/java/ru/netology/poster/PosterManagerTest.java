package ru.netology.poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    PosterManager manager = new PosterManager();
    Poster poster1 = new Poster("1", "Reservoir Dogs", 1992, "???");
    Poster poster2 = new Poster("2", "Pulp Fiction", 1994, "???");
    Poster poster3 = new Poster("3", "Jackie Brown", 1997, "???");
    Poster poster4 = new Poster("4", "Kill Bill: Volume 1", 2003, "???");
    Poster poster5 = new Poster("5", "Kill Bill: Volume 2", 2004, "???");
    Poster poster6 = new Poster("6", "Death Proof", 2007, "???");
    Poster poster7 = new Poster("7", "Inglourious Basterds", 2009, "???");
    Poster poster8 = new Poster("8", "Django Unchained", 2012, "???");
    Poster poster9 = new Poster("9", "The Hateful Eight", 2015, "???");
    Poster poster10 = new Poster("10", "Once Upon a Time in Hollywood", 2019, "???");
    Poster poster11 = new Poster("11", "To be announced", 2024, "???");

    @BeforeEach
    public void setup() {
        manager.save(poster1);
        manager.save(poster2);
        manager.save(poster3);
        manager.save(poster4);
        manager.save(poster5);
        manager.save(poster6);
        manager.save(poster7);
        manager.save(poster8);
        manager.save(poster9);
        manager.save(poster10);
        manager.save(poster11);
    }

    @Test
    public void save() {
        PosterManager poster = new PosterManager();
        poster.save(poster1);
        poster.save(poster2);
        poster.save(poster3);

        Poster[] expected = {poster1, poster2, poster3};
        Poster[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllPosters() {
        Poster[] expected = {poster1, poster2, poster3, poster4, poster5, poster6, poster7, poster8, poster9, poster10, poster11};
        Poster[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast10() {
        Poster[] expected = {poster11, poster10, poster9, poster8, poster7, poster6, poster5, poster4, poster3, poster2};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast5() {
        manager = new PosterManager(5);

        manager.save(poster1);
        manager.save(poster2);
        manager.save(poster3);
        manager.save(poster4);
        manager.save(poster5);
        manager.save(poster6);
        manager.save(poster7);
        manager.save(poster8);
        manager.save(poster9);
        manager.save(poster10);
        manager.save(poster11);


        Poster[] expected = {poster11, poster10, poster9, poster8, poster7};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
