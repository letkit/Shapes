package shapes;

import java.lang.Math;

public class Xbox{
    private int diagonal;
    private int side;
    private String shape = "";
    
    private void translateSide(){
        side = (int)(Math.cos(45)*diagonal);
        side++;
    }
    public void setDiagonal(int diagonal) throws IllegalArgumentException{
        if(diagonal >= 10 && diagonal <= 35){
            this.diagonal = diagonal;
        }
        else
            throw new IllegalArgumentException("Diagonal is out of bounds. Acceptable range is [10-35]");
    }
    public String getShape(){
        translateSide();
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
                else if(u == i)
                    shape+="\u058E ";
                else if(u == side - i - 1)
                    shape+="\u058E ";
                else
                    shape+="  ";
            }   
            shape+="\n";
        } 
    }
}