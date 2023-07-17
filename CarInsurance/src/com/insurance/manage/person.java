package com.insurance.manage;
public class person {
    private int person_id;
    private String person_name;
    private String dob;
    private String house_no;
    private  String locality;
    private String city;
    private int pin;

    public int getPerson_id() {
        return person_id;
    }


    public person(int person_id, String person_name, String dob, String house_no, String locality, String city, int pin) {
        this.person_id = person_id;
        this.person_name = person_name;
        this.dob = dob;
        this.house_no = house_no;
        this.locality = locality;
        this.city = city;
        this.pin = pin;
    }

    public person(String person_name, String dob, String house_no,
                  String locality, String city, int pin) {
        this.person_name = person_name;
        this.dob=dob;
        this.house_no = house_no;
        this.locality = locality;
        this.city = city;
        this.pin = pin;
    }
    public String getPerson_name() {
        return person_name;
    }
    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getHouse_no() {
        return house_no;
    }
    public void setHouse_no(String house_no) {
        this.house_no = house_no;
    }
    public String getLocality() {
        return locality;
    }
    public void setLocality(String locality) {
        this.locality = locality;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getPin() {
        return pin;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
}
