package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public void Match(String reg, String text){
        // Compile the pattern
        Pattern pattern = Pattern.compile(reg); // regex to match digits
        // Create a matcher for the input string
        Matcher matcher = pattern.matcher(text);
        // Check for matches
        if (matcher.find()) {
            System.out.println("Match found: " + matcher.group()); // Output: Match found: 123
        } else {
            System.out.println("No match found");
        }
    }
    public void split(String text){
        // Compile the pattern for splitting
        Pattern pattern = Pattern.compile(",");
        // Split the string by commas
        String[] fruits = pattern.split(text);
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
