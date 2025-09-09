/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.series;

/**
 *
 * @author RC_Student_lab
 */
public class SeriesModel {
      private String seriesId;
    private String seriesName;
    private String seriesAge;
    private String seriesNumberOfEpisodes;

    
    public SeriesModel(String seriesId, String seriesName, String seriesAge, String seriesNumberOfEpisodes) {
        this.seriesId = seriesId;
        this.seriesName = seriesName;
        this.seriesAge = seriesAge;
        this.seriesNumberOfEpisodes = seriesNumberOfEpisodes;
    }

   
    public String getSeriesId() { return seriesId; }
    public String getSeriesName() { return seriesName; }
    public String getSeriesAge() { return seriesAge; }
    public String getSeriesNumberOfEpisodes() { return seriesNumberOfEpisodes; }

    
    public void setSeriesAge(String seriesAge) { this.seriesAge = seriesAge; }

    @Override
    public String toString() {
        return "Series ID: " + seriesId +
               "\nSeries Name: " + seriesName +
               "\nAge Restriction: " + seriesAge +
               "\nNumber of Episodes: " + seriesNumberOfEpisodes + "\n";
    }
}