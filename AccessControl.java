
package com.mycompany.eventemasterpromedellin;

import java.util.HashSet;
import java.util.Set;

public class AccessControl {
    private Set<String> registeredAttendees;
    
    public AccessControl(){
        this.registeredAttendees = new HashSet<>();
    }
    
    public void registerAttendee(String attendeeName){
    if (registeredAttendees.add(attendeeName)) {
        System.out.println(attendeeName + " has been successfully registered.");
    } else {
        System.out.println(attendeeName + " is already registered.");
    }
    }
    
    public void validateTicket(String attendeeName){
        if(registeredAttendees.contains(attendeeName)){
            System.out.println(attendeeName + " is allowed to enter.");
        }else{
            System.out.println(attendeeName + " is not registered for this event.");
        }
    }
    
    public void generateAttendanceStats(){
        System.out.println("Total registered attendees: " + registeredAttendees.size());
    }
    
    @Override
    public String toString(){
        return "Registered Attendees: " + registeredAttendees;
    }
}
