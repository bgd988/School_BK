package main.school_bk;

import computer.Computer;
import course.Course;
import student.Student;  
   

class Main {


    public static void main(String[] args) {

   
        
        Student student2 = new Student("Marko", "Markovic", 2000);
        student2.info();
        
        Course courseQA = new Course("QA kurs", 15);
        courseQA.info();
        
        Computer computer1 = new Computer(15.15, 23.56, 15);
        computer1.info();
        
          
        Student student3 = new Student("Jovan", "Jovanovic", 1999, courseQA, computer1);
        student3.info();
    //    Student novi = new Student("Bojan ", "Nikolic", 1988,  );
      //  course.info();
    }

}
