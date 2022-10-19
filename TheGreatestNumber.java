public class TheGreatestNumber{
public static void main(String[] args){

int num1 = 24;
int num2 = 78;
int num3 = 87;

if(num1>num2 && num1>num3){
System.out.println("The greatest number =" + num1);
}
else if(num2>num1 && num2>num3){
System.out.println("The greatest number =" + num2);
}

else{
System.out.println("The greatest number =" + num3);
}
}

}