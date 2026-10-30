import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;


/**
 * The class TripPoint finds the total distance traveled during
 * the trip or the average speed from the triplog.csv file.
 *  
 * TripPoint
 */
public class TripPoint {
    private double lat;
    private double lon;
    private int time;
    private static ArrayList<TripPoint> trip;


    /**
     * The constructor tnitializes the class fields time, lat, and lon.
     * 
     * @param time
     * @param lat
     * @param lon
     */
    public TripPoint(int time, double lat, double lon) {
        this.time = time;
        this.lat = lat;
        this.lon = lon;
    }

    /**
     * Returns the time
     * 
     * @return
     */
    public int getTime() {
        return time;
    }

    /**
     * Returns the lat
     * 
     * @return
     */
    public double getLat() {
        return lat;
    }

    /**
     * Returns the lon
     * 
     * @return
     */
    public double getLon() {
        return lon;
    }

    /**
     * Returns a copy of trip ArrayList
     * 
     * @return
     */
    public static ArrayList<TripPoint> getTrip() {
        return new ArrayList<>(trip);
    }

    /**
     * 
     * @param a
     * @param b
     * @return
     */
    public static double haversineDistance(TripPoint a, TripPoint b) {
        
    }


    /**
     * 
     * @param filename
     */
    public static void readFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            while (reader.ready()) {
                String currentLine = reader.readLine();
                if (currentLine.matches("[^0-9.,-]")) { continue; }

                String lineSplit[] = currentLine.split(",");
                trip.add(new TripPoint(Integer.parseInt(lineSplit[0]), Double.parseDouble(lineSplit[1]), Double.parseDouble(lineSplit[2])));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
