package co.com.choucair.certification.mercurytours.model;

public class FlightDetails {

    private String type;
    private Integer passengers;
    private String departingFrom;
    private String departingTo;
    private String onMonth;
    private String onDay;
    private String backMonth;
    private String backDay;
    private String serviceClass;
    private String airline;

    public String getAirline() {
        return airline;
    }

    public String getType() {
        return type;
    }

    public Integer getPassengers() {
        return passengers;
    }

    public String getDepartingFrom() {
        return departingFrom;
    }

    public String getDepartingTo() {
        return departingTo;
    }

    public String getOnMonth() {
        return onMonth;
    }

    public String getOnDay() {
        return onDay;
    }

    public String getBackMonth() {
        return backMonth;
    }

    public String getBackDay() {
        return backDay;
    }

    public String getServiceClass() {
        return serviceClass;
    }
}
