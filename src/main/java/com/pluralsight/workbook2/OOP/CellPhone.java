package com.pluralsight.workbook2.OOP;

public class CellPhone {
    private long serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    public CellPhone(long serialNumber, String model, String carrier, String phoneNumber, String owner) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void dial(String phoneParameter) {
        System.out.printf("%s's phone is calling %s\n", owner, phoneParameter);
    }

    public void dial(String phoneParameter, String calleeName) {
        System.out.printf("%s's phone is calling %s which belongs to %s\n", owner, phoneParameter, calleeName);
    }

    public void dial(CellPhone phoneParameter) {
        System.out.printf("%s's phone is calling %s\n", owner, phoneParameter.getOwner());
    }
}
