public class Address {
    private String street;
    private String zip;
    private String city;

    public Address(String street,String zip,String city){
        this.street = street;
        this.zip=zip;
        this.city=city;
    }

    public String getInfo(){
        return "Street: "+street+" zip: "+zip+" city: "+city;
    }

}
