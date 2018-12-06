package rodzic;

import rodzic.Rodzic;

public class Dziecko extends Rodzic {
    static{
        System.out.println("static dziecko");
    }
    {
        System.out.println("blok dziecko");
    }
    void go(){
        
    }
    public Dziecko(){
        System.out.println("dziecko konstruktor");
    }
}
