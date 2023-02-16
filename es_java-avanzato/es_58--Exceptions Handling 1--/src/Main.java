public class Main {
// non riesco a far partire il codice throw new ArithmeticException("Score is out of scale!"), non ho capito se la consegna voglia che stampi in rosso quindi dicendomi che c'è questa eccezzione o se lo vuole stampato in bianco ; il codice gira se uso il metodo try and catch messo in commento

    public static void main(String[] args)throws ArithmeticException {
    /*
        try {
            new checkScore(2.15);
            new checkScore(50.0);
            new checkScore(95.02);
            new checkScore(100.01);
        } catch (Exception e) {
            System.out.println("Score is out of scale!");
        }
    }*/
        new checkScore(2.15);
        new checkScore(50.0);
        new checkScore(95.02);
        new checkScore(100.01);
    }
}