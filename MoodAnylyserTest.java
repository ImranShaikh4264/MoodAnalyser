package com.bridgelab.mood_analyser;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class MoodAnylyserTest {
	//Create object of MoodAnalyser class
    MoodAnalyser moodAnalyser = new MoodAnalyser();

    //Test case to check sad mood
    @Test
    public void givenMood_WhenSad_ShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad Mood");
        String reaction =moodAnalyser.analysisMood();
        assertEquals("sad",reaction);
    }

    //Test case to check happy mood
    @Test
    public void givenMood_WhenHappy_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy Mood");
        String reaction =moodAnalyser.analysisMood();
        assertEquals("Happy",reaction );
    }

    //Test case to check null mood
    @Test
    public void givenMood_WhenHappy_TroughException(){
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String reaction =moodAnalyser.analysisMood();
        assertEquals("Happy",reaction );
    }
}
