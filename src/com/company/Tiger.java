package com.company;

public class Tiger extends Animal{
    public String name;

    Tiger() {
        this.name = "";
    }

    Tiger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
