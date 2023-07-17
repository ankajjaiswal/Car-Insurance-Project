package com.insurance.manage;
public class own {
    private int person_id;
    private String car_no;
    public int getPerson_id() {
        return person_id;
    }
    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }
    public String getCar_no() {
        return car_no;
    }
    public void setCar_no(String car_no) {
        this.car_no = car_no;
    }
    public own(int person_id, String car_no) {
        this.person_id = person_id;
        this.car_no = car_no;
    }
}
