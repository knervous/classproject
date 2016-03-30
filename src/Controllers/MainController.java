/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Person.*;
import Location.*;
import AuBonPain.*;
import java.util.ArrayList;

/**
 *
 * @author pcj105
 */
public class MainController {
 
    private ArrayList<Professor> professors;
    private ArrayList<Adviser> advisers;
    private ArrayList<Undergraduate> undergrads;
    private ArrayList<Graduate> graduates;
    private ArrayList<Employee> employees;
    private ArrayList<Manager>managers;
    
    private ArrayList<Lounge> lounges;
    private ArrayList<AdvisingOffice> advisingOffices;
    private ArrayList<Elevator> elevators;
    
    private ArrayList<Classroom> classrooms;
    private ArrayList<Restroom> restrooms;
    
    private AuBonPain auBonPain;
    
    private ArrayList<Coffee> coffees;
    private ArrayList<Sandwich> sandwiches;
    private ArrayList<Soup> soup;
    
    public MainController()
    {
        professors = new ArrayList<>();
        advisers = new ArrayList<>();
        undergrads = new ArrayList<>();
        graduates = new ArrayList<>();
        employees = new ArrayList<>();
        managers = new ArrayList<>();
        lounges = new ArrayList<>();
        advisingOffices = new ArrayList<>();
        elevators = new ArrayList<>();
        classrooms = new ArrayList<>();
        restrooms = new ArrayList<>();
        auBonPain = new AuBonPain();
        coffees = new ArrayList<>();
        sandwiches = new ArrayList<>();
        soup = new ArrayList<>();
    }
    
}
