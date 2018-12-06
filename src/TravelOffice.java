

public class TravelOffice {

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
        System.out.println(travelOffice.getCustomerCount());
        System.out.println(travelOffice.getInfo());
       

    }

    Customer[] customerTable;

    static int customerCount;


    public TravelOffice() {
        customerTable = new Customer[2];

    }

    public void addCustomer(Customer customer) {
        customerCount++;
        if (customerCount > customerTable.length) {
            Customer[] customerNewTable = new Customer[customerTable.length+1];
            System.arraycopy(customerTable, 0, customerNewTable, 0, customerTable.length);
           customerTable = customerNewTable.clone();
           customerTable[customerCount-1] = customer;
        } else {
            customerTable[customerCount - 1] = customer;
        }

    }

    public int getCustomerCount() {
        return customerCount;
    }

    public String getInfo() {
        int count = 1;
        String info = "Total clients [" + customerCount + "]\n\tClient list: ";
        for (Customer customer : customerTable) {
            info += "\n\nClient number [" + count + "]\n\n"+customer.getInfo();
            ++count;

        }
        return info;
    }
}





