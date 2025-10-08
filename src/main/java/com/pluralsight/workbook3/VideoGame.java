package com.pluralsight.workbook3;

public class VideoGame {
    private String title;
    private String platform;
    private String genre;
    private int year;
    private double rating;

    public VideoGame(String title, String platform, String genre, int year, double rating) {
        this.rating = rating;
        this.year = year;
        this.genre = genre;
        this.platform = platform;
        this.title = title;
    }

    public String toCsvGameString() {
        return title + ", " + platform + ", " + genre + ", " + year + ", " + rating;
    }

    public String getTitle() {
        return title;
    }

    public String getPlatform() {
        return platform;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }
}
