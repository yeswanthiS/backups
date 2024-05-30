public class methods{
    public static int sum(int a , int b)
    {
        return a+b;
    }
    public int product(int a, int b)
    {
        return a*b;
    }
    public static void main(String[] args)
    {
        int a =5;
        int b=6;
        System.out.println("Result:" + sum(a,b));

        methods obj = new methods();
        System.out.println("result:" + obj.product(a,b));
    }
}