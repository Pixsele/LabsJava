package myfirstpackage;

public class MySecondClass{
    private int a,b;

    public MySecondClass(int temp_a, int temp_b){
        a = temp_a;
        b = temp_b;
    }

    public int getA(){
        return a;
    }
    
    public int getB(){
        return b;
    }

    public void setA(int temp){
        a = temp;
    }

    public void setB(int temp){
        b = temp;
    }

    public int Plus(){
        return a+b;
    }

}