

public class TravelOffice {


    @Override
    public String toString() {
        int count = 1;
        String info = "Total clients [" + customerCount + "]\n\tClient list: ";
        for (Customer customer : customerTable) {
            info += "\n\nClient number [" + count + "]\n\n"+customer.toString();
            ++count;

        }
        return info;
    }

    Customer[] customerTable;

    private static int customerCount;


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


}





