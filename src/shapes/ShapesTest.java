package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        boolean yesNo = util.Input.yesNo();
        Rectangle box1 = new Rectangle(5,4);
        System.out.println(box1.getPerimeter());

        Rectangle box2 = new Square(5);
        System.out.println(box2.getPerimeter());
    }
//    public static void circleGenerator(){
//        boolean yesNo();
//        if(yesNo){
//
//        }
//    }
}
