public class Date {
    int day;
    int month;
    int year;

    public Date(int year, int month,int day){
        this.day =day;
        this.month=month;
        this.year=year;

    }

    public void getInfo() {
        System.out.println("name: "+this.getClass().getName()+" year: "+year+" month: "+month+" day: "+day+"\n");
    }
}
