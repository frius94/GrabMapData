package tomtom;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String apiKey = "";
        try {
            byte[] encoded = Files.readAllBytes(Paths.get("src/apikey.txt"));
            apiKey = new String(encoded, Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.println("1) Ich möchte eine Adresse herausfinden");
            System.out.println("2) Ich möchte ein POI (Point of Interest) finden");
            System.out.println("x) Beenden");
            choice = scanner.nextLine();
            String input = "";
            switch (choice) {
                case "1":
                    System.out.println("Welche Adresse möchtest du wissen?");
                    input = scanner.nextLine();
                    input = "https://api.tomtom.com/search/2/geocode/" + URLEncoder.encode(input, StandardCharsets.UTF_8) + ".json?key=" + apiKey;
                    break;
                case "2":
                    System.out.println("Welchen POI möchtest du finden?");
                    input = scanner.nextLine();
                    input = "https://api.tomtom.com/search/2/poiSearch/" + URLEncoder.encode(input, StandardCharsets.UTF_8) + ".json?key=" + apiKey;
                    break;
                case "x":
                    System.exit(0);
                default:
                    System.out.println("Bitte wähle eine gültige Auswahl aus.");
                    break;
            }
            try {
                URL url = new URL(input);
                InputStreamReader reader = new InputStreamReader(url.openStream());
                if (choice.equals("1")) {
                    Location location = new Gson().fromJson(reader, Location.class);
                    System.out.println();
                    location.printInformation();
                }
                if (choice.equals("2")) {
                    Poi poi = new Gson().fromJson(reader, Poi.class);
                    System.out.println();
                    poi.printInformation();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (!choice.equals("x"));
    }


}
