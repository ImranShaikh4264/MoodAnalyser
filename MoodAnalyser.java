package com.bridgelab.mood_analyser;

public class MoodAnalyser {
	  //Declare variable
    String mood;
    String message;

    //Default constructor
public MoodAnalyser(){

    }
    //Parameterised constructor
public MoodAnalyser(String message){
        this.message = message;
    }

    //Method that return mood
    public String analysisMood(String message) {
        if (message.equalsIgnoreCase("I am in sad Mood")) {
            mood = "SAD";
        }
        else {
            mood = "HAPPY";
        }
        return mood;
    }
}
