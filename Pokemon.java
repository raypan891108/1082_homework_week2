import java.util.Scanner;
class Pokemon{
    private String name;
    public int level;
    public String gender;
    public int hp;
    public int attack;
    public static int counts = 0;
    
    Scanner scn  = new Scanner(System.in);

    public static void menu() {
        System.out.println("menu:");
        System.out.println("1: Add new pokemon");
        System.out.println("2: Search pokemon");
        System.out.println("3: Uplevel pokemon");
        System.out.println("4. Rename");
        System.out.println("5: Show pokemon list");
        System.out.println("6: End");
        System.out.print("operations:");
    }

    public Pokemon(){
        setPokemon();
        counts++;
    }

    public void setPokemon(){
        System.out.println("Pokemon name:");
        String newname = scn.nextLine();
        this.name = newname;

        System.out.println("Pokemon level:");
        int newlevel = scn.nextInt();
        this.level = newlevel;

        System.out.println("Pokemon gender:");
        String newgender = scn.next();
        this.gender = newgender;

        System.out.println("Pokemon hp:");
        int newhp = scn.nextInt();
        this.hp = newhp;

        System.out.println("Pokemon attack:");
        int newattack = scn.nextInt();
        this.attack = newattack;
    }

    public String getName(){
        return name;

    }

    public void UpLevel(){
        this.level++;
    }
    public void Rename(String newname){
        this.name = newname;
    }


    public void showinfo(){
        System.out.println("name:" + name);
        System.out.println("level:" + level);
        System.out.println("gender:" + gender);
        System.out.println("hp:" + hp);
        System.out.println("attack:" + attack);
        System.out.println();
    }

}