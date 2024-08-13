//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
class MyClass{
    public static void main(String[] args) {
        double width;
        double length;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter Width: ");
        width = myScanner.nextInt();
        System.out.println("Enter Length: ");
        length = myScanner.nextInt();
        double area = width * length;
        double peri = (width * 2) + (length * 2);
        if(length == width)
        {
            System.out.println("Square Width is: " + width);
        System.out.println("Square Length is: " + length);
        System.out.println("Square Area is: " + area);
        System.out.println("Square Perimiter is: " + peri);
        }
        else
        {
        System.out.println("Rectangle Width is: " + width);
        System.out.println("Rectangle Length is: " + length);
        System.out.println("Rectangle Area is: " + area);
        System.out.println("Rectangle Perimiter is: " + peri);   
    }
    }
}



//Paste console output below:
/*
Rectangle Width is: 126.0
Rectangle Length is: 6423.0
Rectangle Area is: 809298.0
Rectangle Perimiter is: 13098.0

Square Width is: 156.0
Square Length is: 156.0
Square Area is: 24336.0
Square Perimiter is: 624.0

*/
