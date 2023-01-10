package Java_homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Program8 {

    public static void main(String[] args) {
        // Create a new HashMap object called stations that stores the names of London Underground stations as keys and the lines that pass through those stations as values
        HashMap<String, String> stations = new HashMap<>();

        // Add stations to the map
        // First String = station name
        // Second set of strings = tube limes
        stations.put("Vancouver", "Olympic village, king edward, Langara-49th, Bridgeport,Sea Island centre, Richmond Brighouse");
        stations.put("Waterfront", "Vancouver,Olympic village, king edward ");
        stations.put("Edmonton", "Century park,clareview,NAIT,University");
        stations.put("Alberta", "Strathcona,medicine hat,calagary");
        stations.put("British Columbia", "Victoria,dubcan,courtenay");
        stations.put("Manitoba", "Dauphin,Brandon,Winnipeg");


        // Create a Scanner object for reading user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a station name
        System.out.print("Enter a station name: ");
        String station = scanner.nextLine();

        // Convert the user input to lowercase
        station = station.toLowerCase();

        // Check if the map contains a key that matches the user input
        boolean found = false;
        for (HashMap.Entry<String, String> entry : stations.entrySet()) {
            if (entry.getKey().toLowerCase().equals(station)) {
                // If a match is found, print out the lines that pass through the station
                System.out.println("The following lines pass through " + entry.getKey() + ": " + entry.getValue());
                found = true;
                break;
            }
        }
        if (!found) {
            // If no match is found, print an error message
            System.out.println("Sorry, I could not find that station.");
        }

    }

}
