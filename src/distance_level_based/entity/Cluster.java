package zoom_level_based.entity;

import java.util.ArrayList;
import java.util.List;

public class Cluster {
    private double lat;
    private double lon;
    private List<Coordinate> coordinates =  new ArrayList<>();

    public Cluster(Coordinate coordinate) {
        this.lat = coordinate.getLat();
        this.lon = coordinate.getLon();
        this.coordinates.add(coordinate);
    }

    public void addCoordinate(Coordinate coordinate) {
        this.coordinates.add(coordinate);
        updateCenter();
    }

    private void updateCenter() {
        double sumLat = 0, sumLon = 0;
        for (Coordinate m : coordinates) {
            sumLat += m.getLat();
            sumLon += m.getLon();
        }
        this.lat = sumLat / coordinates.size();
        this.lon = sumLon / coordinates.size();
    }

    public int getSize() {
        return coordinates.size();
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public List<Coordinate> getCoordinates() {
        return coordinates;
    }
}
