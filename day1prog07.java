class A{
public static void funA1(){
System.out.println("FunA1 called from class A");
}
public ststic void funA2(){
System.out.println("FunA1 called from class A");
}
}
class B{
public static void main(String args[])
{

A.funA1();
A.funA2();
}
}