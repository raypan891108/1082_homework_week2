import java.util.ArrayList;
import java.util.Scanner;
public class MainShape{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        ArrayList <Shape> ShapeList = new ArrayList <Shape>();
        String n;
        while(true){
            n = scn.nextLine();
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