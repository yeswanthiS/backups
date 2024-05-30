package javaday10.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


public class LamdaExpressions {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // Implementing Comparator using lambda expression
        Comparator<Person> ageComparator = (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge());

        // Sorting the list of Person objects by age
        Collections.sort(people, ageComparator);

        // Printing the sorted list
        for (Person person : people) {
            System.out.println(person.getName() + ": " + person.getAge());
        }
    }
}
    
