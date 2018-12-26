
package int102week9project;

public class DemoShortCircuit {
    public static void main(String[] args) {

        boolean result = getTrue(1) || getTrue(2) ;
        System.out.println(result);
        
    }   
    
    public static boolean getFalse(int num){
        System.out.printf("getFalse(%d)\n",num) ;
        return false ;
    }   
    
    public static boolean getTrue(int num){
         System.out.printf("getTrue(%d)\n",num) ;
        return true ;       
    }
    
}


