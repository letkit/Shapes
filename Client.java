package shapes;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Client {
    private final X x;
    private final Box b;
    private final Xbox xb;
    private final Circle c;
    private EnumShape eShape;
    protected List<ShapeObject> arrShapes = new ArrayList<>();
    
    public Client() {
        this.c = new Circle();
        this.xb = new Xbox();
        this.b = new Box();
        this.x = new X();
        eShape = null;
    }
    
    public void run(){
        menu();
        while(true){
            System.out.println("Choice: ");
            System.out.println(shapeFetch());
        }
    }
    private void menu(){
        System.out.println("Shapes Available");
        System.out.println("1. Square [5 - 50]");
        System.out.println("2. X [10 - 45]");
        System.out.println("3. Square around an X [10 - 45]");
        System.out.println("4. Circle [5 - 20]");
        System.out.println("5. Exit");
    }
    private String shapeFetch(){
        String shape = "";
        
        eShape = getChoice();
        
        ShapeObject shapeObject = new ShapeObject();
        
        
        switch(eShape){
            case BOX:
                b.setSide(getSizeChoice("Enter side length: "));
                shape = b.getShape();
                shapeObject.setShape(b);
                break;
            case X:
                x.setDiagonal(getSizeChoice("Enter desired diagonal length: "));
                shape = x.getShape();
                shapeObject.setShape(x);
                break;
            case XBOX:
                xb.setDiagonal(getSizeChoice("Enter desired diagonal length: "));
                shape = xb.getShape();
                shapeObject.setShape(xb);
                break;
            case CIRCLE:
                c.setRadius(getSizeChoice("Enter desired radius length: "));
                shape = c.getShape();
                shapeObject.setShape(c);
                break;                
            default:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            }
            arrShapes.add(shapeObject);
            return shape;
    }   
    private EnumShape getChoice(){
        Scanner keyboard = new Scanner(System.in);
        String temp;
        EnumShape shp = null;
        char ch = ' ';
        try{
            temp = keyboard.next();
            ch = temp.charAt(0);
        }catch(Exception e){
            System.err.print(e.getMessage());
        }
        switch(ch){
            case '1':
                shp = EnumShape.BOX;
                break;
            case '2':
                shp = EnumShape.X;
                break;
            case '3':
                shp = EnumShape.XBOX;
                break;
            case '4':
                shp = EnumShape.CIRCLE;
                break;
                
            default:
                shp = EnumShape.EXIT;
                break;
        }
        return shp;
    }
    private int getSizeChoice(String Message){
        Scanner keyboard = new Scanner(System.in);
        int choice = 0;
        try{
            System.out.print(Message);
            choice = keyboard.nextInt();
        }catch(Exception e){
            System.out.println("Invalid Input");
            System.err.println(e.getMessage());
            System.out.println("Exiting...");
            System.exit(0);
        }
        
        return choice;
    }
    
}
