package com.insurance.manage;
public class car {
    private String car_no;
    private int chassis_no;
    private int engine_no;
    private String car_made;
    private String model;
    private int model_year;
    private  int purchase_price;
    public car(String car_no, int chassis_no, int engine_no,
               String car_made, String model, int model_year, int purchase_price) {
        this.car_no = car_no;
        this.chassis_no = chassis_no;
        this.engine_no = engine_no;
        this.car_made = car_made;
        this.model = model;
        this.model_year = model_year;
        this.purchase_price = purchase_price;
    }

    public String getCar_no() {
        return car_no;
    }
    public void setCar_no(String car_no) {
        this.car_no = car_no;
    }
    public int getEngine_no() {
        return engine_no;
    }
    public void setEngine_no(int engine_no) {
        this.engine_no = engine_no;
    }
    public String getCar_made() {
        return car_made;
    }
    public void setCar_made(String car_made) {
        this.car_made = car_made;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getModel_year() {
        return model_year;
    }
    public void setModel_year(int model_year) {
        this.model_year = model_year;
    }
    public int getPurchase_price() {
        return purchase_price;
    }
    public void setPurchase_price(int purchase_price) {
        this.purchase_price = purchase_price;
    }

    public int getChassis_no() {
        return chassis_no;
    }

    public void setChassis_no(int chassis_no) {
        this.chassis_no = chassis_no;
    }
}
