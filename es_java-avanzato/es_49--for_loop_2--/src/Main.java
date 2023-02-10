public class Main {
    public static void main(String[] args) {
        int n=10 ;
        int first = 0, second = 1, next;


        for (int i=0;i<n;i++) {
            if(i<=1){
                next=i;
            }else{
                next=first+second;
                first=second;
                second=next;
            }
            System.out.println(next);
        }
    }
}