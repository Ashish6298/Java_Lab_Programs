import java.util.*;
class vehicle{
    String vehiclenumber;
    int fuelcapacity;
    int fuelconsumptionrate;
void read(String x,int y,int z)
{
    vehiclenumber=x;
    fuelcapacity=y;
    fuelconsumptionrate=z;
}
}

class truck extends vehicle{
    int goodscapacity;
    void read(String x,int y,int z,int a)
    {
        vehiclenumber=x;
        fuelcapacity=y;
        fuelconsumptionrate=z;
        goodscapacity=a;
    }
void display()
{
    System.out.println("\tVehicle Number\t"+vehiclenumber+"\tFuel Capacity\t"+fuelcapacity+"\tFuel Consumption Rate\t"+fuelconsumptionrate+"\tGoods Capacitiy\t"+goodscapacity);

}
}



class bus extends vehicle{
    int seatingcapacity;
    void read(String x,int y,int z,int a)
    {
        vehiclenumber=x;
        fuelcapacity=y;
        fuelconsumptionrate=z;
        seatingcapacity=a;
    }
void display()
{
    System.out.println("\tVehicle Number\t"+vehiclenumber+"\tFuel Capacity\t"+fuelcapacity+"\tFuel Consumption Rate\t"+fuelconsumptionrate+"\tSeating Capacitiy "+ seatingcapacity);
    
}
}







public class vehicledetails {
    public static void main(String []args){

truck t=new truck();
bus b=new bus();

t.read("BR016298",20,25,30);
t.display();

b.read("BR016298",20,25,30);
b.display();
    }
    
}
