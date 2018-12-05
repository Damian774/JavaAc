

public class TravelOffice {

    public static void main(String[] args) {

        TravelOffice travelOffice = new TravelOffice();
        Address address = new Address("STREET_NAME", "00-000", "CITY_NAME");
        Customer customer = new Customer("CUSTOMER_NAME");
        customer.setAddress(address);
        Trip trip = new Trip(new Date(2018, 12, 15), new Date(2019, 1, 14), "TRIP_DESTINATION");

        customer.assignTrip(trip);

        travelOffice.addCustomer(customer);

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
           for(int i=0;i<customerTable.length;i++){
               customerNewTable[i] = customerTable[i];
           }
            customerTable = new Customer[customerNewTable.length];
           customerTable = customerNewTable.clone();
        } else {
            customerTable[customerCount - 1] = customer;
        }

    }

    public int getCustomerCount() {
        return customerCount;
    }

    public String getInfo() {
        String info = "Total clients [" + customerCount + "]\n\tClient list: \n\n";
        for (Customer customer : customerTable) {
            info += "Client number [" + customerCount + "]\n\n";
            customer.getInfo();
        }
        return info;
    }
}





