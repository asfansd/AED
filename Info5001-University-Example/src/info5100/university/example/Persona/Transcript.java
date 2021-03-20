/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.SeatAssignment;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author kal bugrara
 */public class Transcript {
    
    
    HashMap<String, CourseLoad> courseloadlist;
    int rating = 0;
    CourseLoad currentcourseload;
    
    public Transcript(){
        
        courseloadlist = new HashMap<String, CourseLoad>();
        
    }

    public HashMap<String, CourseLoad> getCourseloadlist() {
        return courseloadlist;
    }

    public void setCourseloadlist(HashMap<String, CourseLoad> courseloadlist) {
        this.courseloadlist = courseloadlist;
    }

    public CourseLoad getCurrentcourseload() {
        return currentcourseload;
    }
    
    public CourseLoad getCourseload(String semester) {
        return courseloadlist.get(semester);
    }

    public void setCurrentcourseload(CourseLoad currentcourseload) {
        this.currentcourseload = currentcourseload;
    }
    
    public CourseLoad newCourseLoad(String sem){
        
        this.currentcourseload = new CourseLoad(sem);
        courseloadlist.put(sem, currentcourseload);
        return currentcourseload;
    }
    
    public CourseLoad getCurrentCourseLoad(){
        
        return currentcourseload;
        
    }
    
    public CourseLoad getCourseLoadBySemester(String semester){
        
        return courseloadlist.get(semester);
        
    }
    
    public void setRatings(Course course, int facultyRating){
        for(CourseLoad cl : this.courseloadlist.values()){
            for(SeatAssignment sa : cl.getSeatassignments()){
                if(course.equals(sa.getSeat().getCourseoffer().getCourse()))
                    sa.setStudentRating(facultyRating);
            }
        }
    }
    
    public float calculateGPA(){
        float GPA=0, temp;
        
        for(CourseLoad cl : this.courseloadlist.values()){
            temp = 0;
            for(SeatAssignment sa : cl.getSeatassignments()){
                temp = temp + sa.getGPA();
            }
            GPA = GPA + temp/cl.getSeatassignments().size();
        }
        GPA = GPA/this.courseloadlist.size();
        return GPA;
    }
}
