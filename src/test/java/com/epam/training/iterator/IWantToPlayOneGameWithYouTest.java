package com.epam.training.iterator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class IWantToPlayOneGameWithYouTest {
    private static final int PERSON_COUNT = 10;

    @Test
    public void startGame() throws Exception {
        List<Person> personList = new ArrayList<>();
        for (int number = 1; number <= PERSON_COUNT; number++) {
            Person person = new Person();
            person.setSequenceNumber(number);
            personList.add(person);
        }

        IWantToPlayOneGameWithYou<Person> gameIterator = new IWantToPlayOneGameWithYou<>();
        gameIterator.startGame(personList);

        Person testPerson = new Person();
        testPerson.setSequenceNumber(5);

        assertTrue(personList.get(0).toString().equals(testPerson.toString()));
    }
}
