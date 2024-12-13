package Problems.EventManagement;

import java.util.*;

/*
*  Event is seprate service
*  User contain only booked times
*  controller manage all the operation  and Event class only handle evetn details
*
*
* */
public class EventManagement {

    private List<User> users;



    private EventContoller eventContoller;

    public EventManagement(List<User> users) {
        this.users = users;
        this.eventContoller=new EventContoller();
    }



    public static void main(String[] args) {
        User user1 = new User(new Account("jai","jai@gmail.com"));
        User user2 = new User(new Account("Rahul", "Rahul@gmail.com"));
        User user3 = new User(new Account("Ram","Ram@gmail.com" ));

        EventManagement client = new EventManagement(Arrays.asList(user1,user2,user3));

        Event event1 = new Event("Birhtday Celebration", user1,"Bangalore",
                new EventTime(new Date(2023, Calendar.MAY,11,1,00), new Date(2023, Calendar.MAY,11,6,00)) );
        client.eventContoller.addEvents(event1);
        client.eventContoller.inviteAttendens(event1, Arrays.asList(
                user2,
                user3
        ));


        System.out.println("Event is create : " + event1);
        //client.addEvents(event1);

        Event event2 = new Event("Party Celebration", user2,"Bangalore",
                new EventTime(new Date(2023, Calendar.MAY,11,6,01), new Date(2023, Calendar.MAY,11,12,00)));
        client.eventContoller.addEvents(event2);
        client.eventContoller.inviteAttendens(event2, Arrays.asList(
                        user1,
                        user3
                ));

        System.out.println("Event2 is create : " + event2);



    }

}
