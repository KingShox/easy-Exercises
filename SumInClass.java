package SumAnB;
public class SumInClass {
    int a;
    int b;
  
    



    public SumInClass(){

    }




    public SumInClass(int a, int b) {
        this.a = a;
        this.b = b;
    
    }




    public int getA() {
        return a;
    }




    public void setA(int a) {
        this.a = a;
    }




    public int getB() {
        return b;
    }




    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "SumInClass [a=" + a + ", b=" + b + ", sum=" +(a+b)+ "]";
    }

    


    


   



}
