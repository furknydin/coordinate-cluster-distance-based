import distance_level_based.entity.Cluster;
import distance_level_based.entity.Coordinate;
import distance_level_based.manager.ClusterManager;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClusterManager manager = new ClusterManager(0.1);


        manager.addCoordinate(new Coordinate(51.505, -0.09,"Ahmet Yılmaz","01-02-2025 14:25"));
        manager.addCoordinate(new Coordinate(51.505, -0.09,"Mehmet Kaya","01-02-2025 09:15"));
        manager.addCoordinate(new Coordinate(51.505, -0.09, "Fatma Demir", "01-02-2025 11:30"));
        manager.addCoordinate(new Coordinate(51.505, -0.09, "Ali Çelik", "01-02-2025 16:45"));
        manager.addCoordinate(new Coordinate(51.505, -0.09, "Zeynep Şahin", "01-02-2025 13:20"));
        manager.addCoordinate(new Coordinate(51.505, -0.09, "Mustafa Özdemir", "01-02-2025 10:05"));
        manager.addCoordinate(new Coordinate(51.505, -0.09, "Ayşe Arslan", "01-02-2025 15:40"));
        manager.addCoordinate(new Coordinate(51.505, -0.09, "Hüseyin Doğan", "01-02-2025 12:55"));
        manager.addCoordinate(new Coordinate(51.505, -0.09, "Emine Aydın", "01-02-2025 08:30"));
        manager.addCoordinate(new Coordinate(51.505, -0.09, "İbrahim Yıldız", "01-02-2025 17:15"));
        manager.addCoordinate(new Coordinate(51.505, -0.09, "Hatice Özkan", "01-02-2025 14:50"));
        manager.addCoordinate(new Coordinate(51.505, -0.09, "Yusuf Koç", "01-02-2025 11:25"));
        manager.addCoordinate(new Coordinate(51.505, -0.09, "Merve Şen", "01-02-2025 09:40"));
        manager.addCoordinate(new Coordinate(51.515, -0.1, "Can Erdoğan", "01-02-2025 16:10"));
        manager.addCoordinate(new Coordinate(51.512, -0.084, "Selin Kurt", "01-02-2025 13:35"));
        manager.addCoordinate(new Coordinate(51.508, -0.087, "Burak Çetin", "01-02-2025 10:20"));
        manager.addCoordinate(new Coordinate(51.513, -0.092, "Esra Aslan", "01-02-2025 15:45"));
        manager.addCoordinate(new Coordinate(51.509, -0.095, "Emre Yavuz", "01-02-2025 12:15"));
        manager.addCoordinate(new Coordinate(51.511, -0.088, "Elif Öztürk", "01-02-2025 08:50"));
        manager.addCoordinate(new Coordinate(51.507, -0.091, "Ömer Kılıç", "01-02-2025 17:30"));
        manager.addCoordinate(new Coordinate(51.514, -0.086, "Ayşe Demir", "01-02-2025 14:05"));
        manager.addCoordinate(new Coordinate(51.506, -0.093, "Mehmet Arslan", "01-02-2025 11:40"));
        manager.addCoordinate(new Coordinate(51.510, -0.089, "Fatma Yıldız", "01-02-2025 09:25"));
        manager.addCoordinate(new Coordinate(51.515, -0.085, "Ali Özkan", "01-02-2025 16:50"));
        manager.addCoordinate(new Coordinate(51.508, -0.094, "Zeynep Koç", "01-02-2025 13:15"));
        manager.addCoordinate(new Coordinate(51.512, -0.087, "Mustafa Şen", "01-02-2025 10:30"));
        manager.addCoordinate(new Coordinate(51.509, -0.092, "Ayşe Erdoğan", "01-02-2025 15:55"));
        manager.addCoordinate(new Coordinate(51.513, -0.088, "Hüseyin Kurt", "01-02-2025 12:40"));
        manager.addCoordinate(new Coordinate(51.507, -0.095, "Emine Çetin", "01-02-2025 08:15"));
        manager.addCoordinate(new Coordinate(51.511, -0.086, "İbrahim Aslan", "01-02-2025 17:40"));

        List<Cluster> clusters = manager.getClusters();
        for (Cluster c : clusters) {
            System.out.println(c);
        }
    }
}