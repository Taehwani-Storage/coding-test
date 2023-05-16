package codeup.week4.d4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student {
    public boolean id;
    private String code;
    private int testId;
    private String name;

    public Student(String code, int testId, String name) {
        this.code = code;
        this.testId = testId;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public int getTestId() {
        return testId;
    }

    public String getName() {
        return name;
    }
}

public class codeup3108 {

    private List<Student> students = new ArrayList<>();

    public Student makeAStudent(String code, int testId, String name){
        return new Student(code, testId, name);
    }

    // shift + 6
    private boolean isExist(Student pStudent) {
        // 중복 여부 check
        for (Student student : students){
            if(pStudent.getTestId() == student.getTestId()){
                return true;
            }
        }
        return false;
    }

    private Student getExistStudent(Student pStudent) {

        return new Student("", 0, "");
    }

    private void deleteStudent(Student pStudent) {
        // pStudent가 students에 몇번째에 있는지 알아야 함
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getTestId() == pStudent.getTestId()){
                students.remove(i);
            }
        }
    }

    public void process(String line) {
        String[] splitted = line.split(" ");
        Student student = makeAStudent(splitted[0], Integer.parseInt(splitted[1]), splitted[2]);
        if ("I".equals(student.getCode())) {
            addAStudent(student);
        }else {
            deleteStudent(student);
        }
    }

    private void addAStudent(Student student){
        if (!isExist(student)){
            students.add(student);
        }
        // sort
    }

    private void printStudents() {
        for (Student student : students) {
            System.out.printf("%s %s %s\n", student.getCode(), student.getTestId(), student.getName());
        }
    }

    private void printSpecificStudents(int[] arr){
        // 정렬
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getTestId() > o2.getTestId()) return 1;
                else if (o1.getTestId() == o2.getTestId()) return 0;
                else return -1;
            }
        });

        // 출력
        for (int i = 0; i < arr.length; i++) {
            Student student = students.get(arr[i] - 1);
            System.out.println(student.getTestId() + " " + student.getName());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        codeup3108 c3108 = new codeup3108();
        int size = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < size; i++) {
            String line = sc.nextLine();
            c3108.process(line);
        }
        String[] arr2 = sc.nextLine().split(" ");
        int[] arr3 = new int[arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            arr3[i] = Integer.parseInt(arr2[i]);
        }
        c3108.printSpecificStudents(arr3);
    }
}

