package com.dicoding.javafundamental.collection;

class Planet    {
    private String name;
    private double mass;

    public Planet(String name, doubke mass){
        this.name = name;
        this.mass = mass;
    }

    @Override
    public String toString(){
        return "Planet " + name + ", mass: " + mass;
    }
}