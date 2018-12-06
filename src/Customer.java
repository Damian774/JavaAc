public class Customer {
    private String name;
    private Address address;

    @Override
    public String toString() {
        return "Client name: "+name+"\nClient Address: "+address.toString()+"\nTrip: "+trip.toString();
    }

    private Trip trip;


    public Customer(String name){
        this.name=name;
    }

    public void setAddress(Address address){
        this.address=address;
    }

    public void assignTrip(Trip trip){
        this.trip=trip;
    }


}
