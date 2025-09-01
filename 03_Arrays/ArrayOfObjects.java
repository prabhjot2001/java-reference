import java.util.*;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter how many students you want to create");
        int n = sc.nextInt();sc.nextLine();
        Student[] students = new Student[n];
        for(int i=0; i<n; i++){
            students[i] = new Student();
            students[i].name = sc.nextLine();
            students[i].rollno = sc.nextInt();
            students[i].marks = sc.nextDouble();sc.nextLine();
        }

       for(int i = 0; i< students.length; i++){
        System.out.println(students[i].name + " " + students[i].rollno + " " + students[i].marks);
       }
    }
}

class Student{
    String name;
    int rollno;
    double marks;

    public Student(){}
}
