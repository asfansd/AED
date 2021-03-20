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
 * @author Okami
 */
public class University {
    String name;
    ArrayList<College> colleges;

    public University(String name) {
        this.name = name;
        this.colleges = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<College> getColleges() {
        return colleges;
    }

    public void setColleges(ArrayList<College> colleges) {
        this.colleges = colleges;
    }
    
    public College addNewCollege(String name){
        College c = new College(name);
        colleges.add(c);
        return c;
    }
}