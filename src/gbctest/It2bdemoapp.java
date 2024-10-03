package gbctest;
import java.util.Scanner;

public class It2bdemoapp {
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String response;
        
        do{
            System.out.println("1. ADD");
            System.out.println("2. VIEW");
            System.out.println("3. UPDATE");
            System.out.println("4. DELETE");
            System.out.println("5. EXIT");

            System.out.println("Enter Action: ");
            int action = sc.nextInt();
            It2bdemoapp sample = new It2bdemoapp ();
            switch(action){
                case 1:
                    sample.addpeople();
                    break;
                case 2:
                    break;
        }
            System.out.println("Do you want to continue? (yes/no): ");
            response = sc.next();

            } while (response.equalsIgnoreCase("yes"));

                System.out.println("Thak you, See you later!");
        }
             public void addpeople(){
                Scanner sc = new Scanner(System.in);
                config conf = new config();
                System.out.print("First Name: ");
                String fname = sc.next();
                System.out.print("Last Name: ");
                String lname = sc.next();
                System.out.print("Email: ");
                String email = sc.next();
                System.out.print("Status: ");
                String status = sc.next();

                String sql = "INSERT INTO StudentsG (s_fname, s_lname, s_email, s_status) VALUES (?, ?, ?, ?)";


                conf.addRecord(sql, fname, lname, email, status);

        }
    }
