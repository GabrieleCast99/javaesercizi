public class employee {
    public String name;
    public String surname;
    public String address;

    public employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress) {
        this.name = newEmployeeName;
        this.surname = newEmployeeSurname;
        this.address = newEmployeeAddress;
    }

    public String getEmployeeDetails() {
        return "This employee " + this.name + " " + this.surname + " lives in " + this.address;
    }
}
