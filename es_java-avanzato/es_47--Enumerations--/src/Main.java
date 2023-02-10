public class Main {
    public static void main(String[] args) {
        Month[] x = Month.values();
        int y = x.length;

        for(int z=0; z<y ; ++z){
            Month month= x[z];
            System.out.println(" "+month+(month.toString().endsWith("y")?" ends ": " don't ends " )+" with Y ");
        }
    }
}