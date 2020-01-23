package co.com.choucair.certification.mercurytours.model;

public class Passanger {

    private String name;
    private String lastName;
    private String meal;
    private String userName;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String country;
    private String password;
    private String mail;
    private Long cardNumber;
    private Integer phone;
    private Integer postalCode;

    public Passanger() {
        //Default constructor
    }

    public String getMail() {
        return mail;
    }

    public String getUserName() {
        return userName;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getPassword() {
        return password;
    }

    public Integer getPhone() {
        return phone;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public Long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }
}
