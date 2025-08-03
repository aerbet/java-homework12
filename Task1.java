

public class Task1 {
    
    public static void main(String[] args) {
        
       String[] words = {
        " also be",
        "If a machine ",
        " it cannot",
        "is expected ",
        "to be insallible,",
        " intelligent."
       };

       String tmpl = "%s%s%s%s%s%s";

       System.out.printf(tmpl, words[1], words[3], words[4], words[2], words[0], words[5]);
    }
}