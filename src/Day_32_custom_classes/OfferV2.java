package Day_32_custom_classes;

public class OfferV2 {
    // location, company, salary, is full time, number of PTO
    String location;
    String company;
    double salary;
    boolean isFullTime;
    int numberOfPTO;
    // create a constructor that creates an Offer object with the company and location
    public OfferV2(String company, String location) {
        this.company = company;
        this.location = location;
    }
    // create a constructor that creates an Offer object with the company, location, and salary
    public OfferV2(String company, String location, double salary) {
        this.company = company;
        this.location = location;
        this.salary = salary;
    }
    // create a constructor that creates an Offer object with the company, location, salary, isfull time, and number of PTO
    public OfferV2(String company, String location, double salary, boolean isFullTime, int numberOfPTO) {
        this.company = company;
        this.location = location;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;
    }

    @Override
    public String toString() {
        return "Offer: " +
                "\n\tCompany: " + company +
                "\n\tLocation: " + location +
                "\n\tSalary: " + salary + "$" +
                "\n\tFull Time: " + isFullTime +
                "\n\tNumber of Paid Time Off: " + numberOfPTO;

    }
}
