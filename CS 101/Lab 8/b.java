/**
 * @(#)RectangleApplication.java
 *
 *
 * @author 
 * @version 1.00 2017/4/11
 */
import java.util.ArrayList;
public class b {
    
    public static void main(String[] args) {
        //create a list to store Rectangles
        ArrayList<a> shapeList = new ArrayList<a>();
        
        //add some rectangles to the list
        a rect = new a(10.0, 2.5);
        
        shapeList.add(rect);
        shapeList.add(new a(7.5,12.2));
        shapeList.add(new a(18.4,13.2));
        shapeList.add(new a(22.0,15.2));
        
        //display the list
        System.out.println(shapeList);
        
        //display the rectangles with the width 7.5
        System.out.println("\nRectangle with width 7.5:");
        for(a r : shapeList){
        	if(r.getWidth() == 7.5){
        		System.out.print(r);
        	}
        }
        
        //display the total area of all rectangles
        double total = 0.0;
        for(int pos = 0; pos < shapeList.size(); pos++){
        	//get the current element
        	a r = shapeList.get(pos);
        	total += r.getArea();
        }
        System.out.printf("\nThe total area of all rectangles in the list: %.2f\n",total);
    }
}