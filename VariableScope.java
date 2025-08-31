public class VariableScope {
    static String strc = "Class/ Static Scope";
    String obj = "Object/Instance Scope";

    public static void main(String[] args) {
        System.out.println(strc);

        System.out.println(Example.stcNum);// We can Extract different class 
        // variable by using Classname with a dot.

        // System.out.println(obj); It Shows Error as We Cannot directly use 
        // Instance Scope Varible without creating Object.

        VariableScope ob1 = new VariableScope();
        System.out.println(ob1.obj);// It will Print Instance Variable.

        Example obj = new Example();
        System.out.println(obj.objNum);

        //System.out.println(mthdStr); We Cannot direct use method variable 
        // It can be access using method call.

        // System.out.println(methodScope()); It also doesnot work as the method is
        //  not a static method so it cannot be directly access by main.
        ob1.methodScope(); // Here it is accessible.
        ob1.takeInput("Hello");
       
    }
    void takeInput(String obj){
        System.out.println(obj);
    }
    void methodScope(){
        String mthdStr = "Method Scope";
        System.out.println(mthdStr);
        for (int i=0; i < 5; i++){
            System.out.println("Block/Flow Scope" + i);
        }
    }
}
