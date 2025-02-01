package zoom_level_based.manager;

import zoom_level_based.entity.Cluster;
import zoom_level_based.entity.Coordinate;
import zoom_level_based.util.DistanceUtils;

import java.util.ArrayList;
import java.util.List;

public class ClusterManager {
    private final double clusterRadiusKm;
    private final List<Cluster> clusters = new ArrayList<>();

    public ClusterManager(double radius) {
        this.clusterRadiusKm = radius;
    }


    public void addCoordinate(Coordinate coordinate) {
        for (Cluster cluster : clusters) {
            if (DistanceUtils.haversineDistance(cluster.getLat(), cluster.getLon(), coordinate.getLat(), coordinate.getLon()) <= this.clusterRadiusKm) {
                cluster.addCoordinate(coordinate);
                return;
            }
        }
        clusters.add(new Cluster(coordinate));
    }

    public List<Cluster> getClusters() {
        return clusters;
    }
}
