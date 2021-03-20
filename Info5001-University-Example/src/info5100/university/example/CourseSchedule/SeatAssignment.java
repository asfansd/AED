/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

/**
 *
 * @author kal bugrara
 */
public class SeatAssignment {
    
    Seat seat;
    CourseLoad courseload;
    int studentFacultyRating = 0;
    float GPA = 0;
    
    public float getGPA() {
        return GPA;
    }

    public void setGPA(float grade) {
        //Scanner
        this.GPA = grade;
    }
    
    public int getStudentRating() {
        return studentFacultyRating;
    }

    public void setStudentRating(int studentRating) {
        //Scanner
        this.studentFacultyRating = studentRating;
    }
    
    public Seat getSeat() {
        return this.seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public CourseLoad getCourseload() {
        return courseload;
    }

    public void setCourseload(CourseLoad courseload) {
        this.courseload = courseload;
    }
    
    public SeatAssignment(CourseLoad cl, Seat s){
        seat = s;
        courseload = cl;
    }
    
    public SeatAssignment(){
    
    }
    
    public void assignSeatToStudent(CourseLoad cl){
        courseload = cl;
    }
    
}
