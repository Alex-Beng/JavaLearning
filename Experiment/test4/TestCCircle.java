// class CCircle   {
//     double pi;    
//     double radius;
//     double getArea() {
//         return pi*radius*radius*0.5;
//     }
//     double getRadius(){
//         return radius;
//     }
//     void setCircle(double r, double p){     
//         pi=p;
//         radius=r;   
//     }
// }

public class TestCCircle{
    public static void main(String args[])   {
       CCircle cir1=new CCircle(2.0);   
       cir1.setCircle(2.0);
       System.out.println("radius="+cir1.getRadius()); 
       System.out.println("area="+cir1.getArea()); 
    }
 }
 
      