package com.netzme.netzme.dtos.responses;

public class PersonResponse {
    private String gender;
    private String fullname;
    private String address;
    private String picture;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonResponse that)) return false;

        if (getGender() != null ? !getGender().equals(that.getGender()) : that.getGender() != null) return false;
        if (getFullname() != null ? !getFullname().equals(that.getFullname()) : that.getFullname() != null)
            return false;
        if (getAddress() != null ? !getAddress().equals(that.getAddress()) : that.getAddress() != null) return false;
        return getPicture() != null ? getPicture().equals(that.getPicture()) : that.getPicture() == null;
    }

    @Override
    public int hashCode() {
        int result = getGender() != null ? getGender().hashCode() : 0;
        result = 31 * result + (getFullname() != null ? getFullname().hashCode() : 0);
        result = 31 * result + (getAddress() != null ? getAddress().hashCode() : 0);
        result = 31 * result + (getPicture() != null ? getPicture().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PersonResponse{" +
                "gender='" + gender + '\'' +
                ", fullname='" + fullname + '\'' +
                ", address='" + address + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }
}
