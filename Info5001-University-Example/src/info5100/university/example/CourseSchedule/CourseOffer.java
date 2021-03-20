<<<<<<< Updated upstream
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.Persona.Faculty.FacultyAssignment;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class CourseOffer {

    Course course;
    ArrayList<Seat> seatlist;
    FacultyAssignment facultyassignment;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ArrayList<Seat> getSeatlist() {
        return seatlist;
    }

    public void setSeatlist(ArrayList<Seat> seatlist) {
        this.seatlist = seatlist;
    }

    public FacultyAssignment getFacultyassignment() {
        return facultyassignment;
    }

    public void setFacultyassignment(FacultyAssignment facultyassignment) {
        this.facultyassignment = facultyassignment;
    }

    public CourseOffer(Course c) {
        course = c;
        seatlist = new ArrayList();
    }
    public void AssignAsTeacher(FacultyProfile fp) {

        facultyassignment = new FacultyAssignment(fp, this);
    }

    public FacultyProfile getFacultyProfile() {
        return facultyassignment.getFacultyProfile();
    }

    public String getCourseNumber() {
        return course.getCOurseNumber();
    }

    public void generatSeats(int n) {

        for (int i = 0; i < n; i++) {

            seatlist.add(new Seat(this, i));

        }

    }

    public Seat getEmptySeat() {

        for (Seat s : seatlist) {

            if (!s.isOccupied()) {
                return s;
            }
        }
        return null;
    }
    
    public int getEmptySeats() {
        int count = 0;
        for (Seat s : seatlist) {
            if (!s.isOccupied()) {
                count++;
            }
        }
        return count;
    }
    
    public ArrayList<Seat> getOccupiedSeats() {
        ArrayList<Seat> occupiedseats = new ArrayList<>();
        int count = 0;
        for (Seat s : seatlist) {
            if (s.isOccupied()) {
                occupiedseats.add(s);
            }
        }
        return occupiedseats;
    }

    public SeatAssignment assignEmptySeat(CourseLoad cl) {
        Seat seat = getEmptySeat();
        if (seat == null) {
            return null;
        }
        SeatAssignment sa = seat.newSeatAssignment(); //seat is already linked to course offer
        cl.registerStudent(sa);; //coures offer seat is now linked to student
        return sa;
    }

    public int getTotalCourseRevenues() {

        int sum = 0;

        for (Seat s : seatlist) {
            if (s.isOccupied() == true) {
                sum = sum + course.getCoursePrice();
            }

        }
        return sum;
    }
    
    public int getTotalRating(){
        int rating = 0;
        for(Seat s: this.getOccupiedSeats()){
            rating = rating + s.getRating();
        }
        return rating/this.getOccupiedSeats().size();
    }

    public void setFacultyRating(){
        this.facultyassignment.setFacultyRating(this.getTotalRating());
    }
    
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.Persona.Faculty.FacultyAssignment;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class CourseOffer {

    Course course;
    ArrayList<Seat> seatlist;
    FacultyAssignment facultyassignment;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ArrayList<Seat> getSeatlist() {
        return seatlist;
    }

    public void setSeatlist(ArrayList<Seat> seatlist) {
        this.seatlist = seatlist;
    }

    public FacultyAssignment getFacultyassignment() {
        return facultyassignment;
    }

    public void setFacultyassignment(FacultyAssignment facultyassignment) {
        this.facultyassignment = facultyassignment;
    }

    public CourseOffer(Course c) {
        course = c;
        seatlist = new ArrayList();
    }
    public void AssignAsTeacher(FacultyProfile fp) {

        facultyassignment = new FacultyAssignment(fp, this);
    }

    public FacultyProfile getFacultyProfile() {
        return facultyassignment.getFacultyProfile();
    }

    public String getCourseNumber() {
        return course.getCOurseNumber();
    }

    public void generatSeats(int n) {

        for (int i = 0; i < n; i++) {

            seatlist.add(new Seat(this, i));

        }

    }

    public Seat getEmptySeat() {

        for (Seat s : seatlist) {

            if (!s.isOccupied()) {
                return s;
            }
        }
        return null;
    }
    
    public int getEmptySeats() {
        int count = 0;
        for (Seat s : seatlist) {
            if (!s.isOccupied()) {
                count++;
            }
        }
        return count;
    }
    
    public ArrayList<Seat> getOccupiedSeats() {
        ArrayList<Seat> occupiedseats = new ArrayList<>();
        int count = 0;
        for (Seat s : seatlist) {
            if (s.isOccupied()) {
                occupiedseats.add(s);
            }
        }
        return occupiedseats;
    }

    public SeatAssignment assignEmptySeat(CourseLoad cl) {
        Seat seat = getEmptySeat();
        if (seat == null) {
            return null;
        }
        SeatAssignment sa = seat.newSeatAssignment(); //seat is already linked to course offer
        cl.registerStudent(sa);; //coures offer seat is now linked to student
        return sa;
    }

    public int getTotalCourseRevenues() {

        int sum = 0;

        for (Seat s : seatlist) {
            if (s.isOccupied() == true) {
                sum = sum + course.getCoursePrice();
            }

        }
        return sum;
    }
    
    public int getTotalRating(){
        int rating = 0;
        for(Seat s: this.getOccupiedSeats()){
            rating = rating + s.getRating();
        }
        return rating/this.getOccupiedSeats().size();
    }

    public void setFacultyRating(){
        this.facultyassignment.setFacultyRating(this.getTotalRating());
    }
    
}
>>>>>>> Stashed changes
