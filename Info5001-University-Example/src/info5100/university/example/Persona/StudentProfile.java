/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.Persona.EmploymentHistory.EmploymentHistroy;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class StudentProfile {

    Person person;
    Transcript transcript;
    EmploymentHistroy employmenthistory;
    float GPA = 0;
    int internships = 0;
    int researchPapers = 0;
    int certifications = 0;

    public StudentProfile(Person p) {

        person = p;
        transcript = new Transcript();
        employmenthistory = new EmploymentHistroy();
    }
    
    public int getInternships() {
        return internships;
    }

    public void setInternships(int internships) {
        this.internships = internships;
    }

    public int getResearchPapers() {
        return researchPapers;
    }

    public void setResearchPapers(int researchPapers) {
        this.researchPapers = researchPapers;
    }

    public int getCertifications() {
        return certifications;
    }

    public void setCertifications(int certifications) {
        this.certifications = certifications;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    public EmploymentHistroy getEmploymenthistory() {
        return employmenthistory;
    }

    public void setEmploymenthistory(EmploymentHistroy employmenthistory) {
        this.employmenthistory = employmenthistory;
    }

    public boolean isMatch(String id) {
        if (person.getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    public CourseLoad getCourseLoadBySemester(String semester) {

        return transcript.getCourseLoadBySemester(semester);
    }

    public CourseLoad getCurrentCourseLoad() {

        return transcript.getCurrentCourseLoad();
    }

    public CourseLoad newCourseLoad(String s){
        
        return transcript.newCourseLoad(s);
    }

    public void assignRatings(Course course, int facultyRating){
        this.transcript.setRatings(course, facultyRating);
    }
    
    public void setGPA(){
        this.GPA = this.transcript.calculateGPA();
    }
    
    public float getGPA(){
        return this.GPA;
    }
}
