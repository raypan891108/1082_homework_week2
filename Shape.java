import javax.sound.midi.Receiver;

class Shape{
    private String name;
    private float r;
    private float length;
    private float width;
    private float a;
    private float b;
    private double c;
    private int angle;
    public static int counts = 0;
    private double perimeter;
    private double area;

    public Shape(String n){
        counts++;
        System.out.println("created a new shape");
        String array[] = n.split(" ");
        if(array.length == 1){
            SetShape(Float.parseFloat(array[0]));
        }else if(array.length == 2){
            SetShape(Float.parseFloat(array[0]),Float.parseFloat(array[1]));
        }else{
            SetShape(Float.parseFloat(array[0]),Float.parseFloat(array[1]),Integer.parseInt(array[2]));
        }
    }

    // public static void menu(){
    //     System.out.println("menu:");
    //     System.out.println("1.circle");
    //     System.out.println("2.triangle");
    //     System.out.println("3.rectangle");
    //     System.out.println("4.Show all");
    //     System.out.println("5.End");
    //     System.out.println("operation:");
    // }
    public void SetShape(float r){
        this.name = "circle";
        this.r = r;
        this.perimeter = 2 * r * Math.PI;
        this.area = r * r * Math.PI;
    }

    public void SetShape(float length, float width){
        this.name = "triangle";
        this.length = length;
        this.width = width;
        this.perimeter = 2 * (length + width);
        this.area = length * width;
    }

    public void SetShape(float a, float b, int angle){
        this.name = "rectangle";
        this.a = a;
        this.b = b;
        this.angle = angle;
        if(angle == 90){
            this.c = Math.sqrt(a* a + b * b);
            this.perimeter = a + b + c;
            this.area = a * b;
        }else{
            this.c = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(angle));
            this.perimeter = a + b + c;
            double s = this.perimeter / 2.0;
            this.area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        }
    }

    public void showinfo(){
        System.out.println("name:" + name);
        System.out.println("perimeter:" + perimeter);
        System.out.println("area:" + area);
        System.out.println();
        
    }





}