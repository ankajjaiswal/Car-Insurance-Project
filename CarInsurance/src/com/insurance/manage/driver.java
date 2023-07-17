package com.insurance.manage;
public class driver {
    private int person_id;
    private int licence_no;
    public driver(int person_id, int licence_no) {
        this.person_id = person_id;
        this.licence_no = licence_no;
    }
    public int getPerson_id() {
        return person_id;
    }
    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }
    public int getLicence_no() {
        return licence_no;
    }
    public void setLicence_no(int licence_no) {
        this.licence_no = licence_no;
    }
}
