package assignments.inheritece;

public class Test {
    public static void main(String args[]){
        Circle circle = new Circle(5);
        System.out.println("area of circle" + circle.area());
        Rectangle rectangle = new Rectangle(4,6);
        System.out.println("area of rectangle" + rectangle.area());
    }
    
}
