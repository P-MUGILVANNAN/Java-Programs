class A2
{
    void abc()
    {
        System.out.println("abc method");
    }
    void abc(int a)  //overloading
    {
        System.out.println("abc int method");
    }
}
class B2 extends A2
{
    void abc() //overriding
    {
        System.out.println("abc method 2");
    }
    void def()
    {
        System.out.println("def method");
    }
}
class C extends A2
{
    void lmn()
    {
        System.out.println("lmn method");
    }
}
class MethodOverloadingAndOverriding
{
    public static void main(String[] args) 
    {
        A2 obj1=new A2();
        B2 obj2=new B2();
        C obj3=new C();
        obj1.abc();
        obj1.abc(70);
        obj2.abc();
        obj2.def();
        obj3.abc();
        obj3.lmn();
    }
}