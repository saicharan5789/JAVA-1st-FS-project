package dev.charan.app;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "data")

public class AppItem {

    @Id
    private int id;
    private String name;
    private int age;

    public AppItem(String name , int age){
        this.name=name;
        this.age=age;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return this.name;
    }

    public void SetName( String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void SetAge( int age){
        this.age=age;
    }



    @Override
    public String toString(){
        return "{Id=" + id +"Name=" + name +"Age=" + age +" }";

    }
}
