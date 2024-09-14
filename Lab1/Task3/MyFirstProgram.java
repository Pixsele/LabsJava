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


class MySecondClass{
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