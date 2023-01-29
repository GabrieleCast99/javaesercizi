public class badge {
    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public employee employee;

    private static void keepTrackOfEmployeesNumber() {
        ++totalNumberOfEmployees;
    }

    private String generateBadgeIdCode() {
        return "XYZ" + this.employee.name + this.employee.surname + "ZYX";
    }

    public void showBadgeDetails() {
        System.out.println("Total number of employees : " + totalNumberOfEmployees);
        System.out.println(this.employee.getEmployeeDetails());
        System.out.println("And has this badge number: " + this.badgeIdCode);
        System.out.println("---------");
    }

    public badge(employee employeeThatNeedsBadge) {
        keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        this.badgeIdCode = this.generateBadgeIdCode();
    }
}
