/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.series;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class Series {
private static Scanner sc = new Scanner(System.in);
    private static SeriesManager manager = new SeriesManager();

     public void runApplication() {
        System.out.println("LATEST SERIES - 2025");
        System.out.println("****************************");
        System.out.print("Enter (1) to launch menu or any other key to exit: ");
        String choice = sc.nextLine();

        if (!choice.equals("1")) {
            System.out.println("Application exited.");
            return;
        }

        boolean running = true;
        while (running) {
            printMenu();
            String option = sc.nextLine();

            switch (option) {
                case "1": captureSeries(); break;
                case "2": searchSeries(); break;
                case "3": updateSeries(); break;
                case "4": deleteSeries(); break;
                case "5": manager.printReport(); break;
                case "6": running = false; System.out.println("Exiting application..."); break;
                default: System.out.println("Invalid option, try again.");
            }
        }
    }

  
    private static void captureSeries() {
        System.out.print("Enter Series ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Series Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age Restriction: ");
        String age = sc.nextLine();
        System.out.print("Enter Number of Episodes: ");
        String episodes = sc.nextLine();

        manager.addSeries(id, name, age, episodes);
    }

    private static void searchSeries() {
        System.out.print("Enter Series ID to search: ");
        String id = sc.nextLine();
        SeriesModel result = manager.searchSeries(id);

        if (result != null) {
            System.out.println("Series Found:\n" + result);
        } else {
            System.out.println("No series found with ID: " + id);
        }
    }

    private static void updateSeries() {
        System.out.print("Enter Series ID to update: ");
        String id = sc.nextLine();
        System.out.print("Enter new Age Restriction: ");
        String newAge = sc.nextLine();

        if (manager.updateSeriesAge(id, newAge)) {
            System.out.println("Series age restriction updated!");
        } else {
            System.out.println("No series found with ID: " + id);
        }
    }

    private static void deleteSeries() {
        System.out.print("Enter Series ID to delete: ");
        String id = sc.nextLine();

        if (manager.deleteSeries(id)) {
            System.out.println("Series deleted successfully!");
        } else {
            System.out.println("No series found with ID: " + id);
        }
    }

    private static void printMenu() {
        System.out.println("\nPlease select one of the following menu items:");
        System.out.println("(1) Capture a new series.");
        System.out.println("(2) Search for a series.");
        System.out.println("(3) Update series age restriction.");
        System.out.println("(4) Delete a series.");
        System.out.println("(5) Print series report - 2025.");
        System.out.println("(6) Exit Application.");
        System.out.print("Enter option: ");
    }
}