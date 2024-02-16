class P
{
    void abc()
    {
        System.out.println("abc method");
    }
}
class Q extends P
{
    void def()
    {
        System.out.println("def method");
    }
}
class R extends P
{
    void lmn()
    {
        System.out.println("lmn method");
    }
}
public class HierarchicalInheritance
{
public static void main(String args[])
{
    P obj1=new P();
    Q obj2=new Q();
    R obj3=new R();
    obj1.abc();
    obj2.abc();
    obj2.def();
    obj3.abc();
    obj3.lmn();
}
}