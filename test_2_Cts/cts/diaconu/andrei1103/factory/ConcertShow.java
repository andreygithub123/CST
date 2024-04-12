package cts.diaconu.andrei1103.factory;

import java.util.List;

public class ConcertShow implements IShow{
    private String name;
    private String location;
    private String dateTime;
    private String type;
    private List<String> artists;

    public ConcertShow(){};
    public ConcertShow(String name, String location, String dateTime, String type, List<String> artists) {
        this.name = name;
        this.location = location;
        this.dateTime = dateTime;
        this.type = type;
        this.artists = artists;
    }

    @Override
    public void printDetails() {
        System.out.println("ConcertShow{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", type='" + type + '\'' +
                ", artists=" + artists +
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
