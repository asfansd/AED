/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.College;

import info5100.university.example.Department.Department;
import java.util.ArrayList;

/**
 *
 * @author harooniqbal
 */
public class College {
    ArrayList<Department> departments;
    String collegename;

   
    public College(String clgname){
        departments = new ArrayList<Department>();
        collegename = clgname; 
}
    
    
    
}
