package com.github.deadspark.utils;

import java.util.List;
import java.util.Map;

public class JsonFormatOwl {

    List<Map<String, String>> definitions;
    String word;
    String pronunciation;

    public void setDefinitions(List<Map<String, String>> definitions) {
        this.definitions = definitions;
    }

    public List<Map<String, String>> getDefinitions() {
        return definitions;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setPronunciation(String pronunciation) {
        this.pronunciation = pronunciation;
    }

    public String getPronunciation() {
        return pronunciation;
    }

}
