public class checkScore {

    public checkScore(double score) throws ArithmeticException {
         if (score > 0.0 && score <= 50.0) {
             System.out.println("Average score");
         } else if(score> 50.0 && score<=100.0){
             System.out.println("Very good score");
         }else{
            if(score < 0.0 || score > 100.0){
             throw new ArithmeticException("Score is out of scale!");
           }
         }


     }
}
