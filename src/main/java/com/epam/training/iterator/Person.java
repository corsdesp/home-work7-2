package com.epam.training.iterator;

public class Person {
    private int sequenceNumber;

    public Person() {
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return sequenceNumber == person.sequenceNumber;
    }

    @Override
    public int hashCode() {
        return sequenceNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "sequenceNumber=" + sequenceNumber +
                '}';
    }
}
