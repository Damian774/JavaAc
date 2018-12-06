public class Customer {
    private String name;
    private Address address;
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

    public String getInfo(){
        return "Client name: "+name+"\nClient Address: "+address.getInfo()+"\nTrip: "+trip.getInfo();
    }
}
