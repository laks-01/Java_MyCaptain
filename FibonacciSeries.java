class FibonacciSeries{
public static void main(String args[])
{  
 int num1=0,num2=1,num3,item,count=12;  
 System.out.print(num1+" "+num2);//printing 0 and 1  
  
 for(item=2;item<count;++item)
 {  
  num3=num1+num2;  
  System.out.print(" "+num3);  
  num1=num2;  
  num2=num3;  
 }  

}
}
