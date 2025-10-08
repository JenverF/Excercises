package com.pluralsight.workbook3;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class VideoGameExercise {
    static void main() {
        List<VideoGame> videoGames = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("files/videogames.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            bufferedReader.readLine();
            String gameString;
            while((gameString = bufferedReader.readLine()) != null) {
                if(gameString.isEmpty()) {
                    System.out.println("Empty line");
                }
                String[] gamesArr = gameString.split(",");
                if(gamesArr.length != 5) {
                    System.out.println("This doesn't have 5 parts");
                }
                VideoGame videogame = new VideoGame((gamesArr[0]), gamesArr[1], gamesArr[2], Integer.parseInt(gamesArr[3]), Double.parseDouble(gamesArr[4]));
                videoGames.add(videogame);
            }
            bufferedReader.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }

        printInsights(videoGames);
    }

    public static void printInsights(List<VideoGame> videoGames) {
        double totalRating = 0;
        int oldestYear = videoGames.get(0).getYear();
        int pcCount = 0;

        for (int i = 0; i < videoGames.size(); i++) {
            totalRating += videoGames.get(i).getRating();

            if (oldestYear > videoGames.get(i).getYear()) {
                oldestYear = videoGames.get(i).getYear();
            }

            if (videoGames.get(i).getPlatform().equalsIgnoreCase("PC")) {
                pcCount++;
            }
        }

        System.out.println("Total games loaded: " + videoGames.size());
        System.out.printf("Average rating: %.2f%n", totalRating/videoGames.size());
        System.out.println("Oldest release year: " + oldestYear);
        System.out.println("Number of PC titles: " + pcCount);

    }
}
