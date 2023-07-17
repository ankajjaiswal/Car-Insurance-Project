package com.insurance.manage;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class searchDB {
    public static void SearchCar(){

        try{
            Connection com=ConnectionToDB.createConnection();

            String q="select * from car;";

            Statement prt=com.createStatement();

            ResultSet set=prt.executeQuery(q);
             while(set.next()) {
                 int chassis_no= set.getInt(2);
                 int engine_no= set.getInt(3);
                 String car_made= set.getString(4);
                 String model= set.getString(5);
                 String model_year = set.getString(6);
                 int purchase_price = set.getInt(7);
                 System.out.println("Car Make : "+car_made);
                 System.out.println("Model : "+model);
                 System.out.println("Model Year : "+model_year);
                 System.out.println("Price : "+purchase_price);
                 System.out.println("Chassis Number : "+chassis_no);
                 System.out.println("Engine Number : "+engine_no);
                 System.out.println("__________________________________________");
             }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void SearchPerson(){

        try{
            Connection com=ConnectionToDB.createConnection();

            String q="select * from person;" ;

            Statement prt=com.createStatement();

            ResultSet set=prt.executeQuery(q);
            while(set.next()) {
                int person_id= set.getInt(1);
                String person_name= set.getString(2);
                String dob=set.getString(3);
                int age= set.getInt(4);
                String house_no= set.getString(5);
                String locality= set.getString(6);
                String city= set.getString(7);
                int pin = set.getInt(8);
                System.out.println("Person ID : "+person_id);
                System.out.println("Name : "+person_name);
                System.out.println("Date of Birth : "+dob);
                System.out.println("Age : "+age);
                System.out.println("House : "+house_no);
                System.out.println("Locality : "+locality);
                System.out.println("City : "+city);
                System.out.println("PIN : "+pin);
                System.out.println("__________________________________________");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void SearchPolicy(){

        try{
            Connection com=ConnectionToDB.createConnection();

            String q="select * from policy;" ;

            Statement prt=com.createStatement();

            ResultSet set=prt.executeQuery(q);
            while(set.next()) {
                int policy_no= set.getInt(1);
                String policy_date= set.getString(2);
                int emi = set.getInt(3);
                String valid_till= set.getString(4);
                System.out.println("Policy Number : "+policy_no);
                System.out.println("Issue Date : "+policy_date);
                System.out.println("Monthly Installment : "+emi);
                System.out.println("Valid Till : "+valid_till);
                System.out.println("__________________________________________");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void SearchRepair(){

        try{
            Connection com=ConnectionToDB.createConnection();

            String q="select * from repair;" ;

            Statement prt=com.createStatement();

            ResultSet set=prt.executeQuery(q);
            while(set.next()) {
                int repair_id= set.getInt(1);
                int repair_amount= set.getInt(2);
                String workshop_name= set.getString(3);
                int wsp_bill_no= set.getInt(4);
                String claim_date= set.getString(5);
                System.out.println("Repair ID : "+repair_id);
                System.out.println("Cost of Repair : "+repair_amount);
                System.out.println("Workshop Name : "+workshop_name);
                System.out.println("Bill Number : "+wsp_bill_no);
                System.out.println("Claim  Date : "+claim_date);
                System.out.println("__________________________________________");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void SearchClaim(){

        try{
            Connection com=ConnectionToDB.createConnection();

            String q="select * from claim;" ;

            Statement prt=com.createStatement();

            ResultSet set=prt.executeQuery(q);
            while(set.next()) {
                int claim_id= set.getInt(1);
                int repair_id= set.getInt(2);
                int policy_no= set.getInt(3);
                String claim_date= set.getString(4);


                System.out.println("Claim ID : "+claim_id);
                System.out.println("Claim Date : "+claim_date);
                System.out.println("Policy Number : "+policy_no);
                System.out.println("Repair ID : "+claim_date);
                System.out.println("__________________________________________");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }


    public static void SearchOwn(){

        try{
            Connection com=ConnectionToDB.createConnection();

            String q="select * from own;" ;

            Statement prt=com.createStatement();

            ResultSet set=prt.executeQuery(q);
            while(set.next()) {
                int person_no= set.getInt(1);
                String car_no= set.getString(2);
                System.out.println("Car Number : "+car_no);
                System.out.println("Person ID : "+person_no);
                System.out.println("__________________________________________");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }


    public static void SearchDriver(){

        try{
            Connection com=ConnectionToDB.createConnection();

            String q="select * from driver;" ;

            Statement prt=com.createStatement();

            ResultSet set=prt.executeQuery(q);
            while(set.next()) {
                int person_no= set.getInt(1);
                int licence_no= set.getInt(2);
                System.out.println("Person ID : "+person_no);
                System.out.println("Licence Number : "+licence_no);
                System.out.println("__________________________________________");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
