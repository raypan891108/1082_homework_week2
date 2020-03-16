import java.util.ArrayList;
import java.util.Scanner;

public class MainPokemon{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        ArrayList <Pokemon> PokemonList = new ArrayList<Pokemon>();
        String n;
        while(true){
            Pokemon.menu();
            n = scn.nextLine();
            System.out.println(n);

            if(n.equals("1")){

                PokemonList.add(new Pokemon());

            }else if(n.equals("2")){

                System.out.println("Pokemon name:");
                String name = scn.nextLine();
                boolean bool = true;
                for(int i=0;i<PokemonList.size();i++){
                    if(PokemonList.get(i).getName().equals(name)){
                        PokemonList.get(i).showinfo();
                        bool = false;
                    }
                }
                if(bool){
                    System.out.println("No Pokemon");
                }

            }else if(n.equals("3")){
                
                System.out.println("Pokemon name:");
                String name = scn.nextLine();
                boolean bool = true;
                for(int i=0;i<PokemonList.size();i++){
                    if(PokemonList.get(i).getName().equals(name)){
                        PokemonList.get(i).UpLevel();
                        bool = false;
                    }
                }
                if(bool){
                    System.out.println("No Pokemon");
                }
                
            }else if(n.equals("4")){
               
                System.out.println("Pokemon name:");
                String name = scn.nextLine();
                System.out.println("Rename:");
                String newname = scn.nextLine();
                boolean bool = true;
                for(int i=0;i<PokemonList.size();i++){
                    if(PokemonList.get(i).getName().equals(name)){
                        PokemonList.get(i).Rename(newname);
                        bool = false;
                    }
                }
                if(bool){
                    System.out.println("No Pokemon");
                }

            }else if(n.equals("5")){

                for(int i=0;i<PokemonList.size();i++){
                    PokemonList.get(i).showinfo();
                }

            }else if(n.equals("6")){

                break;

            }else{

                System.out.println("ERROR!!!");

            }
            

        }
    }
}