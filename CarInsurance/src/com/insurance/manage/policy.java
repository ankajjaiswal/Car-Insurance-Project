package com.insurance.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class policy {
    public static boolean craetePolicy(int emi, String car_no, int person_id) {
        boolean flag = false;
        try {
            Connection com = ConnectionToDB.createConnection();

            String q = "insert into policy(policy_date,emi,valid_till,car_no,person_id) " +
                    "values(curdate(),?,date_add(curdate(),interval 1 year),?,?);";

            PreparedStatement prt = com.prepareStatement(q);

            prt.setInt(1, emi);
            prt.setString(2, car_no);
            prt.setInt(3, person_id);

            prt.executeUpdate();
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    public static boolean renewPolicy(int policy_no, int emi) {
        boolean flag = false;
        try {
            Connection com = ConnectionToDB.createConnection();

            String q = "insert into policy(policy_date,emi,valid_till,car_no,person_id) " +
                    "values(curdate(),?,adddate(year,1,curdate()),(select car_no from policy where policy_no=?)," +
                    "(select person_id from policy where policy_no=?);";

            PreparedStatement prt = com.prepareStatement(q);

            prt.setInt(1, emi);
            prt.setInt(2, policy_no);
            prt.setInt(3, policy_no);

            prt.executeUpdate();
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
}
