/**
 * This class represents the arithmetic operators
 * @author Gabriele
 */
public class ArithmeticOperators {
    /**
     * number 1
     */
    int num1;
    /**
     * number 2
     */
    int num2;

    /**
     * this Method stamp the summation between num1 and num2
     * @sumtot is the int summation between num1 and num2
     */
    public void sum(){
        int sumtot= num1+num2;
        System.out.println("The summation num1 and num2 turns out: " +sumtot);
    }
    /**
     * this Method stamp the subtraction between num1 and num2
     * @subtot is the int subtraction between num1 and num2
     */
    public void sub(){
        int subtot= num1-num2;
        System.out.println("The subtraction between num1 and num2 turns out: " +subtot);
    }
    /**
     * this Method stamp the multiplication between num1 and num2
     * @multot is the int multiplication between num1 and num2
     */
    public void mul(){
        int multot= num1*num2;
        System.out.println("The multiplication between num1 and num2 turns out: " +multot);
    }
    /**
     * this Method stamp the division between num1 and num2
     * @divtot is the int division between num1 and num2
     */
    public void div(){
        int divtot= num1/num2;
        System.out.println("The division between num1 and num2 turns out: " +divtot);
    }
}
