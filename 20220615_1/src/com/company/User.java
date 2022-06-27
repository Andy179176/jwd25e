package com.company;

import java.time.LocalDate;

public class User implements Comparable<User>{
    private String name;
    private int yearOfBirthday;

    public User(String name, int yearOfBirthday) {
        this.name = name;
        this.yearOfBirthday = yearOfBirthday;
    }


    private int getAge(){
        return LocalDate.now().getYear()- yearOfBirthday;
    }

    @Override
    public String toString() {
        return name + " ("+getAge()+")";
    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (yearOfBirthday != user.yearOfBirthday) return false;
        return name != null ? name.equals(user.name) : user.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + yearOfBirthday;
        return result;
    }

    @Override
    public int compareTo(User o) {
        return this.name.compareTo(o.name) ;
    }
}
