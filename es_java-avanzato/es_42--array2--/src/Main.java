import java.util.Arrays;
public class Main {


    public static void main(String[] args) {
        String[]aliceToDos=new String[]{"Coding","Reading ","Learning"};
        String[]bobToDos=new String[]{"Reading ","Coding","Learning"};
        String[]timToDos=new String[]{"Reading ","Learning","Coding"};

        if(Arrays.equals(aliceToDos,bobToDos)){
            System.out.println("Is Alice's array equal to Bob array?"+" Yes it is");
        } else {
            System.out.println("Is Alice's array equal to Bob array?"+" No");
        }



        if(Arrays.equals(aliceToDos,timToDos)){
            System.out.println("Is Alice's array equal to Tim array?"+" Yes it is");
        } else {
            System.out.println("Is Alice's array equal to Tim array?"+" No");
        }


        if(aliceToDos.length== bobToDos.length){
            System.out.println("Is Alice's array having the same length of Bob's array?"+" Yes it is");
        } else {
            System.out.println("Is Alice's array having the same length of Bob's array?"+" No");
        }



        if(aliceToDos.length== bobToDos.length){
            System.out.println("Is Alice's array having the same length of Tim's array?"+" Yes it is");
        } else {
            System.out.println("Is Alice's array having the same length of Tim's array?"+" No");
        }



        Arrays.sort(aliceToDos);
        Arrays.sort(bobToDos);
        Arrays.sort(timToDos);


        if(Arrays.equals(aliceToDos,bobToDos)){
            System.out.println("Is Alice having the same tasks of Bob?"+" Yes it is");
        } else {
            System.out.println("Is Alice having the same tasks of Bob?"+" No");
        }


        if(Arrays.equals(aliceToDos,timToDos)){
            System.out.println("Is Alice having the same tasks of Tim?"+" Yes it is");
        } else {
            System.out.println("Is Alice having the same tasks of Tim?"+" No");
        }


    }
}