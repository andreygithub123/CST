package cts.diaconu.andrei1103.factory;

import java.util.List;

public class TheatreShow implements IShow {
    private String name;
    private String location;
    private String dateTime;
    private String regizor;
    private List<String> actors;

    public TheatreShow(){}
    public TheatreShow(String name, String location, String dateTime, String regizor, List<String> actors) {
        this.name = name;
        this.location = location;
        this.dateTime = dateTime;
        this.regizor = regizor;
        this.actors = actors;
    }

    @Override
    public void printDetails() {
        System.out.println("TheatreShow{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", regizor='" + regizor + '\'' +
                ", actors=" + actors +
                '}');
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public String getDateTime() {
        return this.dateTime;
    }
}
