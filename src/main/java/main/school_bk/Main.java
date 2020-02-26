package main.school_bk;

   
   

class Main {

    private static Course course;
       public String getCourse() {
        return this.getCourse();
    }
       
     private static Computer computer;
       public String getComputer() {
        return this.getComputer();
    }


 

    public static void main(String[] args) {

        System.out.println("Pocetak");

        System.out.println();
        
        Student Nikola = new Student("Nikola", "Peric", 1988, course); 
        Course QA = new Course ();
        Nikola.info();
        QA.courseInfo();
    //    Student novi = new Student("Bojan ", "Nikolic", 1988,  );
      //  course.info();
    }

}
