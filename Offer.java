//Write a program to give 10% discount if the amount is even and 20% discount is amount is odd.

//1 amount= 999  -999*20/100=801;
//2 amount = 24;
//3 amount = 500;

public class Offer{
public static boolean even(int num1){

boolean flag = false;

if(num1%2==0){

flag = true;
}
return flag;
}
public static void main(String[] args){
int discount = 0;
int price = 24;
boolean flag = Offer.even(price);
if(flag==true){
discount = (price*10)/100;
}
else{
discount = (price*20)/100;
}


System.out.println(discount);
}
}