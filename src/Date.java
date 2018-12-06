public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int year, int month,int day){
        this.day =day;
        this.month=month;
        this.year=year;
    }

    @Override
    public String toString() {
        return "year: "+year+" month: "+month+" day: "+day+"\n";
    }


}
