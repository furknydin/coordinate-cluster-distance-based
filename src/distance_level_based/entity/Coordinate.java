package zoom_level_based.entity;

public class Coordinate {
    private double lat;
    private double lon;
    private String name;
    private String date;

    public Coordinate(double lat, double lon, String name, String date) {
        this.lat = lat;
        this.lon = lon;
        this.name = name;
        this.date = date;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }
}
