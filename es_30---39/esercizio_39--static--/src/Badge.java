
public class Badge {
    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;
    private static void keepTrackOfEmployeesNumber(){
        ++totalNumberOfEmployees;
    }
    private String generateBadgeIdCode(){
        return random.getAlphaNumericString(3)+" "+this.employee.name+this.employee.surname+" "+random.getAlphaNumericString(3);
    }

    public void showBadgeDetails(){
        System.out.println("the total number of employee tracked by the badges is: "+totalNumberOfEmployees);
        System.out.println(this.employee.getEmployeeDetails());
        System.out.println("the badge id is: "+badgeIdCode);
    }
    public Badge(Employee employeeThatNeedsBadge ){
        keepTrackOfEmployeesNumber();
        this.employee=employeeThatNeedsBadge;
        this.badgeIdCode=generateBadgeIdCode();
    }
}
