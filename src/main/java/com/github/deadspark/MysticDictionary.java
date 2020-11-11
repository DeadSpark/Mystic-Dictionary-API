package com.github.deadspark;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.deadspark.utils.JsonFormatOwl;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class MysticDictionary {

    public static ArrayList<String> typeArray = new ArrayList<>();
    public static ArrayList<String> definitionArray = new ArrayList<>();
    public static ArrayList<String> exampleArray = new ArrayList<>();
    public static ArrayList<String> imageUrlArray = new ArrayList<>();
    public static ArrayList<String> emojiArray = new ArrayList<>();
    public static String word;
    public static String pronunciation;
    public static String token;

    public static void setToken(String token) {
        MysticDictionary.token = token;
    }

    public static ArrayList<String> getType(String word) throws IOException {

        String curlCommand = "curl --header \"Authorization: Token " + token + "\" https://owlbot.info/api/v4/dictionary/" + word + " -s";
        Process process = Runtime.getRuntime().exec(curlCommand);
        InputStream inputStream = process.getInputStream();
        Scanner scanner = new Scanner(new InputStreamReader(inputStream));
        StringBuilder builder = new StringBuilder();

        while (scanner.hasNextLine()) {

            builder.append(scanner.nextLine());

        }

        ObjectMapper mapper = new ObjectMapper();
        JsonFormatOwl getOwlData = mapper.readValue(String.valueOf(builder), JsonFormatOwl.class);
        int numOfTypes = getOwlData.getDefinitions().size();
        int i = 0;

        do {

            String type = getOwlData.getDefinitions().get(i).get("type");
            typeArray.add(type);
            i++;

        }while (i < numOfTypes);

        return typeArray;
    }

    public static ArrayList<String> getDefinition(String word) throws IOException {

        String curlCommand = "curl --header \"Authorization: Token " + token + "\" https://owlbot.info/api/v4/dictionary/" + word + " -s";
        Process process = Runtime.getRuntime().exec(curlCommand);
        InputStream inputStream = process.getInputStream();
        Scanner scanner = new Scanner(new InputStreamReader(inputStream));
        StringBuilder builder = new StringBuilder();

        while (scanner.hasNextLine()) {

            builder.append(scanner.nextLine());

        }

        ObjectMapper mapper = new ObjectMapper();
        JsonFormatOwl getOwlData = mapper.readValue(String.valueOf(builder), JsonFormatOwl.class);
        int numOfDefinitions = getOwlData.getDefinitions().size();
        int i = 0;

        do {

            String definition = getOwlData.getDefinitions().get(i).get("definition");
            definitionArray.add(definition);
            i++;

        }while (i < numOfDefinitions);

        return definitionArray;
    }

    public static ArrayList<String> getExample(String word) throws IOException {

        String curlCommand = "curl --header \"Authorization: Token " + token + "\" https://owlbot.info/api/v4/dictionary/" + word + " -s";
        Process process = Runtime.getRuntime().exec(curlCommand);
        InputStream inputStream = process.getInputStream();
        Scanner scanner = new Scanner(new InputStreamReader(inputStream));
        StringBuilder builder = new StringBuilder();

        while (scanner.hasNextLine()) {

            builder.append(scanner.nextLine());

        }

        ObjectMapper mapper = new ObjectMapper();
        JsonFormatOwl getOwlData = mapper.readValue(String.valueOf(builder), JsonFormatOwl.class);
        int numOfExamples = getOwlData.getDefinitions().size();
        int i = 0;

        do {

            String example = getOwlData.getDefinitions().get(i).get("example");
            exampleArray.add(example);
            i++;

        }while (i < numOfExamples);

        return exampleArray;
    }

    public static ArrayList<String> getImageUrl(String word) throws IOException {

        String curlCommand = "curl --header \"Authorization: Token " + token + "\" https://owlbot.info/api/v4/dictionary/" + word + " -s";
        Process process = Runtime.getRuntime().exec(curlCommand);
        InputStream inputStream = process.getInputStream();
        Scanner scanner = new Scanner(new InputStreamReader(inputStream));
        StringBuilder builder = new StringBuilder();

        while (scanner.hasNextLine()) {

            builder.append(scanner.nextLine());

        }

        ObjectMapper mapper = new ObjectMapper();
        JsonFormatOwl getOwlData = mapper.readValue(String.valueOf(builder), JsonFormatOwl.class);
        int numOfImages = getOwlData.getDefinitions().size();
        int i = 0;

        do {

            String imageUrl = getOwlData.getDefinitions().get(i).get("image_url");
            imageUrlArray.add(imageUrl);
            i++;

        }while (i < numOfImages);

        return imageUrlArray;
    }

    public static ArrayList<String> getEmoji(String word) throws IOException {

        String curlCommand = "curl --header \"Authorization: Token " + token + "\" https://owlbot.info/api/v4/dictionary/" + word + " -s";
        Process process = Runtime.getRuntime().exec(curlCommand);
        InputStream inputStream = process.getInputStream();
        Scanner scanner = new Scanner(new InputStreamReader(inputStream));
        StringBuilder builder = new StringBuilder();

        while (scanner.hasNextLine()) {

            builder.append(scanner.nextLine());

        }

        ObjectMapper mapper = new ObjectMapper();
        JsonFormatOwl getOwlData = mapper.readValue(String.valueOf(builder), JsonFormatOwl.class);
        int numOfEmoji = getOwlData.getDefinitions().size();
        int i = 0;

        do {

            String emoji = getOwlData.getDefinitions().get(i).get("emoji");
            emojiArray.add(emoji);
            i++;

        }while (i < numOfEmoji);

        return emojiArray;
    }

    public static String getWord(String word) throws IOException {

        String curlCommand = "curl --header \"Authorization: Token " + token + "\" https://owlbot.info/api/v4/dictionary/" + word + " -s";
        Process process = Runtime.getRuntime().exec(curlCommand);
        InputStream inputStream = process.getInputStream();
        Scanner scanner = new Scanner(new InputStreamReader(inputStream));
        StringBuilder builder = new StringBuilder();

        while (scanner.hasNextLine()) {

            builder.append(scanner.nextLine());

        }

        ObjectMapper mapper = new ObjectMapper();
        JsonFormatOwl getOwlData = mapper.readValue(String.valueOf(builder), JsonFormatOwl.class);

        MysticDictionary.word = getOwlData.getWord();

        return MysticDictionary.word;
    }

    public static String getPronunciation(String word) throws IOException {

        String curlCommand = "curl --header \"Authorization: Token " + token + "\" https://owlbot.info/api/v4/dictionary/" + word + " -s";
        Process process = Runtime.getRuntime().exec(curlCommand);
        InputStream inputStream = process.getInputStream();
        Scanner scanner = new Scanner(new InputStreamReader(inputStream));
        StringBuilder builder = new StringBuilder();

        while (scanner.hasNextLine()) {

            builder.append(scanner.nextLine());

        }

        ObjectMapper mapper = new ObjectMapper();
        JsonFormatOwl getOwlData = mapper.readValue(String.valueOf(builder), JsonFormatOwl.class);

        pronunciation = getOwlData.getPronunciation();

        return pronunciation;
    }

}
