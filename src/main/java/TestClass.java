
import org.joda.time.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User1
 */
public class TestClass {
    
    public static void main(String[] args){
        TestClass test= new TestClass();
        test.registration();
    }
    
    public void registration(){
        //init localdates for start and end
        DateTime start = DateTime.parse("2020-09-28");
        DateTime end = DateTime.parse("2021-06-04");
        //init the course,module and student objects
        CourseProgramme course1 = new CourseProgramme(start,end,"ECE");
        CourseProgramme course2 = new CourseProgramme(start,end,"CS");
        
        Module mod1= new Module("Software Engineering III","CT417","CS,ECE");
        Module mod2= new Module("Digital Signal Processing","EE445","ECE");
        //add relevant modules to courses
        course1.addModule(mod1);
        course1.addModule(mod2);
        course2.addModule(mod1); //cs does not have digital signal processing module in this case
        
        //initialise some students
        Student stud1 = new Student("John Jacobs",20,"ECE","CT417,EE445");
        Student stud2 = new Student("Lynn Hunt",19,"ECE","CT417,EE445");
        Student stud3 = new Student("Karen Leahy",20,"CS","CT417");
        Student stud4 = new Student("Daniel Carr",20,"CS","CT417");
        //add relevant students to courses and mods
        course1.addStudent(stud1);
        course1.addStudent(stud2);
        course2.addStudent(stud3);
        course2.addStudent(stud4);
        
        mod1.addStudent(stud1);
        mod1.addStudent(stud2);
        mod1.addStudent(stud3);
        mod1.addStudent(stud4);
        //cs does not to digital signal processing in this case
        mod2.addStudent(stud1);
        mod2.addStudent(stud2);
        //
        
    }
    
}
