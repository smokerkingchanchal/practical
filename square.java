import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        //area=side*side
        //perimeter=4*side
        Scanner sc=new Scanner(System.in);

        int side=0;
        int area=0;
        int perimeter=0;
        System.out.println("enter the length of the side of a square :");
        side=sc.nextInt();
        area=side*side;
        perimeter=4*side;
        System.out.println("the area of square is:"+area);
        System.out.println("the perimeter of square is:"+perimeter);





    }
}