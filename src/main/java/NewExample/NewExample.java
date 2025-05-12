
package NewExample;

public class NewExample {
        double length,breadth,height;
        
        NewExample(double l,double b,double h){
            length=l;
            breadth=b;
            height =h;
        }
        
        void Display(){
            System.out.println("The area of the Box is: " + length*breadth);
            System.out.println("The Volume of the Box is: " + length*breadth*height);
            
        }


    
}
