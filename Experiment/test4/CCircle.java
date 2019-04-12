class CCircle   {
    CCircle(double r) {
        radius = r;
    }
    final double pi = 3.14159;    
    double radius;
    double getArea() {
        return pi*radius*radius*0.5;
    }
    double getRadius(){
        return radius;
    }
    void setCircle(double r){     
        radius=r;   
    }
}