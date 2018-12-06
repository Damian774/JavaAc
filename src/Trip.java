public class Trip {
    private Date start;
    private Date end;
    private String destination;

    public Trip(Date start,Date end,String destination){
        this.start = start;
        this.end = end;
        this.destination=destination;
    }

    public String getInfo(){
        return "start: "+start.getInfo()+" end: "+end.getInfo()+" destination: "+destination;
    }
}
