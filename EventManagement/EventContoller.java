package Problems.EventManagement;

import java.util.ArrayList;
import java.util.List;

public class EventContoller {
    private List<Event> events;

    public EventContoller() {
        this.events = new ArrayList<>();
    }

    private List<Event> getEvents() {
        return events;
    }

    public void addEvents(Event events) {
        this.events.add(events);
    }

    public void inviteAttendens(Event event,List<User> user){
        checkConflicts(event,user);
    }
    private void checkConflicts(Event event,List<User> attendes){
        for(User newGuest:attendes){
            boolean flag = true;
            for(EventTime userEventTime: newGuest.getReservedDates()){
                // -1  a < b 0 a==b  1 a > b
                if(event.getEventTime().getStart().compareTo(userEventTime.getStart()) != -1  &&
                event.getEventTime().getStart().compareTo(userEventTime.getEnd()) !=1 ){

                    flag=false;
                    System.out.printf("%s user is alreday have event for this time: %s \n" , newGuest.getAccount().getName(), event.getEventTime());
                    break;
                }

            }
            if(flag){
                System.out.printf("%s Event is added for this User: %s \n" , event.getEventTime(),newGuest.getAccount().getName());

                event.addAttendes(newGuest);
                newGuest.addReservedDates(event.getEventTime());
            }
//            if(newGuest.getReservedDates().contains(event.getEventTime())){
//                System.out.printf("%s user is alreday have event for this time: %s \n" , newGuest.getAccount().getName(), event.getEventTime());
//
//            }
//            else {
//                System.out.printf("%s Event is added for this User: %s \n" , event.getEventTime(),newGuest.getAccount().getName());
//                event.addAttendes(newGuest);
//                newGuest.addReservedDates(event.getEventTime());
//            }
        }
    }
    public List<Event> getUserEvents(User user){
        List<Event> res = new ArrayList<>();

        for(Event event: getEvents()){
            if(event.getEventManager().equals(user)){
                res.add(event);
            }
        }
        return res;
    }
}
