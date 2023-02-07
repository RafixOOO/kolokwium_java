/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zajecia.kolokwium;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author rpezd
 */
class Point{
    private double x, y;
    
    Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    double getx(){
        return x;
    }
    double gety(){
        return y;
    }
    void distance(Point k){
        double y2=k.gety();
        double x2=k.getx();
        double first=x-x2;
        double second=y-y2;
        first = pow(first,2);
        second = pow(second,2);
        double wynik=first+second;
        System.out.println("Odległość punktu A["+x+","+y+"] do Punktu B["+x2+","+y2+"] wynosi: "+sqrt(wynik));
    }
}
public class Zadanie2 {
    
    public static void main(String[] args){
        Point point1=new Point(1,1);
        Point point2=new Point(4,5);
        point1.distance(point2);
    }

}
