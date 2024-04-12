package cts.diaconu.andrei1103.factory;

import java.util.List;

public class StandupShow implements IShow{
    private String name;
    private String location;
    private String dateTime;
    private String language;
    private List<String> comedians;

     StandupShow(){};

    public StandupShow(String name, String location, String dateTime, String language, List<String> comedians) {
        this.name = name;
        this.location = location;
        this.dateTime = dateTime;
        this.language = language;
        this.comedians = comedians;
    }

    @Override
    public void printDetails() {
        System.out.println("StandupShow{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", language='" + language + '\'' +
                ", comedians=" + comedians +
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
