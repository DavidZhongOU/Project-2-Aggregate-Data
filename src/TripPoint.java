import java.util.ArrayList;


/**
 * 
 * TripPoint
 */
public class TripPoint {
    private double lat;
    private double lon;
    private int time;
    private ArrayList<TripPoint> trip;


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
     * Returns the trip
     * 
     * @return
     */
    public ArrayList<TripPoint> getTrip() {
        return trip;
    }

}
