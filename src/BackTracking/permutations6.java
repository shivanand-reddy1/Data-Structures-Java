package BackTracking;
import java.util.ArrayList;

public class permutations6 {
    public static void printAll(String str, String ans, ArrayList<String> ls){
        if(str.isEmpty()){
            ls.add(ans);
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            String left = str.substring(0, i);
            String right = str.substring(i+1);

            String rem = left + right;

            printAll(rem, ans+ch, ls);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> ls = new ArrayList<>();

        String str = "abc";

        printAll(str,"", ls);

        for(String s : ls){
            System.out.println(s);
        }
    }
}
