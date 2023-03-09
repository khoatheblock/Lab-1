class Item
{
    private int[] ID;
    private String[] name;
    private double[] price;
    private int n = 0;
    public ItemList()
    {
        return ID[n];
        return name[n];
        return price[n];
        n++;
    }
}  
class Order
{           
    private int ID;
    private long[] ord;
    private int n;
    public MakeOrder()
    {
        return ID;
    }
    public GetOrder(int b) //b is the position of the item in the list starting at 1
    {
        ord = new long[1000];
        n = 0;
        ord[n] = b;
        n++;
    }
    public void calculateAverageCost()
    {
        for (int i = 0; i < n; i++)
        {
            long sum += price[b - 1];
        }
        long ave = sum / n;
        System.out.println("The average cost is " + ave);
    }
    public static void main(String[] args)
    {
        Order ord = new MakeOrder();
        ord.GetOrder(2);
        ord.calculateAverageCost();
    }
}