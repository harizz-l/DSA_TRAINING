import java.util.*;
class stack{
    int arr[];
    int index=-1;
    stack(int size){
        arr=new int[size];
    }
    void push(int data){
        if(index== arr.length-1) System.out.println("Stack FULL");
        else {
            index++;
            arr[index] = data;
        }
    }
    int pop(){
        int temp=0;
        if(index==-1) System.out.println("Stack EMPTY");
        else {
             temp = arr[index];
            index--;
        }
        return temp;
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
        System.out.print("Enter Size of Stack : ");
        int size=sc.nextInt();
        stack s1 = new stack(size);
        stack s2 = new stack(size);
        int x;
        do{
            System.out.println("1.Push 1");
            System.out.println("2.Push 2");
            System.out.println("3.Pop 1");
            System.out.println("4.Pop 2");
            System.out.println("5.Display 1");
            System.out.println("6.Display 2");
            System.out.println("Any other choice : Exit");
            x=sc.nextInt();
            switch (x){
                case 1:
                    System.out.println("Enter a Number to PUSH");
                    int n=sc.nextInt();
                    s1.push(n);
                    break;
                case 2:
                    System.out.println("Enter a Number to PUSH");
                    int m=sc.nextInt();
                    s2.push(m);
                    break;
                case 3:
                    System.out.println("Element Removed From Stack 1 -> "+ s1.pop());
                    break;
                case 4:
                    System.out.println("Element Removed From Stack 1 -> "+ s2.pop());
                    break;
                case 5:
                    s1.display();
                    break;
                case 6:
                    s2.display();
                    break;

                default:
                    System.out.println("Exit");
            }
        }while (x>6);
    }
}
