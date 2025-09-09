/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.series;
import java.util.ArrayList;
/**
 *
 * @author RC_Student_lab
 */
public class SeriesManager {
      private ArrayList<SeriesModel> seriesList = new ArrayList<>();

    // Capture a new series
    public void addSeries(String id, String name, String age, String episodes) {
        SeriesModel s = new SeriesModel(id, name, age, episodes);
        seriesList.add(s);
        System.out.println("Series successfully saved!\n");
    }

    // Search for a series
    public SeriesModel searchSeries(String id) {
        for (SeriesModel s : seriesList) {
            if (s.getSeriesId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    // Update a series
    public boolean updateSeriesAge(String id, String newAge) {
        SeriesModel s = searchSeries(id);
        if (s != null) {
            s.setSeriesAge(newAge);
            return true;
        }
        return false;
    }

    // Delete a series
    public boolean deleteSeries(String id) {
        SeriesModel s = searchSeries(id);
        if (s != null) {
            seriesList.remove(s);
            return true;
        }
        return false;
    }

    // Print report
    public void printReport() {
        if (seriesList.isEmpty()) {
            System.out.println("No series available.");
        } else {
            System.out.println("===== Series Report - 2025 =====");
            for (SeriesModel s : seriesList) {
                System.out.println(s);
            }
        }
    }
}