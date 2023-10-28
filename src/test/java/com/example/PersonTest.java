package com.example;

import org.example.Person;
import org.junit.jupiter.api.Test;


import java.time.LocalDate;

import static junit.framework.TestCase.assertEquals;

public class PersonTest {

    @Test
  //  void testGetDisplayName(){
    //        Person person=new Person("Josh","Hayden", dateOfBirth);
      //     String displayName=person.getDisplayName();
        // assertEquals("Hayden,Josh",displayName);

    //}

    void testGetAge(){
        Person person=new Person("Joey","Doe", LocalDate.parse("2013-01-12"));
        long age=person.getAge();
        assertEquals(10,age);

    }
}
