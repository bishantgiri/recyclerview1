package model;

public class Contacts {
    private String name;
    private String phoneNo;
    private int imageId;
    private String emailId;
    private String address;


    public Contacts(String name, String phoneNo, int imageId, String emailId, String address) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.imageId = imageId;
        this.emailId = emailId;
        this.address = address;
    }

    public String getName() {
        return name; 
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
