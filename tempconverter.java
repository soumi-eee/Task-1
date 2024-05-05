import java.util.*;
public class tempconverter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //if the user enters celsius   
        System.out.println("enter the temperature value ");
        float temp = sc.nextFloat();
        System.out.println("choose the unit you have entered");
        System.out.println("1, celsius");
        System.out.println("2,fahrenheit");
        System.out.println("3,kelvin");
        int choice = sc.nextInt();
        if(choice==1){
          float fahrenheit = temp*1.8f;
          float kelvin = temp + 273.15f;
          System.out.println("its fahrenheit value is "+ fahrenheit);
          System.out.println("its kelvin value is"+ kelvin);
        }
        if(choice==2){
            float celsius= (temp- 32f)*5/9;
            float kelvin = (temp- 32f)*5/9 +273.15f;
            System.out.println("its celsius value is "+ celsius);
            System.out.println("its kelvin value is "+ kelvin);
              }
              if(choice==3){
                float fahrenheit=(temp-273.5f)*9/5+32f; 
                float celsius= temp-273.15f;
                System.out.println("its fahrenheit value is"+fahrenheit);
                System.out.println("its celsius value is"+ celsius);
              }
    }
    }
