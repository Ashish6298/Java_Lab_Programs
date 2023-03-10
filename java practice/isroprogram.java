import java.util.*;

interface isro{
    void input();
    void result(int n);
}
class name{
    String name[]=new String[10];
    String state[]=new String[10];

}


class body extends name implements isro{
    public int n;
    Scanner s=new Scanner(System.in);
public void result(int n)
{
    int count=0;
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            if(1!=j){
                if(state[i].equalsIgnoreCase(state[j])==false)
                {
count++;


System.out.println("The possible pair:"+count+"\t=\t["+name[i]+"] from state ["+state[i]+"] and ["+name[j]+"] from state ["+state[j]+"]");
                }
            }
        }
    }
    System.out.println("A total of "+count+" possibilities of pairs from different states were detected.");
}


public void input()
{
    System.out.println("Enter the no. of astronauts");
n=s.nextInt();
System.out.println("Enter the state detail");
for(int i=1;i<=n;i++)
{
System.out.println("Enter the astronaut name");
name[i]=s.next();
System.out.println("Enter the state");
state[i]=s.next();
}
}

}




public class isroprogram {
    
public static void main(String[] args) {
body B=new body();
Scanner s=new Scanner(System.in);
int y;
do{
    B.input();
    B.result(B.n);
    System.out.println("Do u want to continue");
y=s.nextInt();
}while(y==0);
}


}
