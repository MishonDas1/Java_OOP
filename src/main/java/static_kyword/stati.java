
package static_kyword;

public class stati {
    
    String name;
    int id;
    static String university="UU";
    
    stati(String n,int i){
        name=n;
        id=i;
    }
    
    void Display(){
        System.out.println("Name:"+ name);
        System.out.println("Id:"+ id);
        System.out.println("University name:" + university);
    }
    
}
