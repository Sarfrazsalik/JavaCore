public class EncapsulateExample {
    public static void main(String[] args) {
        EmployeeCount count = new EmployeeCount();

        // count.noOfEmployee = 89;
        // System.out.println(count.noOfEmployee); It will show its not visible means cannot be 
                                            // accessed directly by just calling the variable.


        count.setEmployee(5679);  // can be accessed through methods making it 
                                        // accessible through Object's methods.
        System.out.println(count.getEmployee());

        //System.out.println(noOfEmployee); Cannot be access directly without its object.
    }
}
