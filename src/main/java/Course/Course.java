package course;


public class Course {
    
    private String name;
    private int numberOfClasses;
    
    public Course() {
        this.name = "no name";
        this.numberOfClasses = 0;
    }
    
     public Course( String name, int numberOfClasses ) {
        this.name = name;
        this.numberOfClasses = numberOfClasses;

    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    public int getNumberOfClasses() {
        return this.numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }
    
     public void info() {
        System.out.println("Ime Kursa:" + getName());
        System.out.println("Broj casova:" + getNumberOfClasses());
    
    }


    
    
}

  
