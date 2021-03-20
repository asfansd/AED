/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.EmploymentHistory;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseSchedule.CourseOffer;
import java.util.ArrayList;

/**
 *
 * @author Okami
 */
public class Job {
    String role;
    String tag;
    ArrayList<Course> relevantcourses;

    public ArrayList<Course> getRelevantcourses() {
        return relevantcourses;
    }

    public void setRelevantcourses(ArrayList<Course> relevantcourses) {
        this.relevantcourses = relevantcourses;
    }

    public Job(String role, String tag, ArrayList<Course> relevantcourses) {
        this.role = role;
        this.tag = tag;
        this.relevantcourses = relevantcourses;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    
}

