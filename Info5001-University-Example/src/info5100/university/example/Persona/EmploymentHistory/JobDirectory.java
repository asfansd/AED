<<<<<<< Updated upstream
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.EmploymentHistory;

import info5100.university.example.CourseCatalog.Course;
import java.util.ArrayList;

/**
 *
 * @author Okami
 */
public class JobDirectory {
    ArrayList<Job> jobs;

    public ArrayList<Job> getJobs() {
        return jobs;
    }

    public void setJobs(ArrayList<Job> jobs) {
        this.jobs = jobs;
    }

    public JobDirectory() {
        jobs = new ArrayList();
    }
    
    public Job newJob(String role, String tag, ArrayList<Course> relevantcourses){
        Job j = new Job(role, tag, relevantcourses);
        jobs.add(j);
        return j;
    }
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.EmploymentHistory;

import info5100.university.example.CourseCatalog.Course;
import java.util.ArrayList;

/**
 *
 * @author Okami
 */
public class JobDirectory {
    ArrayList<Job> jobs;

    public ArrayList<Job> getJobs() {
        return jobs;
    }

    public void setJobs(ArrayList<Job> jobs) {
        this.jobs = jobs;
    }

    public JobDirectory() {
        jobs = new ArrayList();
    }
    
    public Job newJob(String role, String tag, ArrayList<Course> relevantcourses){
        Job j = new Job(role, tag, relevantcourses);
        jobs.add(j);
        return j;
    }
}
>>>>>>> Stashed changes
