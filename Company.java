
public class Company {
    public String name;
    public double networth;
    public int cars_sold;
    public Company(String name,double networth,int cars_sold)
    {
        this.name=name;
        this.networth=networth;
        this.cars_sold=cars_sold;
    }
    public double calcTax(float percent)
    {
        return percent*0.01*networth;
    }
    public void display()
    {
        System.out.println("company Name: "+name);
        System.out.println("Cars sold: "+cars_sold + " million");
        System.out.println("Net worth: "+networth+" cr\n");
    }
    
}