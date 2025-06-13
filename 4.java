import java.util.*;
public class Main {
    public static boolean check(String s){
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch == '(' || ch == '{' || ch =='[') {
                st.push(ch);
            }
            else {
                if(st.isEmpty()) return false;

                char top=st.pop();
                if((top=='(' && ch!=')') ||
                        (top=='{' && ch!='}') ||
                        (top=='[' && ch!=']')){
                             return false;
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size ");
        int size=sc.nextInt();
        String s[]=new String[size];
        for(int i=0;i<s.length;i++){
            s[i]=sc.next();
        }
        for(int i=0;i<s.length;i++){
            System.out.println(check(s[i]));
        }
    }
}
