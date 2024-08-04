import java.util.Scanner;

class ticket{
    String[]tickets;
    int no_of_tickets;
    ticket(){
        this.tickets = new String[100];
        this.no_of_tickets = 0;
    }
    void addTicket(String ticket){
        this.tickets[no_of_tickets] = ticket;
        no_of_tickets++;
    }
    public void bookTicket(String ticket){
        for (int i =0 ; i<this.tickets.length ; i++) {
            if (this.tickets[i].equals(ticket)) {
                System.out.println("Successfully purchase your ticket!");
                this.tickets[i]=null;
                return;
            }
        }
        System.out.println("The ticket is no more available");
    }
    void returnTicket(String ticket){
        addTicket(ticket);
        System.out.println("The ticket successfully returned");
    }
    public void showAvailableTicket(){
        System.out.println("Available movie tickets are:");
        for (String ticket : this.tickets){
            if(ticket == null){
                continue;
            }
            System.out.println(" * "+ticket);
        }
    }
}
public class online_ticket {
    public static void main(String[] args) {
        while (true){
            ticket GurukulTicket = new ticket();
            System.out.println("Following are the services provided to you :");
            System.out.println("1.  Show Available tickets");
            System.out.println("2.  Add ticket");
            System.out.println("3.  Book ticket");
            System.out.println("4.  Cancel/Return ticket");
            System.out.println("5.  Exit");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice :");
            int n = sc.nextInt();
            if (n==1) {
                GurukulTicket.showAvailableTicket();

            } else if (n==2) {
                System.out.println("How many ticket you want to add :");
                int a = sc.nextInt();
                for (int i = 0; i < a; i++) {
                    System.out.println("Enter the name of the movie :");
                    String ticket = sc.next();
                    GurukulTicket.addTicket(ticket);
                }
                System.out.println("All ticket added successfully");


            } else if (n==3) {
                System.out.println("Enter the name of the movie :");
                String ticket = sc.next();
                GurukulTicket.bookTicket(ticket);

            } else if (n==4) {
                System.out.println("Name of the ticket you want to return :");
                String name = sc.next();
                GurukulTicket.returnTicket(name);
            }else {
                break;
            }
        }
    }
}

