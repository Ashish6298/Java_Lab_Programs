class station{
    station()
    {
        String chefname="0";
        String village="0";
        int chefage=0;
        String authenticdishes="0";
    }
String chefname;
String village;
int chefage;
String authenticdishes;

void read(String x,String y,int z,String a)
{
    chefname=x;
    village=y;
    chefage=z;
    authenticdishes=a;
}
void display()
{
    System.out.println("\tChef Name\t= "+chefname+ "\tChef Village\t ="+village+"\tChef Age\t ="+chefage+"\tAuthentic Dishes\t ="+authenticdishes);
}

}


class manali extends station{
    void read()
    {
        super.read(village, chefname, chefage, authenticdishes);
    }
void display()
{
    super.display();
}

}





class musorrie extends manali{
    void read()
    {
        super.read(village, chefname, chefage, authenticdishes);
    }
void display()
{
    super.display();
}

}



class gulmarg extends musorrie{
    void read()
    {
        super.read(village, chefname, chefage, authenticdishes);
    }
void display()
{
    super.display();
}

}

public class hillstation{
    public static void main(String []args){
manali m1=new manali();
musorrie m2=new musorrie();
gulmarg m3=new gulmarg();


m1.read("Ashish","Manali",20,"Maggie");
m1.display();

m2.read("Ashish","Musoorie",20,"Chai");
m2.display();

m3.read("Ashish","Gulmarg",20,"Cofee");
m3.display();

    }
}

