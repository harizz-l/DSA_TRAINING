import java.util.*;
class stack{
    int arr[]=new int[5];
    int index=-1;
    void push(int data){
        if(index== arr.length-1) System.out.println("Stack FULL");
        else {
            index++;
            arr[index] = data;
        }
    }
    void pop(){
        if(index==-1) System.out.println("Stack EMPTY");
        else {
            int temp = arr[index];
            index--;
            temp = 0;
        }
    }
    void display() {
        if (index == -1) System.out.println("NO ELEMENTS");
        else {
            System.out.print("Display : ");
            for (int i = 0; i <= index; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack s = new stack();
        int x;
        do{
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Display");
            System.out.println("Any other choice : Exit");
            x=sc.nextInt();
            switch (x){
                case 1:
                    System.out.println("Enter a Number to PUSH");
                    int n=sc.nextInt();
                    s.push(n);
                    break;
                case 2:
                   s.pop();
                    break;
                case 3:
                    s.display();
                    break;

                    default:
                        System.out.println("Exit");
            }
        }while (x!=4);
    }
}
