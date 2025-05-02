

package com.mycompany.eventemasterpromedellin;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EventeMasterProMedellin {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Event> events = new ArrayList<>(); 
    private static List<Venue> venues = new ArrayList<>(); 
    private static List<Artist> artists = new ArrayList<>(); 
    private static List<Ticket> tickets = new ArrayList<>();
    private static AccessControl accessControl = new AccessControl();
    
    public static void main(String[] args) {
        int option;
        
        do{
            showMenu();
            option = scanner.nextInt();
            scanner.nextLine();
            
            switch(option){
                case 1:
                    createEvent();
                    break;
                case 2:
                    listEvents();
                    break;
                case 3:
                    createVenue();
                    break;
                case 4:
                    listVenues();
                    break;
                case 5:
                    registerArtist();
                    break;
                case 6:
                    listArtists();
                    break;
                case 7:
                    createTicket();
                    break;
                case 8:
                    sellTicket();
                    break;
                case 9:
                    registerAttendee();
                    break;
                case 10:
                    accessControl.generateAttendanceStats();
                    break;
                case 0:
                    System.out.println("Exiting EvenMaster Pro Medellin. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. please try again.");              
            }        
       }while(option !=0);
    }
    
    private static void showMenu(){
        System.out.println("\n--- EventMaster Pro Medellin Menu ---");
        System.out.println("1. Create Event.");
        System.out.println("2. List Events.");
        System.out.println("3. Create Venue.");
        System.out.println("4. List Venues.");
        System.out.println("5. Register Artist.");
        System.out.println("6. List Artists.");
        System.out.println("7. Create Ticket.");
        System.out.println("8. Sell Ticket.");
        System.out.println("9. Register Attendee.");
        System.out.println("10. Show Attendace Statistics.");
        System.out.println("0. Exit.");
        System.out.println("Select an option:");
    }
    
    private static void createEvent(){
        System.out.println("Enter Event ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Event Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Event Date (YYYY-MM-DD): ");
        String dateInput = scanner.nextLine();
        LocalDate date = LocalDate.parse(dateInput);
        System.out.println("Enter Event Time (HH:MM): ");
        String timeInput = scanner.nextLine();
        LocalTime time = LocalTime.parse(timeInput);
        System.out.println("Enter Event Location: ");
        String location = scanner.nextLine();
        System.out.println("Enter Event Category: ");
        String category = scanner.nextLine();
        
        Event event = new Event(id, name, date, time, location, category);
        events.add(event);
        System.out.println("Event created successfully!");
    }
    
    private static void listEvents(){
        if(events.isEmpty()){
            System.out.println("No events available.");
        }else{
            for(Event event : events){
                System.out.println(event);
            }
        }
    }
    
    private static void createVenue(){
        System.out.println("Enter Venue ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Venue Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Venue Capacity: ");
        int capacity = scanner.nextInt();
        scanner.nextLine();
        
        Venue venue = new Venue(id, name, capacity);
        venues.add(venue);
        System.out.println("Venue created successfully!");
    }
    
    private static void listVenues(){
        if(venues.isEmpty()){
            System.out.println("No venues avaible.");
        }else{
            for(Venue venue : venues){
                System.out.println(venue);
            }
        }
    }
    private static void registerArtist(){
        System.out.println("Enter Artist ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Artist Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Artist Contact Info: ");
        String contact = scanner.nextLine();
        
        Artist artist = new Artist(id, name, contact);
        artists.add(artist);
        System.out.println("Artist registered successsfully!");
    }
    
    private static void listArtists(){
        if(artists.isEmpty()){
            System.out.println("No artist available.");
       }else{
            for(Artist artist : artists){
                System.out.println(artist);
        }
      }
    }
    
    private static void createTicket(){
        System.out.println("Enter Ticket ID: ");
        int id = scanner.nextInt();
        System.out.println("Enter Event ID for Ticket: ");
        int eventId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Ticket Type (e.g. General, VIP): ");
        String type = scanner.nextLine();
        System.out.println("Enter Ticket Price: ");
        double price = scanner.nextDouble();
        
        Ticket ticket = new Ticket(id, eventId, type, price, false);
        tickets.add(ticket);
        System.out.println("Ticket created successfully!");
    }
    
    private static void sellTicket(){
        System.out.println("Enter Ticket ID to sell: ");
        int id =  scanner.nextInt();
        
        for(Ticket ticket : tickets){
            if(ticket.getId() == id){
                ticket.sellTicket();
                return;
            }
        }
        System.out.println("Ticket not found.");
    }
    
    private static void registerAttendee(){
        System.out.println("Enter Attendee Name: ");
        String name = scanner.nextLine();
        accessControl.registerAttendee(name);
    }
}
