import java.util.*;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char arr[]=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>='a' && arr[i]<='z'){
                arr[i]=(char) ((int) arr[i]-32);
            }
        }
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+"");
        }
    }
}
