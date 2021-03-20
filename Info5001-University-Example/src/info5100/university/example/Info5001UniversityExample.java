<<<<<<< Updated upstream
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.Seat;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Department.Department;
import info5100.university.example.Employer.EmployerDirectory;
import info5100.university.example.Employer.EmployerProfile;
import info5100.university.example.Persona.EmploymentHistory.Employment;
import info5100.university.example.Persona.EmploymentHistory.EmploymentHistroy;
import info5100.university.example.Persona.EmploymentHistory.Job;
import info5100.university.example.Persona.EmploymentHistory.JobDirectory;
import info5100.university.example.Persona.Faculty.FacultyAssignment;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import info5100.university.example.Quality.CourseScheduleRelevance;
import info5100.university.example.Quality.StudentProgressRelevance;

import java.lang.Object;
import java.util.ArrayList;
import java.util.Random;
import java.math.RoundingMode;
import java.text.DecimalFormat;
/**
 *
 * @author kal bugrara
 */
public class Info5001UniversityExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Department department1 = new Department("Information Systems");

        Course course = department1.newCourse("app eng", "info 5100", 4);

        CourseSchedule courseschedule = department1.newCourseSchedule("Fall2020");

        CourseOffer courseoffer = courseschedule.newCourseOffer("info 5100");
        
        courseoffer.generatSeats(10);
        
        PersonDirectory pd = department1.getPersonDirectory();
        Person person = pd.newPerson("0112303");
        StudentDirectory sd = department1.getStudentDirectory();
        StudentProfile student = sd.newStudentProfile(person);
        CourseLoad courseload1 = student.newCourseLoad("Fall2020"); 
//        
        SeatAssignment sa1 = courseload1.newSeatAssignment(courseoffer); //register student in class
        
//        int total = department1.calculateRevenuesBySemester("Fall2020");
//        System.out.print("Total: " + total);

        //Sushmitha's and Asfan's Code
        
        Random rand = new Random();
        DecimalFormat df = new DecimalFormat("0.00");
        
        Course course2 = department1.newCourse("DMDD", "info 6200", 4);

        CourseOffer courseoffer2 = courseschedule.newCourseOffer("info 6200");
        
        courseoffer2.generatSeats(20);
        
        Person person2 = pd.newPerson("0112304");
        StudentProfile student2 = sd.newStudentProfile(person2);
        CourseLoad courseload2 = student2.newCourseLoad("Fall2020"); 
//        
        SeatAssignment sa2 = courseload2.newSeatAssignment(courseoffer2); //register student in class
        
        FacultyDirectory fd = department1.getFacultydirectory();
        Person faculty1 = pd.newPerson("0112305");
        FacultyProfile fp1 = fd.newFacultyProfile(faculty1);
        
        Person faculty2 = pd.newPerson("0112306");
        FacultyProfile fp2 = fd.newFacultyProfile(faculty2);
        
        courseoffer.AssignAsTeacher(fp1);
        courseoffer2.AssignAsTeacher(fp2);
        
        for(CourseOffer co : courseschedule.getSchedule()){
            for(Seat s : co.getOccupiedSeats()){
                s.getSeatassignment().setGPA((float) (Math.round(((rand.nextInt()& Integer.MAX_VALUE)%4+rand.nextFloat()) * 100.00) / 100.00));
//                System.out.println(s.getSeatassignment().getGPA());
            }
        }
        
        for(StudentProfile sp : sd.getStudentlist()){
            for(CourseLoad cl : sp.getTranscript().getCourseloadlist().values()){
                for(SeatAssignment sa : cl.getSeatassignments()){
                    sa.setStudentRating((rand.nextInt()& Integer.MAX_VALUE)%10);
                    //System.out.println(sa.getStudentRating());
//                    System.out.println(sa.getSeat());
                }
            }
            sp.setInternships((rand.nextInt()& Integer.MAX_VALUE)%10);
//            System.out.println(sp.getInternships());
            sp.setResearchPapers((rand.nextInt()& Integer.MAX_VALUE)%10);
//            System.out.println(sp.getResearchPapers());
            sp.setCertifications((rand.nextInt()& Integer.MAX_VALUE)%10);
//            System.out.println(sp.getCertifications());
            sp.setGPA();
//            System.out.println(sp.getGPA());
        }
        
        ArrayList<Course> relevantcourses = new ArrayList<>();
        relevantcourses.add(course);
        
        ArrayList<Course> relevantcourses2 = new ArrayList<>();
        relevantcourses2.add(course2);
        
        JobDirectory jd = new JobDirectory();
        Job j1 = jd.newJob("Software Developer", "Development", relevantcourses);
        Job j2 = jd.newJob("Data Analyst", "Data", relevantcourses2);
        Job j11 = jd.newJob("Software Developer 2", "Development", relevantcourses);
        Job j22 = jd.newJob("Data Analyst 2", "Data", relevantcourses2);
        
        EmployerDirectory ed = new EmployerDirectory();
        EmployerProfile ep = ed.newEmployerProfile("Amazon Inc.");
        
        EmploymentHistroy eh1 = student.getEmploymenthistory();
        eh1.newEmployment(j1, ep, 0, null, "Best");
        
        EmploymentHistroy eh2 = student2.getEmploymenthistory();
        eh2.newEmployment(j2, ep, 0, new Employment(j22, ep, 0, null, "Better"), "Good");
        
        for(Job j : jd.getJobs()){
            System.out.println("Job: "+j.getRole());
            System.out.println("\tRelevant Course :");
            for(Course c : j.getRelevantcourses()){
                System.out.println("\t"+c.getCOurseNumber());
            }
        }
        
        CourseScheduleRelevance csr = new CourseScheduleRelevance(courseschedule, jd);
//        System.out.println("\nCourse Schedule Relevance: "+csr.calculateCourseScheduleRelevance());
        System.out.println("\nCourse Schedule Relevance: "+ ((float) (Math.round((csr.calculateCourseScheduleRelevance()* 100.00) / 100.00)))*100.00 + "%");
        
        for(StudentProfile sp : sd.getStudentlist()){
            StudentProgressRelevance spr = new StudentProgressRelevance(courseschedule, sp, sp.getEmploymenthistory());
            System.out.println("\nStudent Progress Relevance " + sp.getPerson().getPersonId() +": "+((float) (Math.round((spr.calculateCourseScheduleRelevance()* 100.00) / 100.00)))*100.00 + "%");
        }
        
        System.out.println("\nCourse Schedule for " + courseschedule.getSemester() + ": ");
        for(CourseOffer co : courseschedule.getSchedule()){
            System.out.println("\tSeatList: " + co.getSeatlist().size());
            System.out.println("\tEmptySeats: " + co.getEmptySeats());
//            System.out.println("\tCourse: " + co.getCourse().getCOurseNumber() + "\tFaculty: " + co.getFacultyProfile().getPerson().getPersonId());
            System.out.println("\tCourse: " + co.getCourse().getCOurseNumber() + "\tFaculty: " + co.getFacultyProfile().getPerson().getPersonId() + "\tFacultyRating: " + co.getFacultyassignment().calculateFacultyRating());
        }
            
        //Quality
        System.out.println("Hello");
        
        
        System.out.print("\nTotal Revenue By Semester: " + department1.calculateRevenuesBySemester("Fall2020")+"\n");
        
        
    
    }

}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.Seat;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Department.Department;
import info5100.university.example.Employer.EmployerDirectory;
import info5100.university.example.Employer.EmployerProfile;
import info5100.university.example.Persona.EmploymentHistory.Employment;
import info5100.university.example.Persona.EmploymentHistory.EmploymentHistroy;
import info5100.university.example.Persona.EmploymentHistory.Job;
import info5100.university.example.Persona.EmploymentHistory.JobDirectory;
import info5100.university.example.Persona.Faculty.FacultyAssignment;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import info5100.university.example.Quality.CourseScheduleRelevance;
import info5100.university.example.Quality.StudentProgressRelevance;

import java.lang.Object;
import java.util.ArrayList;
import java.util.Random;
import java.math.RoundingMode;
import java.text.DecimalFormat;
/**
 *
 * @author kal bugrara
 */
public class Info5001UniversityExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Department department1 = new Department("Information Systems");

        Course course = department1.newCourse("app eng", "info 5100", 4);

        CourseSchedule courseschedule = department1.newCourseSchedule("Fall2020");

        CourseOffer courseoffer = courseschedule.newCourseOffer("info 5100");
        
        courseoffer.generatSeats(10);
        
        PersonDirectory pd = department1.getPersonDirectory();
        Person person = pd.newPerson("0112303");
        StudentDirectory sd = department1.getStudentDirectory();
        StudentProfile student = sd.newStudentProfile(person);
        CourseLoad courseload1 = student.newCourseLoad("Fall2020"); 
//        
        SeatAssignment sa1 = courseload1.newSeatAssignment(courseoffer); //register student in class
        
//        int total = department1.calculateRevenuesBySemester("Fall2020");
//        System.out.print("Total: " + total);

        //Sushmitha's and Asfan's Code
        
        Random rand = new Random();
        DecimalFormat df = new DecimalFormat("0.00");
        
        Course course2 = department1.newCourse("DMDD", "info 6200", 4);

        CourseOffer courseoffer2 = courseschedule.newCourseOffer("info 6200");
        
        courseoffer2.generatSeats(20);
        
        Person person2 = pd.newPerson("0112304");
        StudentProfile student2 = sd.newStudentProfile(person2);
        CourseLoad courseload2 = student2.newCourseLoad("Fall2020"); 
//        
        SeatAssignment sa2 = courseload2.newSeatAssignment(courseoffer2); //register student in class
        
        FacultyDirectory fd = department1.getFacultydirectory();
        Person faculty1 = pd.newPerson("0112305");
        FacultyProfile fp1 = fd.newFacultyProfile(faculty1);
        
        Person faculty2 = pd.newPerson("0112306");
        FacultyProfile fp2 = fd.newFacultyProfile(faculty2);
        
        courseoffer.AssignAsTeacher(fp1);
        courseoffer2.AssignAsTeacher(fp2);
        
        for(CourseOffer co : courseschedule.getSchedule()){
            for(Seat s : co.getOccupiedSeats()){
                s.getSeatassignment().setGPA((float) (Math.round(((rand.nextInt()& Integer.MAX_VALUE)%4+rand.nextFloat()) * 100.00) / 100.00));
//                System.out.println(s.getSeatassignment().getGPA());
            }
        }
        
        for(StudentProfile sp : sd.getStudentlist()){
            for(CourseLoad cl : sp.getTranscript().getCourseloadlist().values()){
                for(SeatAssignment sa : cl.getSeatassignments()){
                    sa.setStudentRating((rand.nextInt()& Integer.MAX_VALUE)%10);
                    //System.out.println(sa.getStudentRating());
//                    System.out.println(sa.getSeat());
                }
            }
            sp.setInternships((rand.nextInt()& Integer.MAX_VALUE)%10);
//            System.out.println(sp.getInternships());
            sp.setResearchPapers((rand.nextInt()& Integer.MAX_VALUE)%10);
//            System.out.println(sp.getResearchPapers());
            sp.setCertifications((rand.nextInt()& Integer.MAX_VALUE)%10);
//            System.out.println(sp.getCertifications());
            sp.setGPA();
//            System.out.println(sp.getGPA());
        }
        
        ArrayList<Course> relevantcourses = new ArrayList<>();
        relevantcourses.add(course);
        
        ArrayList<Course> relevantcourses2 = new ArrayList<>();
        relevantcourses2.add(course2);
        
        JobDirectory jd = new JobDirectory();
        Job j1 = jd.newJob("Software Developer", "Development", relevantcourses);
        Job j2 = jd.newJob("Data Analyst", "Data", relevantcourses2);
        Job j11 = jd.newJob("Software Developer 2", "Development", relevantcourses);
        Job j22 = jd.newJob("Data Analyst 2", "Data", relevantcourses2);
        
        EmployerDirectory ed = new EmployerDirectory();
        EmployerProfile ep = ed.newEmployerProfile("Amazon Inc.");
        
        EmploymentHistroy eh1 = student.getEmploymenthistory();
        eh1.newEmployment(j1, ep, 0, null, "Best");
        
        EmploymentHistroy eh2 = student2.getEmploymenthistory();
        eh2.newEmployment(j2, ep, 0, new Employment(j22, ep, 0, null, "Better"), "Good");
        
        for(Job j : jd.getJobs()){
            System.out.println("Job: "+j.getRole());
            System.out.println("\tRelevant Course :");
            for(Course c : j.getRelevantcourses()){
                System.out.println("\t"+c.getCOurseNumber());
            }
        }
        
        CourseScheduleRelevance csr = new CourseScheduleRelevance(courseschedule, jd);
//        System.out.println("\nCourse Schedule Relevance: "+csr.calculateCourseScheduleRelevance());
        System.out.println("\nCourse Schedule Relevance: "+ ((float) (Math.round((csr.calculateCourseScheduleRelevance()* 100.00) / 100.00)))*100.00 + "%");
        
        for(StudentProfile sp : sd.getStudentlist()){
            StudentProgressRelevance spr = new StudentProgressRelevance(courseschedule, sp, sp.getEmploymenthistory());
            System.out.println("\nStudent Progress Relevance " + sp.getPerson().getPersonId() +": "+((float) (Math.round((spr.calculateCourseScheduleRelevance()* 100.00) / 100.00)))*100.00 + "%");
        }
        
        System.out.println("\nCourse Schedule for " + courseschedule.getSemester() + ": ");
        for(CourseOffer co : courseschedule.getSchedule()){
            System.out.println("\tSeatList: " + co.getSeatlist().size());
            System.out.println("\tEmptySeats: " + co.getEmptySeats());
//            System.out.println("\tCourse: " + co.getCourse().getCOurseNumber() + "\tFaculty: " + co.getFacultyProfile().getPerson().getPersonId());
            System.out.println("\tCourse: " + co.getCourse().getCOurseNumber() + "\tFaculty: " + co.getFacultyProfile().getPerson().getPersonId() + "\tFacultyRating: " + co.getFacultyassignment().calculateFacultyRating());
        }
            
        //Quality
        System.out.println("Hello");
        
        
        System.out.print("\nTotal Revenue By Semester: " + department1.calculateRevenuesBySemester("Fall2020")+"\n");
        
        
    
    }

}
>>>>>>> Stashed changes
