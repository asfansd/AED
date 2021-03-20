<<<<<<< Updated upstream
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.Faculty;

import info5100.university.example.CourseSchedule.CourseOffer;

/**
 *
 * @author kal bugrara
 */
public class FacultyAssignment {
    
    CourseOffer courseoffer;
    FacultyProfile facultyprofile;
    int facultyRating;
    
    public FacultyAssignment(FacultyProfile fp, CourseOffer co){
        courseoffer = co;
        facultyprofile = fp;
    }
    public FacultyProfile getFacultyProfile(){
        return facultyprofile;
    }

    public CourseOffer getCourseoffer() {
        return courseoffer;
    }

    public void setCourseoffer(CourseOffer courseoffer) {
        this.courseoffer = courseoffer;
    }

    public FacultyProfile getFacultyprofile() {
        return facultyprofile;
    }

    public void setFacultyprofile(FacultyProfile facultyprofile) {
        this.facultyprofile = facultyprofile;
    }

    public int getFacultyRating() {
        return facultyRating;
    }

    public void setFacultyRating(int facultyRating) {
        this.facultyRating = facultyRating;
    }
    
    public int calculateFacultyRating(){
        this.setFacultyRating(this.courseoffer.getTotalRating());
        return this.getFacultyRating();
    }
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.Faculty;

import info5100.university.example.CourseSchedule.CourseOffer;

/**
 *
 * @author kal bugrara
 */
public class FacultyAssignment {
    
    CourseOffer courseoffer;
    FacultyProfile facultyprofile;
    int facultyRating;
    
    public FacultyAssignment(FacultyProfile fp, CourseOffer co){
        courseoffer = co;
        facultyprofile = fp;
    }
    public FacultyProfile getFacultyProfile(){
        return facultyprofile;
    }

    public CourseOffer getCourseoffer() {
        return courseoffer;
    }

    public void setCourseoffer(CourseOffer courseoffer) {
        this.courseoffer = courseoffer;
    }

    public FacultyProfile getFacultyprofile() {
        return facultyprofile;
    }

    public void setFacultyprofile(FacultyProfile facultyprofile) {
        this.facultyprofile = facultyprofile;
    }

    public int getFacultyRating() {
        return facultyRating;
    }

    public void setFacultyRating(int facultyRating) {
        this.facultyRating = facultyRating;
    }
    
    public int calculateFacultyRating(){
        this.setFacultyRating(this.courseoffer.getTotalRating());
        return this.getFacultyRating();
    }
}
>>>>>>> Stashed changes
