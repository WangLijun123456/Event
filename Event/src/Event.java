import java.util.ArrayList;
import java.util.Date; 

public class Event {
    private String eventID;
    private String eventName;
    private String eventVenue;
    private Date eventDate; 
    private ArrayList<String> attendees; 


    public Event(String eventID, String eventName, String eventVenue, Date eventDate) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventVenue = eventVenue;
        this.eventDate = eventDate;
        this.attendees = new ArrayList<String>();
    }

    
    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventVenue() {
        return eventVenue;
    }

    public void setEventVenue(String eventVenue) {
        this.eventVenue = eventVenue;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public void addAttendee(String attendee) {
        attendees.add(attendee);
    }

    
    public void removeAttendee(String attendee) {
        attendees.remove(attendee);
    }

   
    public void updateAttendee(String oldName, String newName) {
        int index = attendees.indexOf(oldName);
        if (index != -1) {
            attendees.set(index, newName);
        }
    }

    
    public boolean findAttendee(String attendee) {
        return attendees.contains(attendee);
    }

    
    public int getTotalAttendees() {
        return attendees.size();
    }

    
    
    public String toString() {
        return "Event{" +
                "eventID='" + eventID + '\'' +
                ", eventName='" + eventName + '\'' +
                ", eventVenue='" + eventVenue + '\'' +
                ", eventDate=" + eventDate +
                ", attendees=" + attendees +
                '}';
    }
}
