package co.com.choucair.certification.mercurytours.model;

public class FlightDetails {
    private String type;
    private int passengers;
    private String departing_from;
    private String departing_to;
    private String on_month;
    private String on_day;
    private String back_month;
    private String back_day;
    private int service_class;

    public String getType() {
        return type;
    }

    public int getPassengers() {
        return passengers;
    }

    public String getDeparting_from() {
        return departing_from;
    }

    public String getDeparting_to() {
        return departing_to;
    }

    public String getOn_month() {
        return on_month;
    }

    public String getOn_day() {
        return on_day;
    }

    public String getBack_month() {
        return back_month;
    }

    public String getBack_day() {
        return back_day;
    }

    public int getService_class() {
        return service_class;
    }

    public FlightDetails(String type, int passengers, String departing_from, String departing_to, String on_month, String on_day, String back_month, String back_day, int service_class) {
        this.type = type;
        this.passengers = passengers;
        this.departing_from = departing_from;
        this.departing_to = departing_to;
        this.on_month = on_month;
        this.on_day = on_day;
        this.back_month = back_month;
        this.back_day = back_day;
        this.service_class = service_class;
    }
}
