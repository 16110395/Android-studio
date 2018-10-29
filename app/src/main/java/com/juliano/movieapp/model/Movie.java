package com.juliano.movieapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    @SerializedName("vote_count")
    private Integer voteCount;
    @SerializedName("id")
    private Integer id;
    @SerializedName("video")
    private Boolean video;
    @SerializedName("vote_average")
    private double voteAverage;
    @SerializedName("title")
    private String title;
    @SerializedName("popularity")
    private double popularity;
    @SerializedName("poster_path")
    private String posterPath;
    @SerializedName("original_language")
    private String originalLanguage;
    @SerializedName("original_title")
    private String originaTitle;
    @SerializedName("genre_ids")
    private List<Integer> genreIds = new ArrayList<Integer>();
    @SerializedName("backdrop_path")
    private String bacdropPath;
    @SerializedName("adult")
    private boolean adult;
    @SerializedName("overview")
    private String overview;
    @SerializedName("release_date")
    private String releaseDate;

    public Movie(Integer voteCount,Integer id, Boolean video, double voteAverage, String title, double popularity, String posterPath, String originalLanguage,String originaTitle,
    List<Integer> genreIds, String bacdropPath, boolean adult,String overview, String releaseDate ) {
        this.voteCount=voteCount;
        this.id = id;
        this.video = video;
        this.voteAverage =voteAverage;
        this.title = title;
        this.popularity = popularity;
        this.posterPath = posterPath;
        this.originalLanguage =originalLanguage;
        this.originaTitle = originaTitle;
        this.genreIds = genreIds;
        this.bacdropPath = bacdropPath;
        this.adult = adult;
        this.overview = overview;
        this.releaseDate = releaseDate;

    }
    String baseImageUrl = "https://image.tmdb.org/t/p/w500/";

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    public  Integer getId(){
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getVideo(){
        return video;
    }
    public void setVideo(Boolean video) {
        this.video = video;
    }
    public double getVoteAverage(){
        return voteAverage;
    }
    public void setVoteAverage(double voteAverage){
        this.voteAverage= voteAverage;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public double getPopularity(){
        return popularity=popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public String getPosterPath() {
        return "https://image.tmdb.org/t/p/w500" + posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getOriginaTitle() {
        return originaTitle;
    }

    public void setOriginaTitle(String originaTitle) {
        this.originaTitle = originaTitle;
    }

    public List<Integer> getGenreIds() {
        return genreIds;
    }

    public void setGenreIds(List<Integer> genreIds) {
        this.genreIds = genreIds;
    }

    public String getBacdropPath() {
        return bacdropPath;
    }

    public void setBacdropPath(String bacdropPath) {
        this.bacdropPath = bacdropPath;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
