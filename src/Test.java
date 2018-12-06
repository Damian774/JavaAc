public class Test {

    public static void main(String[] args) {

        TravelOffice travelOffice = new TravelOffice();
        Address address = new Address("STREET_NAME", "00-000", "CITY_NAME");
        Customer customer = new Customer("CUSTOMER_NAME");
        customer.setAddress(address);
        Trip trip = new Trip(new Date(2018, 12, 15), new Date(2019, 1, 14), "TRIP_DESTINATION");

        customer.assignTrip(trip);

        travelOffice.addCustomer(customer);
        travelOffice.addCustomer(customer);
        travelOffice.addCustomer(customer);
        travelOffice.addCustomer(customer);
        travelOffice.addCustomer(customer);
        System.out.println(travelOffice.getCustomerCount());
        System.out.println(travelOffice.getInfo());


    }
}
