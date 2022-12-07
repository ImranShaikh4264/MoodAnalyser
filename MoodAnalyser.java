package com.bridgelab.mood_analyser;

public class MoodAnalyser {
	String mood;
	 public String analysisMood(String message) {
	        if (message.contains("sad"))
	        { mood =  "SAD";
	        }
	        else{mood = "Happy";
	        }
	        return mood;
	    }
}
