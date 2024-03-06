import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Event event = createEvent(scanner);

    
        organizeEvent(scanner, event);

        
        System.out.println(event);
    }

    private static Event createEvent(Scanner scanner) {
        System.out.println("Enter event ID:");
        String eventID = scanner.nextLine();


        System.out.println("Enter event name:");
        String eventName = scanner.nextLine();

        System.out.println("Enter event venue:");
        String eventVenue = scanner.nextLine();

        System.out.println("Enter event date(format(YYYY-MM-DD):");
        String dateString = scanner.nextLine();

        Date eventDate = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            eventDate = dateFormat.parse(dateString);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new Event(eventID, eventName, eventVenue, eventDate);
    }

    
    private static void organizeEvent(Scanner scanner, Event event) {
        while (true) {
            System.out.println("Enter option:");
            System.out.println("1. Add attendee");
            System.out.println("2. Remove attendee");
            System.out.println("3. Update attendee");
            System.out.println("4. Find attendee");
            System.out.println("5. Display event details");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Enter attendee name to add:");
                    String attendeeToAdd = scanner.nextLine();
                    event.addAttendee(attendeeToAdd);
                    break;
                case 2:
                    System.out.println("Enter attendee name to remove:");
                    String attendeeToRemove = scanner.nextLine();
                    event.removeAttendee(attendeeToRemove);
                    break;
                case 3:
                    System.out.println("Enter attendee name to update:");
                    String oldName = scanner.nextLine();
                    System.out.println("Enter new name:");
                    String newName = scanner.nextLine();
                    event.updateAttendee(oldName, newName);
                    break;
                case 4:
                    System.out.println("Enter attendee name to search:");
                    String attendeeToFind = scanner.nextLine();
                    boolean found = event.findAttendee(attendeeToFind);
                    if (found) {
                        System.out.println("find the attendee:" + attendeeToFind);
                    } else {
                        System.out.println("not find the attendee:" + attendeeToFind);
                    }
                    break;
                case 5:
                    System.out.println("the total number of people attending the event:" + event.getTotalAttendees());
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        }
    }
}

           