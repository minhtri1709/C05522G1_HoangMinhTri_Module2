import java.lang.reflect.Array;
import java.util.Arrays;

public class testtaoao {
    public static String[] findChar(String str){
        StringBuilder arr =new StringBuilder();
        for1:
        for (int i=0; i<str.length()-1;i++){
            for (int k =0; k<arr.length();k++){
                if(str.charAt(i)==arr.charAt(k)){
                    continue for1;
                }
            }
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j) ){

                    arr.append(str.charAt(i));
                    break;
                }
            }
        }
        return arr.toString().split("");
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findChar("taolaobidao")));
    }
}
