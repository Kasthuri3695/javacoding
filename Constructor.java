class Main
{
private String name; //Global Variable
Main () //Constructor
{
System.out.println("Constructor Called:");
name = "Kasthuri";
}
public static void main(String[] args)
{
Main obj = new Main();
System.out.println("The name is" + obj.name);
}
}
