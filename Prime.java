   class Test_Addition_of_Prime_Numbers 
{
	public static void main(String[] args)
{
	int number = 1;
	int sum = 0;
	while(number<=20)  
	{  
	int count = 0;  
	int div = 2;  
	while(div<=number/2)   
	{  
	if(number%div==0)
	{   
	count=count+1;   
	}  
	div=div+1;  
	}
	if(count==0&&number>1)            
	{     
	sum = sum + number;  
	}
	number=number+1;  
	}
	System.out.println("The Sum of Prime Numbers from 1 to 20 is: " + sum);  
}  
}
