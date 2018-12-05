

public class TravelOffice {

    public static void main(String[] args) {

       Address address = new Address("STREET_NAME","00-000","CITY_NAME");
       Customer customer = new Customer("CUSTOMER_NAME");
       customer.setAddress(address);
       Trip trip = new Trip(new Date(2018,12,15),new Date(2019,1,14),"TRIP_DESTINATION");

       customer.assignTrip(trip);
       System.out.println(customer.getInfo());

    }

}





