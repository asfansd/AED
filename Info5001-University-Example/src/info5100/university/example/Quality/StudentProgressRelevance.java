/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Quality;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Persona.EmploymentHistory.Employment;
import info5100.university.example.Persona.EmploymentHistory.EmploymentHistroy;
import info5100.university.example.Persona.StudentProfile;

/**
 *
 * @author Okami
 */
public class StudentProgressRelevance {
    CourseSchedule courseschedule;
    StudentProfile studentprofile;
    EmploymentHistroy employementhistory;
    float studentprogressrelevance = 0;

    public float getStudentprogressrelevance() {
        return studentprogressrelevance;
    }

    public void setStudentprogressrelevance(float studentprogressrelevance) {
        this.studentprogressrelevance = studentprogressrelevance;
    }

    public StudentProgressRelevance(CourseSchedule courseschedule, StudentProfile studentprofile, EmploymentHistroy employementhistory){
        this.employementhistory = employementhistory;
        this.courseschedule = courseschedule;
        this.studentprofile = studentprofile;
    }
    
    public CourseSchedule getCourseschedule() {
        return courseschedule;
    }

    public void setCourseschedule(CourseSchedule courseschedule) {
        this.courseschedule = courseschedule;
    }

    public EmploymentHistroy getEmployementhistory() {
        return employementhistory;
    }

    public void setEmployementhistory(EmploymentHistroy employementhistory) {
        this.employementhistory = employementhistory;
    }

    public StudentProfile getStudentprofile() {
        return studentprofile;
    }

    public void setStudentprofile(StudentProfile studentprofile) {
        this.studentprofile = studentprofile;
    }
    
    public float calculateCourseScheduleRelevance(){
        float count = 0, temp=0;
        float employmentCount = this.employementhistory.getEmployments().size();
        for(Employment e : this.employementhistory.getEmployments()){
            for(Course c : e.getJob().getRelevantcourses()){
                count = 0;
                for(CourseLoad cl : this.studentprofile.getTranscript().getCourseloadlist().values()){
                    for(SeatAssignment sa : cl.getSeatassignments()){
                        if(c.equals(sa.getSeat().getCourseoffer().getCourse())){
                            count = count + (float)(((float)(1/employmentCount))/e.getJob().getRelevantcourses().size());
                            break;
                        }
                    }
                }
            }
            temp += count;
        }
        this.setStudentprogressrelevance(temp);
        return this.studentprogressrelevance;
    }
    
}