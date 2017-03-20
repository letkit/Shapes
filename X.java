package shapes;

public class X {
    private int diagonal;
    private int side;
    private String shape = ""; 
    
    public void setDiagonal(int diagonal){
        if(diagonal >= 10 && diagonal <= 45){
            this.diagonal = diagonal;
        }
        else
            throw new IllegalArgumentException("Diagonal is out of bounds."
                                            + " Acceptable range is [10-45]");
    }
    private void translateSide(){
        side = (int)(Math.cos(45)*diagonal);
        side++;
    }
    public String getShape(){
        translateSide();
        drawShape();
        return shape;
    }
    private void drawShape(){
        for (int i = 0; i < side; i++) {
            for (int u = 0; u < side; u++) {          
                if(u == i)
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