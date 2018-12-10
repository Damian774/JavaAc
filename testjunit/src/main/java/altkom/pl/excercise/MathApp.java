package altkom.pl.excercise;

import service.MathService;


public class MathApp {



    public void setMath(MathService mathService) {
        this.mathService = mathService;
    }

    private MathService mathService;

    public int pomnozIDodaj(int a, int b,int c){
        MathService mathService = new MathService();
        int result = mathService.multiply(a, b);
        result+=c;
        return result;
    }
}