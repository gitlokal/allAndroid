package com.example.bartek.jsonrestapp;

/**
 * Created by bartek on 25.04.17.
 */
public class Markers {

            private String homeTeam;
            private String awayTeam;
            private String markerImage;
            private String information;
            private String fixture;
            private String capacity;
            private int tv;

    public int getTv() {
        return tv;
    }

    public void setTv(int tv) {
        this.tv = tv;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public String getMarkerImage() {
        return markerImage;
    }

    public void setMarkerImage(String markerImage) {
        this.markerImage = markerImage;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getFixture() {
        return fixture;
    }

    public void setFixture(String fixture) {
        this.fixture = fixture;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Markers{" +
                "homeTeam='" + homeTeam + '\'' +
                ", awayTeam='" + awayTeam + '\'' +
                ", markerImage='" + markerImage + '\'' +
                ", information='" + information + '\'' +
                ", fixture='" + fixture + '\'' +
                ", capacity='" + capacity + '\'' +
                ", tv=" + tv +
                '}';
    }
}
