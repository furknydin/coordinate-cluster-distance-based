package distance_level_based.entity;

public class Coordinate {
    private final double lat;
    private final double lon;
    private final String name;
    private final String date;

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

    @Override
    public String toString() {
        return "Coordinate{" +
                "lat=" + lat +
                ", lon=" + lon +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
