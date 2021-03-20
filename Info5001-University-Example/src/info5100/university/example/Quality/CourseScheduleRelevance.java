/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Quality;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.Persona.EmploymentHistory.Job;
import info5100.university.example.Persona.EmploymentHistory.JobDirectory;

/**
 *
 * @author Okami
 */
public class CourseScheduleRelevance {
    CourseSchedule courseschedule;
    JobDirectory jobdirectory;
    float courseschedulerelevance = 0;

    public float getCourseschedulerelevance() {
        return courseschedulerelevance;
    }

    public void setCourseschedulerelevance(float courseschedulerelevance) {
        this.courseschedulerelevance = courseschedulerelevance;
    }
    
    public CourseScheduleRelevance(CourseSchedule courseschedule, JobDirectory jobdirectory){
        this.jobdirectory = jobdirectory;
        this.courseschedule = courseschedule;
    }
    
    public CourseSchedule getCourseschedule() {
        return courseschedule;
    }

    public void setCourseschedule(CourseSchedule courseschedule) {
        this.courseschedule = courseschedule;
    }

    public JobDirectory getJobdirectory() {
        return jobdirectory;
    }

    public void setJobdirectory(JobDirectory jobdirectory) {
        this.jobdirectory = jobdirectory;
    }
    
    
    public float calculateCourseScheduleRelevance(){
        float count=0, temp=0;
        float jdsize = this.jobdirectory.getJobs().size();
        for(Job j: this.jobdirectory.getJobs()){
            count = 0;
            for(Course c : j.getRelevantcourses()) {
                for(CourseOffer co: courseschedule.getSchedule()){
                    if(c.equals(co.getCourse())){
                        count = count + (float)(((float)(1/jdsize))/j.getRelevantcourses().size());
                        break;
                    }
                }
            }
//            System.out.println("Here : "+count);
            temp += count;
        }
        this.setCourseschedulerelevance(temp);
        return this.courseschedulerelevance;
    }
}