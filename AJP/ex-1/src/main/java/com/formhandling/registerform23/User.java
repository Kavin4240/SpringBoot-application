package com.formhandling.registerform23;
public class User {
    private String name;
    private String email;
    private String pwd;
    private String woodType;
    private String productType;
    private String amountRange;
    private String payment;
    private String comment;
    private String address;
    private String mobile_no;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getWoodType() {
        return woodType;
    }

    public void setWoodType(String woodType) {
        this.woodType = woodType;
    }
    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
    public String getAmountRange() {
        return amountRange;
    }

    public void setAmountRange(String amountRange) {
        this.amountRange = amountRange;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getComment() {
        return comment;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", email=" + email + ", pwd=" + pwd + ", woodType=" + woodType +", productType=" + productType +", amountRange=" + amountRange + ", payment=" + payment + ", comment=" + comment + 

                 ", mobile_no=" + mobile_no+ "]";
    }
}