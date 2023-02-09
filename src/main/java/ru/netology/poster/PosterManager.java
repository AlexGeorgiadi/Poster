package ru.netology.poster;

public class PosterManager {
    private Poster[] posters = new Poster[0];
    private int maxPosters;

    public PosterManager(int maxPosters) {
        this.maxPosters = maxPosters;
    }

    public PosterManager() {
        this.maxPosters = 10;
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
        if (posters.length < maxPosters) {
            resultLength = posters.length;
        } else {
            resultLength = maxPosters;
        }
        Poster[] result = new Poster[resultLength];

        for (int i = 0; i < result.length; i++) {
            result[i] = posters[posters.length - 1 - i];
        }
        return result;
    }
}
