package com.bekzhankaspakov.myfirstapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Property {
    public @javax.persistence.Id @GeneratedValue Long id;
    public int SellRent;
    public String Name;
    public String PType;
    public int BHK;
    public String FType;
    public int Price;
    public int BuiltArea;
    public int CarpetArea;
    public String Address;
    public String Address2;
    public String City;
    public String FloorNo;
    public String TotalFloor;
    public String RTM;
    public String AOP;
    public String MainEntrance;
    public int Security;
    public int Gated;
    public int Maintenance;
    public String Possession;
    public String Image;
    public String Description;
    public String PostedOn;
    public int PostedBy;

    public Property() {
    }

    public Property(int sellRent, String name, String PType, int BHK, String FType, int price, int builtArea, int carpetArea, String address, String address2, String city, String floorNo, String totalFloor, String RTM, String AOP, String mainEntrance, int security, int gated, int maintenance, String possession, String image, String description, String postedOn, int postedBy) {
        SellRent = sellRent;
        Name = name;
        this.PType = PType;
        this.BHK = BHK;
        this.FType = FType;
        Price = price;
        BuiltArea = builtArea;
        CarpetArea = carpetArea;
        Address = address;
        Address2 = address2;
        City = city;
        FloorNo = floorNo;
        TotalFloor = totalFloor;
        this.RTM = RTM;
        this.AOP = AOP;
        MainEntrance = mainEntrance;
        Security = security;
        Gated = gated;
        Maintenance = maintenance;
        Possession = possession;
        Image = image;
        Description = description;
        PostedOn = postedOn;
        PostedBy = postedBy;
    }
}
