
import com.insurance.manage.*;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Start {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("   Ankaj Insurance Ltd.  ");
        System.out.println("                 Secure Your Car Today");
        System.out.println("   ");

        boolean flag = true;
        do {
            System.out.println("Select Option from below ");
            System.out.println(" 1. Create Policy ");
            System.out.println(" 2. Renew Policy ");
            System.out.println(" 3. Claim Policy ");
            System.out.println(" 4. Add New Records (Car/Person) ");
            System.out.println(" 5. Update Exiting Record ");
            System.out.println(" 6. Delete Records ");
            System.out.println(" 7. Show ");
            System.out.println(" 8. I'am Done! Thank You! ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    createPolicy();
                    break;
                case 2:
                    renewPolicy();
                    break;
                case 3:
                    claimmingPolicy();
                    break;
                case 4:
                    adding();
                    break;
                case 5:
                    updating();
                    break;
                case 6: deleting();
                    break;
                case 7 :
                   searching();
                    break;
                default: flag = false;
                    break;
            }
        } while (flag);
        System.out.println("               Thank You for Using Ankaj Insurance...");
        System.out.println("                        Ride Peacefully....");
    }


    public static void adding(){

        System.out.println("Select field to Add");
        System.out.println(" 1. Car ");
        System.out.println(" 2. Person ");
        int ch=sc.nextInt();

        switch (ch) {
            case 1 -> {
                String car_no;
                int chassis_no;
                int engine_no;
                String car_made;
                String model;
                int model_year;
                int purchase_price;

                System.out.println("Note : Car details Can't be Updated later.");
                System.out.println("       Fill this section carefully.");
                System.out.print("Enter Car Number : ");
                sc.nextLine();
                car_no = sc.nextLine();
                System.out.print("Enter Chassis Number : ");
                chassis_no = sc.nextInt();
                System.out.print("Enter Engine Number : ");
                engine_no = sc.nextInt();
                System.out.print("Enter Car Made : ");
                sc.nextLine();
                car_made = sc.nextLine();
                System.out.print("Enter Model : ");
                model = sc.nextLine();
                System.out.print("Enter Model Year : ");
                model_year = sc.nextInt();
                System.out.print("Enter Purchase Price : ");
                purchase_price = sc.nextInt();

                car c = new car(car_no,chassis_no,engine_no,car_made,model,model_year,purchase_price);
                boolean ans= inserTo.intoCar(c);

                if(ans)
                    System.out.println("Car Added Successfully...");
                else System.out.println("Error Occurred while adding Car...");
                break;
            }
            case 2 -> {
                String person_name;
                String dob;
                String house_no;
                String locality;
                String city;
                int pin;

                System.out.print("Enter Name : ");
                String h = sc.nextLine();
                person_name = sc.nextLine();
                System.out.print("Enter Date of Birth(YYYY-MM-DD) : ");
                dob = sc.nextLine();
                System.out.println("Enter Address ");
                System.out.print("      House No. : ");
                house_no = sc.nextLine();
                System.out.print("      Locality : ");
                locality = sc.nextLine();
                System.out.print("      City : ");
                city = sc.nextLine();
                System.out.print("      PIN Code : ");
                pin = sc.nextInt();

                person p = new person(person_name,dob,house_no,locality,city,pin);
                boolean ans= inserTo.intoPerson(p);

                if(ans){
                    System.out.println("Person Added Successfully...");
                    System.out.println(" ");}
                else {System.out.println("Error Occurred while adding Person...");
                    System.out.println(" ");}
                break;
            }
            default -> { break;
            }
        }
    }
    public static void updating(){

        int person_id;
        String person_name;
        String dob;
        int age;
        String house_no;
        String locality;
        String city;
        int pin;

        System.out.println("*You can only update Person Details.");
        System.out.println("*Please keep Person ID received before for updating.");

        System.out.println("Enter Person ID : ");
        String r=sc.nextLine();
        person_id=sc.nextInt();
        System.out.print("Enter Name : ");
        String k=sc.nextLine();
        person_name=sc.nextLine();
        System.out.print("Enter Date of Birth(YYYY-MM-DD) : ");
        dob=sc.nextLine();
        System.out.println("Enter Address ");
        System.out.print("      House No. : ");
        house_no=sc.nextLine();
        System.out.print("      Locality : ");
        locality=sc.nextLine();
        System.out.print("      City : ");
        city=sc.nextLine();
        System.out.print("      PIN Code : ");
        pin=sc.nextInt();

        person p = new person(person_id,person_name,dob,house_no,locality,city,pin);
        boolean ans= inserTo.updatePerson(p);

        if(ans){
            System.out.println("Person Updated Successfully...");
            System.out.println(" ");}
        else {System.out.println("Error Occurred while adding Person...");
            System.out.println(" ");}
    }

    public static void createPolicy(){
        int policy_no;
        String car_no;
        int person_id;
        int emi;

        System.out.println("Enter Person ID : ");
        person_id = sc.nextInt();
        System.out.print("Enter Car Number : ");
        String car_n=sc.nextLine();
        car_no=sc.nextLine();
        System.out.println("Enter EMI : ");
        emi=sc.nextInt();
      boolean b =policy.craetePolicy(emi,car_no,person_id);
       if(b) System.out.println("Policy Created Successfully...");
       else System.out.println("Any Error Occurred...");
    }


    public static void claimmingPolicy(){
        int policy_no;
        int repair_id;

        System.out.println("Enter Policy Number : ");
        policy_no = sc.nextInt();
        System.out.print("Enter Repair ID : ");
        repair_id=sc.nextInt();
        boolean b =claim.claimPolicy(policy_no,repair_id);
        if(b) System.out.println("Policy Claimed Successfully...");
        else System.out.println("Any Error Occurred...");
    }

    public static void renewPolicy(){
        int policy_no;
        int emi;

        System.out.println("Enter Policy Number : ");
        policy_no = sc.nextInt();
        System.out.println("Enter EMI : ");
        emi=sc.nextInt();
        boolean b =policy.renewPolicy(policy_no,emi);
        if(b) System.out.println("Policy Created Successfully...");
        else System.out.println("Any Error Occurred...");
    }


    public static void deleting() {

        System.out.println("Select field to Delete");
        System.out.println(" 1. Car ");
        System.out.println(" 2. Policy ");
        System.out.println(" 3. Person ");
        System.out.println(" 4. Repair ");
        System.out.println(" 5. Claim ");
        System.out.println(" 6. Insurance ");
        System.out.println(" 7. Own ");
        System.out.println(" 8. Driver ");

        int ch = sc.nextInt();

        switch (ch) {
            case 1 :
                    System.out.println("Enter Car Number to delete : ");
                     String d=sc.nextLine();
                    String car_no=sc.nextLine();
                   boolean flag1= deleteDB.deleteCar(car_no);
                   if(flag1)
                       System.out.println("Deleted Successfully...");
                   else System.out.println("Error Occurred while Deleting...");
                break;
            case 2 :  System.out.println("Enter Policy Number to delete : ");
                int policy_no=sc.nextInt();
                boolean flag2=deleteDB.deletePerson(policy_no);
                if(flag2)
                    System.out.println("Deleted Successfully...");
                else System.out.println("Error Occurred while Deleting...");
                break;
            case 3 : System.out.println("Enter Person ID to delete : ");
                int person_id=sc.nextInt();
                boolean flag3=deleteDB.deletePerson(person_id);
                if(flag3)
                    System.out.println("Deleted Successfully...");
                else System.out.println("Error Occurred while Deleting...");
                break;
            case 4 : System.out.println("Enter Repair ID to delete : ");
                int repair_id=sc.nextInt();
                boolean flag4=deleteDB.deleteRepair(repair_id);
                if(flag4)
                    System.out.println("Deleted Successfully...");
                else System.out.println("Error Occurred while Deleting...");
                break;
            case 5 :  System.out.println("Enter Claim ID to delete : ");
                int claim_id=sc.nextInt();
               boolean flag5= deleteDB.deleteClaim(claim_id);
                if(flag5)
                    System.out.println("Deleted Successfully...");
                else System.out.println("Error Occurred while Deleting...");
                break;
            case 6 :  System.out.println("Enter Car Number : ");
                String car_n=sc.nextLine();
                System.out.println("Enter Policy NUmber : ");
                int policy_n=sc.nextInt();
                boolean flag6=deleteDB.deleteInsurance(car_n, policy_n);
                if(flag6)
                    System.out.println("Deleted Successfully...");
                else System.out.println("Error Occurred while Deleting...");
                break;
            case 7 :  System.out.println("Enter Car Number to delete : ");
                String car_=sc.nextLine();
               boolean flag7= deleteDB.deleteOwn(car_);
                if(flag7)
                    System.out.println("Deleted Successfully...");
                else System.out.println("Error Occurred while Deleting...");
                break;
            case 8 :  System.out.println("Enter Licence Number to delete : ");
                int licence_no=sc.nextInt();
                boolean flag8=deleteDB.deleteDriver(licence_no);
                if(flag8)
                    System.out.println("Deleted Successfully...");
                else System.out.println("Error Occurred while Deleting...");
                break;
            default :
                break;

        }
    }


    public static void searching() {

        System.out.println("Select field to Search");
        System.out.println(" 1. Car ");
        System.out.println(" 2. Policy ");
        System.out.println(" 3. Person ");
        System.out.println(" 4. Repair ");
        System.out.println(" 5. Claim ");
        System.out.println(" 6. Own ");
        System.out.println(" 7. Driver ");

        int ch = sc.nextInt();

        switch (ch) {
            case 1 : searchDB.SearchCar();
                break;
            case 2 : searchDB.SearchPolicy();
                break;
            case 3 : searchDB.SearchPerson();
                break;
            case 4 : searchDB.SearchRepair();
                break;
            case 5 : searchDB.SearchClaim();
                break;
            case 6 : searchDB.SearchOwn();
                break;
            case 7 : searchDB.SearchDriver();
                break;
            default :
                break;

        }
    }
}




