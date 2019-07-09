import java.util.*;

    public class railway {

        public static ArrayList<String> namearr = new ArrayList<String>();
        public static ArrayList<String> mobilearr = new ArrayList<String>();
        public static ArrayList<String> addressarr = new ArrayList<String>();
        public static ArrayList<String> ticketarr = new ArrayList<String>(); 
        public static Scanner sc = new Scanner(System.in);
        public static int n;
        
        static void book(){
            System.out.println("Enter the name");
            String name = sc.next();
            System.out.println("Enter the mobile number");
            String mobile = sc.next();
            System.out.println("Enter the address");
            String address = sc.next();
            System.out.println("Enter the ticket number (from 1 to 10)");
            String ticket = sc.next();
            namearr.add(name);
            mobilearr.add(mobile);
            addressarr.add(address);
            ticketarr.add(ticket);
            System.out.println("Ticket Booked");
        }

        static void cancel(){
            System.out.println("Enter the ticket number (from 1 to 10)");
            String ticketnum = sc.next();
            int index = ticketarr.indexOf(ticketnum);
            namearr.remove(index);
            mobilearr.remove(index);
            addressarr.remove(index);
            ticketarr.remove(index);
            System.out.println("Ticket Cancelled");
        }

        static void view(){
            for(int i=0;i<namearr.size();i++)
            {
            System.out.println("Name : " + namearr.get(i));
            System.out.println("Mobile : " + mobilearr.get(i));
            System.out.println("Address : " + addressarr.get(i));
            System.out.println("Ticket Number : " + ticketarr.get(i));
            System.out.println();
            }
        }

         public static void main(String args[]){

            do{
            System.out.println("1.Booking");
            System.out.println("2.Cancelation");
            System.out.println("3.View");
            System.out.println("4.Exit");
            n = sc.nextInt();

        switch(n)
        {
            case 1 : book(); break;
            case 2 : cancel();break;
            case 3 : view(); break;
            case 4 : System.out.println("Bye"); break;
            default : System.out.println("Invalid input"); break;
        }

    }while(n!=4);

         }

    }