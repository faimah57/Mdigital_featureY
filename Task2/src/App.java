import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        System.out.print("Hello User, this Program Will Take Two Numbers to Print the Maximum\nPlease Enter the First Number: ");
        double x=input.nextDouble();
        System.out.print("Now Enter the Second Number: ");
        double y=input.nextDouble();
        if(x>y){
            System.out.println("The First Number "+x+" Is the Maximum");
        } else if (x<y){
            System.out.println("The Second Number "+y+" Is the Maximum");
        } else {
            System.out.println("Both Number are Equal to Each Other, Please Try Again");
        }
    }
}
