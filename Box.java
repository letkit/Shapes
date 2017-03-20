package shapes;

public class Box {
    private int side;
    private String shape = ""; 
    
    public void setSide(int side) throws IllegalArgumentException{
        if(side >= 5 && side <= 50){
            this.side = side;
        }
        else
            throw new IllegalArgumentException("Side is out of bounds. Acceptable range is [5-50]");
    }
    public int getSide(){
        return side;
    }
    public String getShape(){
        drawShape();
        return shape;
    }
    private void drawShape(){
        for (int i = 0; i < side; i++) {
            for (int u = 0; u < side; u++) {
                if(i == 0 || i == side - 1)
                    shape+="\u058E ";            
                else if(u == 0 || u == side - 1)
                    shape+="\u058E ";
                else
                    shape+="  ";
            }   
            shape+="\n";
        }
    }
}
