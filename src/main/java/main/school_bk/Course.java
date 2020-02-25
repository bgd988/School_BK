/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.school_bk;

/**
 *
 * @author mojme
 */
public class Course {
    
    private String name = "QA";
    private String codeName = "QA43";
    private int numberOfClasses;
    
    public Course() {
        this.name = "";
        this.codeName = "";
        this.numberOfClasses = 0;

    }
    
     public Course( String customName, String customCodeName, int customNumberOfClasses ) {
        this.name = customName;
        this.codeName = customCodeName;
        this.numberOfClasses = customNumberOfClasses;

    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String customName) {
        this.name = customName;
    }
    
    public String getCodeName() {
        return this.codeName;
    }

    public void setCodeName(String customCodeName) {
        this.codeName = customCodeName;
    }
    
    public int getNumberOfClasses() {
        return this.numberOfClasses;
    }

    public void setNumberOfClasses(int customNumberOfClasses) {
        this.numberOfClasses = customNumberOfClasses;
    }
    
    

    
    
    
}

  
