import java.util.ArrayList;
import java.util.Scanner;
public class MainShape{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        ArrayList <Shape> ShapeList = new ArrayList <Shape>();
        // float r;
        // float length;
        // float width;
        // float a;
        // float b;
        // int angle;
        // int operation;
        String n;
        while(true){
            // Shape.menu();
            // operation = scn.nextInt();
            n = scn.nextLine();
            String tmp = "show";
            if(n.equals("-1")){
                break;
            }else if(n.equals("show")){
                System.out.println("total:" + Shape.counts + "\n");
                for(int i=0;i<ShapeList.size();i++){
                    ShapeList.get(i).showinfo();
                }
            }else{
                ShapeList.add(new Shape(n));
            }
        }
    }
}