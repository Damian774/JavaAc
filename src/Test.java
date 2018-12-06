public class Test {

    public static void main(String[] args) {

        TravelOffice travelOffice = new TravelOffice();

        Address address = new Address("STREET_NAME", "00-000", "CITY_NAME");
        Customer customer1 = new Customer("CUSTOMER1_NAME");
        Customer customer2 = new Customer("CUSTOMER2_NAME");

        customer1.setAddress(address);
        customer2.setAddress(address);

        Date d = Date.createDate("2016:10:30",":");

        DomesticTrip domeseticTrip = new DomesticTrip(Date.createDate("2016-12-21","-"),new Date(2018, 12, 15), "DOMESTIC_TRIP_DESTINATION",1000,200);
        AbroadTrip abroadTrip = new AbroadTrip(new Date(2018, 12, 15), new Date(2019, 1, 14), "ABROAD_TRIP_DESTINATION",1000,100);

        customer1.assignTrip(domeseticTrip);
        customer2.assignTrip(abroadTrip);

        travelOffice.addCustomer(customer1);
        travelOffice.addCustomer(customer2);

        System.out.println(travelOffice);

    }
}
