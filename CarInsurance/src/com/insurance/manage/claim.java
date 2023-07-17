package com.insurance.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class claim {
   public static boolean claimPolicy(int policy_no, int repair_id){
       boolean flag = false;
       try {
           Connection com = ConnectionToDB.createConnection();

           String q = "insert into claim(repair_id,policy_no,claim_date) values (?,? ,curdate());";
           PreparedStatement prt = com.prepareStatement(q);
           prt.setInt(1, repair_id);
           prt.setInt (2, policy_no);

           prt.executeUpdate();
           flag = true;
       } catch (Exception e) {
           e.printStackTrace();
       }
       return flag;
   }
   }
