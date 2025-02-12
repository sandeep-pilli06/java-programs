//program on relational operators in java
public class operator2
{  
  public static void main(String[] args)
  {
    int a=18; 
    int b=9;
    int e=10; 
    int h=18;
    boolean less=a<b;
    boolean great=a>b;
    boolean lessequal=(b<=e);
    boolean greatequal=(a>=h);
    boolean equal=(a==b);
    boolean notequal=(a!=h);
    System.out.println("relation is: "+less);
    System.out.println("relation is: "+great);
    System.out.println("relation is: "+lessequal);
    System.out.println("relation is: "+greatequal);
    System.out.println("relation is: "+equal);
    System.out.println("relation is: "+notequal);
  }
}
