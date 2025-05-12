
package Super_keyword;


public class NewCar extends Car {
        int speed =300;
        
        void Display(){
        System.out.println("Speed given in superclass " + super.speed);
        System.out.println("Speed given in subclass: " + speed);
        }
    
}
