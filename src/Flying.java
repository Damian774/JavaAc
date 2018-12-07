public interface Flying {
 default void takeOff(){
     System.out.println("<"+this.getClass().getName()+"> taking off");

 }
default void land(){
    System.out.println("<"+this.getClass().getName()+"> landing");
}
 default void callAirControl(){
     System.out.println("<"+this.getClass().getName()+"> calling air control");

 }

}
