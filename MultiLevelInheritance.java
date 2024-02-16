class K
{
    void abc()
    {
        System.out.println("abc method");
    }
}
class L extends K
{
    void def()
    {
        System.out.println("def method");
    }
}
class M extends L
{
    void lmn()
    {
        System.out.println("lmn method");
    }
}
public class MultiLevelInheritance
{
public static void main(String args[])
{
    K obj1=new K();
    L obj2=new L();
    M obj3=new M();
    obj1.abc();
    obj2.abc();
    obj2.def();
    obj3.abc();
    obj3.def();
    obj3.lmn();
}
}