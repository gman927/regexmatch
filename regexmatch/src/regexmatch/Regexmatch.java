
package regexmatch;

public class Regexmatch {
    
    public static boolean isTrue(String str){
        return str.matches("[tT]rue");
    }
    
    public static boolean containsFalse(String str){
        return str.matches(".*false.*");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isTrue("true"));
        System.out.println(containsFalse("asdlkj"));
    }
    
}
