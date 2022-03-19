package polymorphism;



class Addition_operation
{
    
    void addition_func(int num1,int num2)
    {                         
      System.out.println("ABC::addition_func:" + (num1+num2));     //1st method to add two integers
    }
                             
    
    void addition_func(String str1, String str2)                  //2nd overloaded method to add two strings
    {
        String result = str1 + " " + str2;
        System.out.println("XYZ::addition_func:" + result);
    }
     
}
 
public class polymorphism
{
    public static void main(String[] args) {
        Addition_operation abc = new Addition_operation();  //create a class object
        abc.addition_func (3,4);                   //calls 1st method
        abc.addition_func ("Happy" , "Holi!");   //calls 2nd method
         
    }
}