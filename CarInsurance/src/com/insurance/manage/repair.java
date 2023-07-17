package com.insurance.manage;
public class repair {
    private int repair_id;
    private int repair_amount;
    private String workshop_name;
    private int wsp_bill_no;
    private String claim_date;
    public repair(int repair_id, int repair_amount,
                  String workshop_name, int wsp_bill_no, String claim_date) {
        this.repair_id = repair_id;
        this.repair_amount = repair_amount;
        this.workshop_name = workshop_name;
        this.wsp_bill_no = wsp_bill_no;
        this.claim_date = claim_date;
    }
    public int getRepair_id() {
        return repair_id;
    }
    public void setRepair_id(int repair_id) {
        this.repair_id = repair_id;
    }
    public int getRepair_amount() {
        return repair_amount;
    }
    public void setRepair_amount(int repair_amount) {
        this.repair_amount = repair_amount;
    }
    public String getWorkshop_name() {
        return workshop_name;
    }
    public void setWorkshop_name(String workshop_name) {
        this.workshop_name = workshop_name;
    }
    public int getWsp_bill_no() {
        return wsp_bill_no;
    }
    public void setWsp_bill_no(int wsp_bill_no) {
        this.wsp_bill_no = wsp_bill_no;
    }
    public String getClaim_date() {
        return claim_date;
    }
    public void setClaim_date(String claim_date) {
        this.claim_date = claim_date;
    }
}
