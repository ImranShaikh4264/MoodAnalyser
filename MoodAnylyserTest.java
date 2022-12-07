package com.bridgelab.mood_analyser;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class MoodAnylyserTest {
	MoodAnalyser moodAnalyser = new MoodAnalyser();
    @Test
    public void testMoodAnalysis(){
        String message = "I am in sad Mood";
        String mood = moodAnalyser.analysisMood(message);
        assertEquals("SAD", mood);
    
	}
}
