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
public class Seat {
    
    Boolean occupied; 
    int number;
    SeatAssignment seatassignment;
    CourseOffer courseoffer;
    int Rating = 0;

    public Seat() {
        
    }

    public Boolean getOccupied() {
        return occupied;
    }

    public void setOccupied(Boolean occupied) {
        this.occupied = occupied;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public SeatAssignment getSeatassignment() {
        return seatassignment;
    }

    public void setSeatassignment(SeatAssignment seatassignment) {
        this.seatassignment = seatassignment;
    }

    public CourseOffer getCourseoffer() {
        return courseoffer;
    }

    public void setCourseoffer(CourseOffer courseoffer) {
        this.courseoffer = courseoffer;
    }

    public int getRating() {
        this.Rating = this.seatassignment.getStudentRating();
        return Rating;
    }

    public void setRating(int Rating) {
        this.Rating = Rating;
    }
    
    public Seat (CourseOffer co, int n){
        courseoffer = co;
        number = n;
        occupied = false;
    }
    
    public Boolean isOccupied(){
        return occupied;

    }
    
    
    public SeatAssignment newSeatAssignment(){
        
        seatassignment = new SeatAssignment(); //links seatassignment to seat
        seatassignment.setSeat(this);
        occupied = true;   
        return seatassignment;
    }
    
    
}
