/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Location;

import Person.Student;
import java.util.ArrayList;

/**
 *
 * @author pcj105
 */
public class AdvisingOffice extends Facility{
    
    private ArrayList<String> courseList;
    
    public AdvisingOffice()
    {
        
    }
    
    public AdvisingOffice(Student student)
    {
        
    }
    
    public ArrayList<String> getCourseList()
    {
        return courseList;
    }
    
    
    
}
