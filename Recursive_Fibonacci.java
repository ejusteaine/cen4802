

public class Recursive_Fibonacci {
    public static void main(String[] args) {
     int sequence = 10;
     for(int i =1; i < sequence; i++){
         if(i == 1){
             System.out.println(i+"st term is: "+recursiveFibonacci(i));
         }else  if(i == 2){
             System.out.println(i+"nd term is: "+recursiveFibonacci(i));
         }else if(i == 3){
             System.out.println(i+"rd term is: "+recursiveFibonacci(i));
         }else
         System.out.println(i+"th term is: "+recursiveFibonacci(i));
     }
    }

    public static int recursiveFibonacci(int num){
        if(num <= 1){
            return num;
        }else{
            return recursiveFibonacci(num -1) + recursiveFibonacci(num -2);
        }
    }
}
