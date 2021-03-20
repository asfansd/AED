<<<<<<< Updated upstream
/*
{{
{124* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.EmploymentHistory;

import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.Employer.EmployerProfile;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class Employment {
    int weight;
    String quality;
    Job job;
    Employment nextemplyment;  //next job so they are in a sequence 
    
    EmployerProfile employer;
    
    public Employment(Job j, EmployerProfile employer, int weight, Employment nextemplyment, String quality) {
        this.job = j;
        this.employer = employer;
        this.weight = weight;
        this.nextemplyment = nextemplyment;
        this.quality = quality;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Employment getNextemplyment() {
        return nextemplyment;
    }

    public void setNextemplyment(Employment nextemplyment) {
        this.nextemplyment = nextemplyment;
    }

    public EmployerProfile getEmployer() {
        return employer;
    }

    public void setEmployer(EmployerProfile employer) {
        this.employer = employer;
    }
    
}
=======
/*
{{
{124* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.EmploymentHistory;

import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.Employer.EmployerProfile;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class Employment {
    int weight;
    String quality;
    Job job;
    Employment nextemplyment;  //next job so they are in a sequence 
    
    EmployerProfile employer;
    
    public Employment(Job j, EmployerProfile employer, int weight, Employment nextemplyment, String quality) {
        this.job = j;
        this.employer = employer;
        this.weight = weight;
        this.nextemplyment = nextemplyment;
        this.quality = quality;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Employment getNextemplyment() {
        return nextemplyment;
    }

    public void setNextemplyment(Employment nextemplyment) {
        this.nextemplyment = nextemplyment;
    }

    public EmployerProfile getEmployer() {
        return employer;
    }

    public void setEmployer(EmployerProfile employer) {
        this.employer = employer;
    }
    
}
>>>>>>> Stashed changes
