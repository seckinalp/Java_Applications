/**
 * @(#)Rectangle.java
 *
 *
 * @author 
 * @version 1.00 2017/4/11
 */

public class a {
	
    private double width;
    private double sideLength;
     
    public a(double w, double l){
    	setWidth(w);
    	setSideLength(l);
    }
    public double getWidth(){
    	return width;
    }
    public double getSideLength(){
    	return sideLength;
    }
    public void setWidth(double w){
    	if(w > 0)
    		width = w;
    }
    public void setSideLength(double l){
    	if(l > 0)
    		sideLength = l;
    }
    public double getArea(){
    	double area = width * sideLength;
    	return area;
    }
    public double getPerimeter(){
    	return 2 * width + 2 * sideLength;
    }
    public String toString(){
    	String rectData = "\nLength: "+sideLength+"\t"+"Width: "+width+
    					  "\nArea: "+getArea()+"\t"+"Perimeter: "+getPerimeter()+"\n";
    	return rectData;
    }
}