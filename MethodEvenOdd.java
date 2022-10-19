public class MethodEvenOdd{
public static boolean evenNum(int num){
  boolean flag = false;

if(num%2==0){

flag = true;
}

else{

flag = false;

}

return flag;
}

public static void main(String[] args){

boolean evenOdd = MethodEvenOdd.evenNum(24);
boolean evenOdd1 = MethodEvenOdd.evenNum(45);
System.out.println(evenOdd);
System.out.println(evenOdd1);
}

}