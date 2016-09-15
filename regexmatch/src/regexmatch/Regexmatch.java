
package regexmatch;

public class Regexmatch {
    
    public static boolean isTrue(String str){
        return str.matches("[tT]rue");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isTrue("true"));
    }
    
}
