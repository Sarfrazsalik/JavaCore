
interface BinaryCalculator {
  
    public int binaryOperation(int value1 , int value2); // Functional Interface
    
}
public class LambdaParameter  {

    public static void printBinary(int a , int b , BinaryCalculator func ){
 
        int result =  func.binaryOperation(a, b);
        System.out.println(result);


    }

    public static void main(String[] args) {
        printBinary(6, 7, (a,b) -> a+b);
        printBinary(7,8,(a,b) -> a*b);
    }
}