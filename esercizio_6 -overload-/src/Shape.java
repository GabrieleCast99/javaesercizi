public class Shape {
    public String shapeName;
    public int numberOfEdges;



    public Shape() {
        System.out.println("----");
        System.out.println("You have created a new undefined Shape");
        this.shapeName= " Undefined shape";
    }

    public Shape(double radius) {
        System.out.println("----");
        System.out.println("You have created a new circle with Radius "+radius);
        this.shapeName= "circle";
    }

    public Shape(int edges, double edgeLength ) {
        System.out.println("----");
        System.out.println("You have created a new square with edges and edgeLength "+edgeLength);
        this.shapeName= "square";
        this.numberOfEdges=edges;
    }

    public Shape(int edges, double e1, double e2 ) {
        System.out.println("----");
        System.out.println("You have created a new rectangle with edges e1=" + e1 + " and e2=" + e2);
        this.shapeName= "rectangle";
        this.numberOfEdges = edges;
    }


    public Shape(int edges, double e1, double e2,double e3 ) {
        System.out.println("----");
        System.out.println("You have created a new triangle with edges lengths: "+e1+" "+e2+"and "+e3 );
        this.shapeName= "triangle";
        this.numberOfEdges = edges;
    }

   public String  getShapeDetails(){

       return "ShapeName = "+this.shapeName+"numberOfEdges = "+this.numberOfEdges;
   }
}
