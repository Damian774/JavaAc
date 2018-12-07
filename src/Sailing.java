public interface Sailing {
    default void dock(){
        System.out.println("<"+this.getClass().getName()+"> arrived to port");
    }

}
