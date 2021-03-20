/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.University;

import info5100.university.example.College.College;
import java.util.ArrayList;

/**
 *
 * @author harooniqbal
 */
public class University {
     ArrayList<College> colleges;
    String universityname;

   
    public University(String univname){
        colleges = new ArrayList<College>();
        universityname = univname; 
}
}
