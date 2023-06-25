// import java.io.*;
import bag.*;

class test{
    public static void main(String args[]) {
        dog d1 = new dog("romeo", "labrador");
        dog d2 = new dog("tommy", "golden retiever");
        System.out.println(d1.getName() + " is a " + d1.getBreed());
        System.out.println(d2.getName() + " is a " + d2.getBreed());
        System.out.println("\n after modifying name and breed ");
        d1.setName("dom");
        d2.setBreed("bull dog");
        System.out.println(d1.getName() + " is now " + d1.getBreed());
        System.out.println(d2.getName() + " is now " + d2.getBreed());
    }
}
