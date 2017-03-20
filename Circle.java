package shapes;

public class Circle {
    private double radius;
    private String shape; 

    public Circle() {
        this.shape = "";
    }
    
    public void setRadius(double radius){
        if(radius >= 5 && radius <= 20){
            this.radius = radius;
        }
        else{
            throw new IllegalArgumentException("Radius is out of bounds. Acceptable range is [5-20]");
        }
    }
    public String getShape(){
        drawShape();
        return shape;
    }
    private void drawShape(){
        double distance_inside  = radius - 0.4,
               distance_outside = radius + 0.4;
        
        for(double i = radius; i >= -radius; i--){
            for(double u = -radius; u < distance_outside; u += 0.9){
                double ratio = u*u + i*i; 
                if(ratio >= distance_inside * distance_inside && ratio <= distance_outside*distance_outside){
                    shape+="\u058E ";
                }
                else
                    shape+="  ";
            }
            shape+="\n";
        }
    } 
}
