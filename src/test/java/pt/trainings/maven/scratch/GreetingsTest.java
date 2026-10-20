package pt.trainings.maven.scratch;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GreetingsTest {
    private static final String DEFAULT_NAME = "John Doe";
    private static final String GREETINGS_MESSAGE = "Hello ";

    @Test
    void testNullNameShouldPrintDefaultName() {
        Greetings objectUnderTest = new Greetings();
        String expectedString = GREETINGS_MESSAGE + DEFAULT_NAME;
        assertEquals(expectedString, objectUnderTest.sayHello(null));
    }

    @Test
    void testShouldPrintCorrectGreeting() {
        Greetings objectUnderTest = new Greetings();
        String expectedString = GREETINGS_MESSAGE + "Bob";
        assertEquals(expectedString, objectUnderTest.sayHello("Bob"));
    }
}
