//program on logical operators in java
public class operator3
{
  public static void main(String[] args)
  {
    int a=10; 
    int b=5;
    boolean and=a>b && a<b;
    boolean or=a>b || a<b ;
    boolean not=(a!=b);
    System.out.println("logic is: "+and);
    System.out.println("logic is: "+or);
    System.out.println("logic is: "+not);
  }
}