package javaday9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Compare2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Arush", List.of("Math","Science")));
        list.add(new Student(0, "Aaryan",List.of("English","History")));

        Collections.sort(list, (s1, s2) ->Integer.compare(s1.rollno, s2.rollno));
        Student maxStudent = list.stream().max((s1, s2) -> Integer.compare(s1.rollno, s2.rollno)).get();
        System.out.println("Highest rollno:" + maxStudent.name);
        for(Student student:list){
            System.out.println(student);
        }
    }
}

class Student {
    int rollno;
    String name;
    List<String> subjects;

    Student(int rollno, String name, List<String> subjects) {
        this.rollno = rollno;
        this.name = name;
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student: " + name + ", " + rollno + ", Subjects:" + subjects;
    }
    
}
