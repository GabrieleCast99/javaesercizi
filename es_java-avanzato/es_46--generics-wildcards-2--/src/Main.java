public class Main {
    public static void main(String[] args) {
        GenericsClass<Integer> firstElement= new GenericsClass<>();
        GenericsClass<Integer> secondElement= new GenericsClass<>();
        GenericsClass<String> thirdElement= new GenericsClass<>();
        GenericsClass<String> fourthElement= new GenericsClass<>();

        firstElement.setT(12);
        secondElement.setT(13);
        thirdElement.setT("This is a string");
        fourthElement.setT("This is a string");

        Boolean t1= GenericsClass.isEqual(firstElement,secondElement);

        Boolean t2=GenericsClass.isEqual(thirdElement,fourthElement);

        System.out.println("first element is equal to second element? "+t1);
        System.out.println("-------------------------");
        System.out.println("third element is equal to fourth element? "+t2);


    }
}