package com.wang.entity;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/5/4 0004.
 */
public class Person {
    private String name;
    private int age;
    private List<String> favorites;
    public Person(){}
    public Person(String name){
        this.name=name;
    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public Person(String name,int age,List<String> favorites){
        this.name=name;
        this.age=age;
        this.favorites=favorites;
    }
    private Map<Integer,String> friends;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public List<String>getFavorites() {
        return favorites;
    }
    public void setFavorites(List<String>favorites) {
        this.favorites = favorites;
    }
    public Map<Integer, String>getFriends() {
        return friends;
    }
    public void setFriends(Map<Integer, String>friends) {
        this.friends = friends;
    }
}
