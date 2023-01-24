import java.util.Scanner;
public class P_54A_ChatRoom{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.next() ,s2 ="hello";
        int c=0,x=s.length();
        for(int i=0;i<5;i++){
            for(int j=0;j<s.length();j++){
                if(s2.charAt(i)==s.charAt(j)){
                    c++;
                    s=s.substring(j+1);
                    break;
                }
            }
        }
        if(c==5 && x>=5)
            System.out.println("YES");
        else
            System.out.println("NO");
            
    }
}