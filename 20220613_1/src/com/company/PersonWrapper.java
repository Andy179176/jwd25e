package com.company;

public class PersonWrapper {
  Person person;
  int hash;

    public PersonWrapper(Person person) {
        this.person = person;
        hash=person.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonWrapper)) return false;

        PersonWrapper that = (PersonWrapper) o;

        if (hash != that.hash) return false;
        return getPerson() != null ? getPerson().equals(that.getPerson()) : that.getPerson() == null;
    }

    @Override
    public int hashCode() {
        return hash;
    }

    public Person getPerson() {
        return person;
    }
}

