public class RectangleRunner {
    public static void main(String[] args){
        Rectangle myRectangle=new Rectangle(10,20);
        System.out.println("This rectangle has an area of "+myRectangle.calculateArea()+" and a volume of "+myRectangle.calculateBoxVolume(25));
    }
}
