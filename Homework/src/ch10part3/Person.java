package ch10part3;

import java.util.*;
import java.util.concurrent.*;

class Person {

 String name, lastname, address, phoneNumber;


 // Constructor
 public Person(String name, String lastname, String address, String phoneNumber)
 {
     this.name = name;
     this.lastname = lastname;
     this.address = address;
     this.phoneNumber = phoneNumber;
 }

 // Method of this class
 // To print Person details
 public String toString()
 {
     return this.name + " " + this.lastname + " "
         + this.address + " "
         + this.phoneNumber;
 }
}

//Class 2
//Helper class - Comparator implementation
class Sortbyroll implements Comparator<Person> {

 // Used for sorting in ascending order of
 // roll number
 public int compare(Person a, Person b)
 {
     return a.name.compareTo(b.name);

 }
}


