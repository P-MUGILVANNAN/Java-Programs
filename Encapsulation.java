class Encapsulation
{
    private int amount=2000;
    void setAmount(int a)
    {
        amount=a;
    }
    int getAmount()
    {
        return amount;
    }
    public static void main(String[] args) 
    {
        Encapsulation e=new Encapsulation();
        System.out.println(e.getAmount());
    }
}