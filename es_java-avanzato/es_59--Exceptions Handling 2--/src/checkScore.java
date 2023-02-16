

public class checkScore {
        double dividend;
        double divisor;


        public checkScore(double dividend,double divisor) throws ArithmeticException {
            if (dividend > 0.0 && divisor > 0.0) {
                System.out.println("The quotient is: "+ (dividend/divisor));
            }else{
                if(divisor==0){
                    throw new ArithmeticException("is not possible to divide by zero");
                }
            }


        }


}
