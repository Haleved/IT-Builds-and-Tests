package gbctest;

import java.util.Scanner;


public class CarRent {
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String response;
        
        do{
            System.out.println("1. ADD");
            System.out.println("2. VIEW");
            System.out.println("3. UPDATE");
            System.out.println("4. DELETE");
            System.out.println("5. EXIT");

            System.out.print("Enter Action: ");
            int action = sc.nextInt();
            CarRent sample = new CarRent ();
            switch(action){
                case 1:
                    sample.addpeople();
                    break;
                case 2:
                    sample.viewpeople();      
                    break;
                case 3:
                    sample.viewpeople();
                    sample.updatepeople();
                    sample.viewpeople();
                    break;
                case 4:
                     sample.viewpeople();
                    sample.deletepeople();
                    sample.viewpeople();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
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
             private void viewpeople() {
        String qry = "SELECT * FROM StudentsG";
        String[] hdrs = {"ID", "First Name", "Last Name", "Email", "Status"};
        String[] clmns = {"s_id", "s_fname", "s_lname", "s_email", "s_status"};

        config conf = new config();
        conf.viewRecords(qry, hdrs, clmns);
    }

             private void updatepeople(){
             Scanner sc = new Scanner(System.in);
             System.out.print("Enter ID to update: ");
             int id = sc.nextInt();
             
                 System.out.print("New First Name: ");
                 String nfname = sc.next();
                 System.out.print("New Last Name: ");
                 String nlname = sc.next();
                 System.out.print("New Email: ");
                 String nemail = sc.next();
                 System.out.print("New Status: ");
                 String nstatus = sc.next();
                 
                 String qry = "UPDATE StudentsG SET s_fname = ?, s_lname = ?, s_email = ?, s_status = ? WHERE s_id = ?";
                 
                 config conf = new config();
                 conf.updateRecord(qry, nfname, nlname, nemail, nstatus, id);
             }
             
             private void deletepeople(){
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter ID to delete: ");
             int id = sc.nextInt();
             
             String qry = "DELETE FROM StudentsG WHERE s_id = ?";
             
             config conf = new config();
             conf.deleteRecord(qry, id);
             }
}