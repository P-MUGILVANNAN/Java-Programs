class A
{
    void abc()
    {
        System.out.println("abc method");
    }
}
class B extends A
{
    void def()
    {
        System.out.println("def method");
    }
}
public class SingleLevelInheritance
{
public static void main(String args[])
{
    A obj1=new A();
    B obj2=new B();
    obj1.abc();
    obj2.abc();
    obj2.def();
}
}