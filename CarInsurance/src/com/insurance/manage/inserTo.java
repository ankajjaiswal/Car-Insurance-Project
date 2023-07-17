package com.insurance.manage;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class inserTo {

    //Insert into Car
    public static boolean intoCar(car c){
        boolean f = false;
        try{
            Connection com=ConnectionToDB.createConnection();

            String q="insert into car(car_no,chassis_no,engine_no,car_make,model,model_year,purchase_price)" +
                    " values(?,?,?,?,?,?,?)";

            PreparedStatement prt=com.prepareStatement(q);

            prt.setString(1,c.getCar_no());
            prt.setInt(2,c.getChassis_no());
            prt.setInt(3,c.getEngine_no());
            prt.setString(4, c.getCar_made());
            prt.setString(5, c.getModel());
            prt.setInt(6,c.getModel_year());
            prt.setInt(7,c.getPurchase_price());

            prt.executeUpdate();
            f=true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }


    //Insert into Person
    public static boolean intoPerson(person p){
        boolean f=false;
        try{
            Connection com=ConnectionToDB.createConnection();

            String q="insert into person(person_name,dob,age,house_no,locality,city,pin) " +
                    "values(?,?,timestampdiff(year,?,curdate()),?,?,?,?)";

            PreparedStatement prt=com.prepareStatement(q);

            prt.setString(1,p.getPerson_name());
            prt.setString(2,p.getDob());
            prt.setString(3,p.getDob());
            prt.setString(4, p.getHouse_no());
            prt.setString(5, p.getLocality());
            prt.setString(6,p.getCity());
            prt.setInt(7,p.getPin());

            prt.executeUpdate();
            f=true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }

    public static boolean updatePerson(person p){
        boolean f=false;
        try{
            Connection com=ConnectionToDB.createConnection();

            String q="update person set person_name =?, dob = ?,age=timestampdiff(year,?,curdate())," +
                    "house_no=?, locality=?, city=?, pin=? " +
                    "where person_id = ?;";

            PreparedStatement prt=com.prepareStatement(q);

            prt.setString(1,p.getPerson_name());
            prt.setString(2,p.getDob());
            prt.setString(3,p.getDob());
            prt.setString(4, p.getHouse_no());
            prt.setString(5, p.getLocality());
            prt.setString(6,p.getCity());
            prt.setInt(7,p.getPin());
            prt.setInt(8,p.getPerson_id());

            prt.executeUpdate();
            f=true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }

}
