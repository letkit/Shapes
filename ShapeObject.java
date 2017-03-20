/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author admin
 */
public class ShapeObject {
    private X x;
    private Box b;
    private Xbox xb;
    private Circle c;
    
    public ShapeObject(){
        this.x = null;
        this.b = null;
        this.xb = null;
        this.c = null;
    }
    
    public void setShape(Object o){
        if(o.getClass() == X.class)
            x = (X)o;
        if(o.getClass() == Box.class)
            b = (Box)o;
        if(o.getClass() == Xbox.class)
            xb = (Xbox)o;
        if(o.getClass() == Circle.class)
            c = (Circle)c;
    }
    
    
}
