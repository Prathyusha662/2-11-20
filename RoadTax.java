class RoadTax{
public static void main(String args[]){
int vehiclePrice=10000;
String state="KA";
switch(state){
case"KA":
float kaRoadTax=vehiclePrice*0.1f;
System.out.println(kaRoadTax);
break;
case"AP":
float apRoadTax =vehiclePrice*0.15f;
System.out.println(apRoadTax);
break;
case"TS":
float tsRoadTax=vehiclePrice*0.18f;
System.out.println(tsRoadTax);
break;
case"TN":
float tnRoadTax=vehiclePrice*0.2f;
System.out.println(tnRoadTax);
break;
case"MP":
float mpRoadTax=vehiclePrice*0.25f;
System.out.println(mpRoadTax);
break;
case"RJ":
float rjRoadTax=vehiclePrice*0.28f;
System.out.println( rjRoadTax);
break;
default:System.out.println(" please choose the aboveKA,AP,MP,RJ,TS,TN");
}
}
}