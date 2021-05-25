package primenumber;
import java.util.Scanner;
public class PrimeNumber {

public static void main(String[] args) {
int num;
boolean isPrime=false;

    Scanner sc = new Scanner(System.in); 
    System.out.print("Please insert any number: ");
    num = sc.nextInt();

for(int i=2; i<=num/2; i++){
    
    if(num%i==0)
    {
        isPrime=true;
        break;
    }
}

if(!isPrime){
    System.out.println(num+" is a prime numbner ");
}
else{
    System.out.println(num+" is not a prime numbner ");
}
}
}
