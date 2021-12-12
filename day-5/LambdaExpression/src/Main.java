interface Addition{
    int add(int a,int b);
}
interface Subtract{
    int sub(int a,int b);
}
interface Multiplication{
    int multiply(int a,int b);
}
class Main{
    public static void main(String[] args) {
        Addition addition=(int a,int b) ->{return (a+b);};
        Subtract subtract=(int a,int b) ->{return (a-b);};
        Multiplication multiplication=(int a,int b) ->{return (a*b);};
        System.out.print("Addition :  ");
        System.out.println(addition.add(10,20));
        System.out.print("Subtraction :  ");
        System.out.println(subtract.sub(20,10));
        System.out.print("Multiplication :  ");
        System.out.println(multiplication.multiply(10,10));


    }
}