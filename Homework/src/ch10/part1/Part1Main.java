package ch10.part1;

import java.util.function.IntConsumer;
import java.util.function.BinaryOperator;
import java.util.Comparator;

import java.util.*;


class Part1Main {

	public static void main(String[] args) {
        UndergraduateStudent ugs = new UndergraduateStudent(1, "String name", 3, new Date(), "String major", "String minor");
        UndergraduateStudent ugs2 = new UndergraduateStudent(2, "String name2", 5, new Date(), "String major2", "String minor2");
        List<AbstractStudent> studentList = new ArrayList<>();
        List<AbstractStudent> studentList2 = new ArrayList<>();
        studentList.add(ugs);
        studentList.add(ugs2);
        studentList2.add(ugs);
        studentList2.add(ugs2);


        Comparator<AbstractStudent> comparator = (o1, o2) -> o1.getNo()-o2.getNo();
        System.out.println("\nStudents");
		Collections.sort(studentList, comparator);

        for(AbstractStudent a : studentList) {
            System.out.println(a.toString());
        }
        
        
		Collections.sort(studentList2);

        for(AbstractStudent a : studentList2) {
            System.out.println(a.toString());
        }

    }
}