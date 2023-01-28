public class Main {
    public static void main(String[] args) {
        String[] array1 = new String[]{" I want "," to learn "," how to code! "};
        String[] array2 = new String[]{array1[0].trim(),array1[1].trim(),array1[2].trim()};

        boolean statement1 = (array2[0].equals(array1[0]));
        boolean statement2 = (array2[0].equals(array1[0])==array2[2].equals(array1[2]));
        boolean result;
        if (!(statement1 == statement2)) result = true;
        else result = false;

        System.out.println(result);

    }


}