public class Main {
    public static void main(String[] args){

    Shape shape1 = new Shape();
        String ShapeDetails = shape1.getShapeDetails();
        System.out.println(ShapeDetails);

    Shape shape2 = new Shape(10);
        String Shape2Details = shape2.getShapeDetails();
        System.out.println(Shape2Details);

    Shape shape3 = new Shape(4,4);
        String Shape3Details = shape3.getShapeDetails();
        System.out.println(Shape3Details);


    Shape shape4 = new Shape(4,3,5);
        String Shape4Details = shape4.getShapeDetails();
        System.out.println(Shape4Details);


    Shape shape5 = new Shape(3,2,2,2);
        String Shape5Details = shape5.getShapeDetails();
        System.out.println(Shape5Details);

    }

}