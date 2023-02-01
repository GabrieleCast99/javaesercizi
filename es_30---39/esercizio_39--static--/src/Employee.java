public class Employee {
    public String name;
    public String surname;
    public String address;

    public Employee(String newEmployeeName,String newEmployeeSurname,String newEmployeeAddress){
        this.name=newEmployeeName;
        this.surname=newEmployeeSurname;
        this.address=newEmployeeAddress;
    }

   public String getEmployeeDetails(){
        return "this emplyee "+this.name+" "+this.surname+ " lives in "+this.address;
   }

}
