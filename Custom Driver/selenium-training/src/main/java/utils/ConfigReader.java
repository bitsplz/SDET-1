package utils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class ConfigReader {
    private Properties properties;

    // Constructor to load properties from a specified file
    public ConfigReader(String filePath) {
        properties = new Properties();
        try (InputStream input = Files.newInputStream(Paths.get(filePath))) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to get property value by key
    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}

