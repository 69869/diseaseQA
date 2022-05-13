package com.example.diseaseqa.entity;

public class Feedback {
    public int id;
    public String remark;
    public String name;
    public String intro;
    public String symptom;
    public String cause;
    public String cure;
    public String medicine;
    public String department;

    public String getInfo(){
        return "remark,name,intro,symptom,cause,cure,medicine,department";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getCure() {
        return cure;
    }

    public void setCure(String cure) {
        this.cure = cure;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "id=" + id +
                ", remark='" + remark + '\'' +
                ", name='" + name + '\'' +
                ", intro='" + intro + '\'' +
                ", symptom='" + symptom + '\'' +
                ", cause='" + cause + '\'' +
                ", cure='" + cure + '\'' +
                ", medicine='" + medicine + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
