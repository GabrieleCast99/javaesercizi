
public class Main {
    public static void main(String[] args) {

        Month[] var1 = Month.values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            Month month = var1[var3];
            System.out.println("" + month + (month.toString().endsWith("Y") ? " ends" : " doesn't end") + " with y");
        }
    }
}