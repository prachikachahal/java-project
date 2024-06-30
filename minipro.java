package miniproject;

import java.util.Scanner;
public class minipro {
  public static  void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int myNumber=(int)(Math.random()*100);
    int userNumber=0;
    do{
        System.out.println("Guess my number: ");
         userNumber =sc.nextInt();
        if(userNumber==myNumber){
            System.out.println("wooohoo good");
            break;
        }
        else if(userNumber>myNumber){
                        System.out.println("your number is larger");
        }
        else{
                        System.out.println("ypur number is to small");
        }
    } while(userNumber>=0);
                        System.out.println("my number was");
                        System.out.println(myNumber);
  }  
};
