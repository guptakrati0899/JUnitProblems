package jUnitTest;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
      MoodAnalyser moodAnalyser = new MoodAnalyser ();
        String mood = moodAnalyser.analyseMood("This is a sad message");
        Assertions.assertEquals("SAD" , mood);
    }
}
