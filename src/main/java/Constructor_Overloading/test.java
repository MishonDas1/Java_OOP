
package Constructor_Overloading;


public class test {
    public static void main(String[] args) {
        Teacher Teacher1 = new Teacher();
        
        Teacher Teacher2 = new Teacher("Mishon Kumar","Male");
        Teacher2.DisplayInformation();
        
        Teacher Teacher3 = new Teacher("Arnab Kumar","Male",27);
        Teacher3.DisplayInformation();
        
    }
    
}
