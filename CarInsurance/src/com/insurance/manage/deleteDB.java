package com.insurance.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class deleteDB {
    public static boolean deleteCar(String car_no){
            boolean flag=true;
        try{
            Connection com=ConnectionToDB.createConnection();

            String q="delete from car where car_no=?" ;

            PreparedStatement prt=com.prepareStatement(q);

            prt.setString(1,car_no);
            prt.executeUpdate();
            flag=true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    public static boolean deletePerson(int person_id){
              boolean flag=false;
        try{
            Connection com=ConnectionToDB.createConnection();

            String q="delete from person where person_id=?" ;

            PreparedStatement prt=com.prepareStatement(q);

            prt.setInt(1,person_id);
            prt.executeUpdate();
            flag=true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }


    public static boolean deletePolicy(int policy_no){
          boolean flag=false;
        try{
            Connection com=ConnectionToDB.createConnection();

            String q="delete from policy where policy_no=?" ;

            PreparedStatement prt=com.prepareStatement(q);

            prt.setInt(1,policy_no);
            prt.executeUpdate();
            flag=true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }


    public static boolean deleteRepair(int repair_id){
            boolean flag=false;
        try{
        Connection com=ConnectionToDB.createConnection();

        String q="delete from repair where repair_id=?" ;

        PreparedStatement prt=com.prepareStatement(q);

        prt.setInt(1,repair_id);
            prt.executeUpdate();
        flag=true;
        }
        catch(Exception e){
        e.printStackTrace();
        }
        return flag;
        }



    public static boolean deleteClaim(int claim_id){
    boolean flag=false;
        try{
        Connection com=ConnectionToDB.createConnection();

        String q="delete from claim where claim_id=?" ;

        PreparedStatement prt=com.prepareStatement(q);

        prt.setInt(1,claim_id);
            prt.executeUpdate();
        flag=true;
        }
        catch(Exception e){
        e.printStackTrace();
        }
        return flag;
        }



    public static boolean deleteInsurance(String car_no, int policy_no){
                boolean flag=false;
        try{
        Connection com=ConnectionToDB.createConnection();

        String q="delete from insurance where car_no=? and policy_no=?" ;

        PreparedStatement prt=com.prepareStatement(q);

        prt.setString(1,car_no);
            prt.setInt(1,policy_no);
            prt.executeUpdate();
            flag=true;
        }
        catch(Exception e){
        e.printStackTrace();
        }
        return flag;
        }


    public static boolean deleteDriver(int licence_no){
           boolean flag=false;
        try{
        Connection com=ConnectionToDB.createConnection();

        String q="delete from driver where licence_no=?" ;

        PreparedStatement prt=com.prepareStatement(q);

        prt.setInt(1,licence_no);
            prt.executeUpdate();
        flag=true;
        }
        catch(Exception e){
        e.printStackTrace();
        }
        return flag;
        }
    public static boolean deleteOwn(String car_no){
                     boolean flag=false;
        try{
            Connection com=ConnectionToDB.createConnection();

            String q="delete from own where car_no=?" ;

            PreparedStatement prt=com.prepareStatement(q);

            prt.setString(1,car_no);
            prt.executeUpdate();
            flag=true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

}

