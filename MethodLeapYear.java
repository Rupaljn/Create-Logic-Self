public class MethodLeapYear{
public static boolean leapYear(int num){
  boolean flag = false;

if(num%4==0){

flag = true;
}

else{

flag = false;
}

return flag;

}

public static void main(String[] args){
boolean leapYear = MethodLeapYear(2005);
System.out.println(leapYear);
}

}