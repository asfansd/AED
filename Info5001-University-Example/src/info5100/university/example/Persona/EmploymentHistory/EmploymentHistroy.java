<<<<<<< Updated upstream
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.EmploymentHistory;

import info5100.university.example.Employer.EmployerProfile;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class EmploymentHistroy {
    ArrayList<Employment> employments;
    public EmploymentHistroy(){
        employments = new ArrayList();
    }
    
    public Employment newEmployment(Job j, EmployerProfile employer, int weight, Employment nextemplyment, String quality){
        Employment ne = new Employment(j, employer, weight, nextemplyment, quality);
        employments.add(ne);
        return ne;
    }

    public ArrayList<Employment> getEmployments() {
        return employments;
    }

    public void setEmployments(ArrayList<Employment> employments) {
        this.employments = employments;
    }
    
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.EmploymentHistory;

import info5100.university.example.Employer.EmployerProfile;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class EmploymentHistroy {
    ArrayList<Employment> employments;
    public EmploymentHistroy(){
        employments = new ArrayList();
    }
    
    public Employment newEmployment(Job j, EmployerProfile employer, int weight, Employment nextemplyment, String quality){
        Employment ne = new Employment(j, employer, weight, nextemplyment, quality);
        employments.add(ne);
        return ne;
    }

    public ArrayList<Employment> getEmployments() {
        return employments;
    }

    public void setEmployments(ArrayList<Employment> employments) {
        this.employments = employments;
    }
    
}
>>>>>>> Stashed changes
