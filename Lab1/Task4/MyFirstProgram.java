import myfirstpackage.*;

class MyFirstClass{
    public static void main(String [] s){
        MySecondClass Object = new MySecondClass(2,3);
        System.out.println(Object.Plus());
        for(int i = 1;i<=8;i++){
            for(int j = 1; j<= 8;j++){
                Object.setA(i);
                Object.setB(j);
                System.out.print(Object.Plus());
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}