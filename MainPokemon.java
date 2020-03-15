import java.util.ArrayList;
import java.util.Scanner;

public class MainPokemon{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        ArrayList <Pokemon> PokemonList = new ArrayList<Pokemon>();
        int n;
        while(true){
            Pokemon.menu();
            n = scn.nextInt();
            System.out.println(n);

            if(n == 1){

                PokemonList.add(new Pokemon());

            }else if(n == 2){

                System.out.println("Pokemon name:");
                String name = scn.next();
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

            }else if(n == 3){
                
                System.out.println("Pokemon name:");
                String name = scn.next();
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
                
            }else if(n == 4){

                for(int i=0;i<PokemonList.size();i++){
                    PokemonList.get(i).showinfo();
                }

            }else if(n == 5){

                break;

            }else{

                System.out.println("ERROR!!!");

            }
            

        }
    }
}