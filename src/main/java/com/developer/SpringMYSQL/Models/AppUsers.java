package com.developer.SpringMYSQL.Models;

import javax.persistence.*;
import java.awt.*;

@Entity
@Table(name = "info")
public class AppUsers
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @Column(name = "name")
    public String name;
    @Column(name = "description")
    public String description;
    @Column(name = "symptoms")
    public String symptoms;
    @Column(name = "duration")
    public String duration;
    @Column(name = "mortalityrate")
    public String mortalityrate;
    @Column(name = "imageaddress")
    public String imageaddress;

/*    public AppUsers()
    {

    }

    public AppUsers(String name, String description, String symptoms, String duration, String mortalityrate, String imageaddress)
    {
        this.name = name;
        this.description = description;
        this.symptoms = symptoms;
        this.duration = duration;
        this.mortalityrate = mortalityrate;
        this.imageaddress = imageaddress;

    }*/

    public int getid()
    {
        return id;
    }

    public void setid(int id)
    {
        this.id = id;
    }

    public String getname()
    {
        return name;
    }

    public void setname(String name)
    {
        this.name = name;
    }

    public String getdescription()
    {
        return description;
    }

    public void setdescription(String description)
    {
        this.description = description;
    }

    public String getsymptoms()
    {
        return symptoms;
    }

    public void setsymptoms(String symptoms)
    {
        this.symptoms = symptoms;
    }

    public String getduration()
    {
        return duration;
    }

    public void setduration(String duration)
    {
        this.duration = duration;
    }

    public String getmortalityrate()
    {
        return mortalityrate;
    }

    public void setmortalityrate(String mortalityrate)
    {
        this.mortalityrate = mortalityrate;
    }

    public String getimageaddress()
    {
        return imageaddress;
    }

    public void setimageaddress(String imageaddress)
    {
        this.imageaddress = imageaddress;
    }
}
