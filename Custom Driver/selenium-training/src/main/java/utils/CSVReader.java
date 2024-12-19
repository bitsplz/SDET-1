package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    public static String getLocator(String action, String platform) {
        String csvFile = "src/main/resources/testData/test.csv"; // Update this path to your CSV file
        String line;
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String[] headers = br.readLine().trim().split(csvSplitBy); // Read header row

            // Find the index of the platform
            int platformIndex = -1;
            for (int i = 0; i < headers.length; i++) {
                if (headers[i].trim().equalsIgnoreCase(platform)) {
                    platformIndex = i;
                    break;
                }
            }

            if (platformIndex == -1) {
                System.out.println("Platform not found: " + platform);
                return null; // Return null if platform not found
            }

            // Read each subsequent line for the specified action
            while ((line = br.readLine()) != null) {
                String[] values = line.trim().split(csvSplitBy);
                if (values.length > platformIndex && values[0].trim().equalsIgnoreCase(action)) {
                    return values[platformIndex].trim(); // Return the found locator
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null; // Return null if no match is found
    }

    public static void main(String[] args) {
        String webLocator = getLocator("login", "Web");
        System.out.println("Web login locator: " + webLocator); // Output: <loginbtn>

        String androidLocator = getLocator("login", "Android");
        System.out.println("Android login locator: " + androidLocator);

        String iosLocator = getLocator("dropdown", "iOS");
        System.out.println("iOS login locator: " + iosLocator);
    }
}
