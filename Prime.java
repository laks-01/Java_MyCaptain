public class Prime{    
 public static void main(String args[]){ 
    int i,m=0,check=0;      
    int num=3;//it is the number to be checked    
    m=num/2;      
    if(num==0||num==1){  
        System.out.println(num+" is not prime number");      
    }else{  
        for(i=2;i<=m;i++){      
    if(num%i==0)
    {      
        System.out.println(num+" is not prime number");      
        check=1;      
        break;      
    }      
   }      
   if(check==0)  {
        System.out.println(num+" is prime number"); }  
    } 
}    
}   
