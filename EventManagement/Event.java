package Problems.EventManagement;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Event {
    private static int counter=0;
    private int eventId;
    private String description;
    private User eventManager;
    private String location;
    private EventTime eventTime;
    private List<User> attendes;

    public Event(String description, User eventManager, String location, EventTime eventTime) {
        this.eventId = ++eventId;
        this.description = description;
        this.eventManager = eventManager;
        this.location = location;
        this.eventTime = eventTime;
        // todo: check the time conflict
        this.attendes = new ArrayList<>();
        //checkConflicts(attendes);
        eventManager.addReservedDates(eventTime);
        this.attendes.add(eventManager);
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getEventManager() {
        return eventManager;
    }

    public void setEventManager(User eventManager) {
        this.eventManager = eventManager;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public EventTime getEventTime() {
        return eventTime;
    }

    public void setEventTime(EventTime eventTime) {
        this.eventTime = eventTime;
    }

    public List<User> getAttendes() {
        return attendes;
    }

    public void addAttendes(List<User> attendes) {

        //checkConflicts(attendes);
    }

    public void addAttendes(User attendes) {
       this.attendes.add(attendes);
    }
//    private void checkConflicts(List<User> attendes){
//        for(User newGuest:attendes){
////            boolean flag = true;
////            for(Event event: eventContoller.getUserEvents(newGuest)){
////                if(event.getEventTime() == getEventTime()){
////                    flag=false;
////                    System.out.printf("%s user is alreday have event for this time: %s \n" , newGuest.getAccount().getName(), getEventTime());
////                    break;
////                }
////
////            }
////            if(flag){
////                System.out.printf("%s Event is added for this User: %s \n" , getEventTime(),newGuest.getAccount().getName());
////
////                addAttendes(newGuest);
////                newGuest.addReservedDates(this.getEventTime());
////            }
//            if(newGuest.getReservedDates().contains(this.eventTime)){
//                System.out.printf("%s user is alreday have event for this time: %s \n" , newGuest.getAccount().getName(), getEventTime());
//
//            }
//            else {
//                System.out.printf("%s Event is added for this User: %s \n" , getEventTime(),newGuest.getAccount().getName());
//                addAttendes(newGuest);
//                newGuest.addReservedDates(this.getEventTime());
//            }
//        }
//    }

    @Override
    public String toString() {
        return "Event{" +
                "eventId=" + eventId +
                ", description='" + description + '\'' +
                ", eventManager=" + eventManager +
                ", location='" + location + '\'' +
                ", eventTime=" + eventTime +
                ", attendes=" + attendes +
                '}';
    }
}
