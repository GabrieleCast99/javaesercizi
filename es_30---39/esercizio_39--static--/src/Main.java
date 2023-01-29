public class Main {
    public static void main(String[] args) {

            employee e1 = new employee("gabri", "casti", "catald paris 111");
            employee e2 = new employee("samu", "casti", "paris catald  91");
            badge b1 = new badge(e1);
            badge b2 = new badge(e2);
            b1.showBadgeDetails();
            b2.showBadgeDetails();
        }
    }
