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

}
