package ru.netology.poster;

public class PosterManager {
    private Poster[] posters = new Poster[0];
    private int maxPosters = 10;
    public PosterManager(int maxPosters) {
        this.maxPosters = maxPosters;
    }

    public PosterManager() {
    }

    public void save(Poster poster) {
        Poster[] tmp = new Poster[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    public Poster[] findAll() {
        return posters;
    }

    public Poster[] findLast() {
          int resultLength;
        if (maxPosters >= 10) {
            resultLength = 10;
        } else {
            resultLength = maxPosters;
        }
        Poster[] reversed = new Poster[resultLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = posters[posters.length -1 -i];
        }
        return reversed;
    }
}
