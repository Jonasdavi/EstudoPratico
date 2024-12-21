import java.util.ArrayList;
import java.util.Random;

public class Bingo{
    private ArrayList<Cartela> cartelasVendidas= new ArrayList<Cartela>();
    private ArrayList<Integer> numsSorteados= new ArrayList<Integer>();
    private ArrayList<Jogador> jogadores= new ArrayList<Jogador>();
    private ArrayList<Jogador> ganhadores= new ArrayList<Jogador>();

    Random rand= new Random();


    
    public void addJogador(Jogador j){
        jogadores.add(j);
    }

    public Cartela venderCartela(){
        Cartela c= new Cartela();
        c.sortearNumsCartela();
        boolean cartelaRepetida= false;

        do{ //faça isso enquanto a cartela for repetida
            c.sortearNumsCartela();
            for (Cartela cartelas : cartelasVendidas) {
                if(c.equals(cartelas)){
                    cartelaRepetida=true;
                    break;
                }
            }
            cartelaRepetida=false;
        }while(cartelaRepetida); //laço para rodar enquanto a cartela criada for repetida as quais já foram vendidas

        return c;
    }

    public int sortearNum(){
        Integer numSorteado;

        do { 
            numSorteado= rand.nextInt(74)+1;
        } while (numsSorteados.contains(numSorteado));

        numsSorteados.add(numSorteado);
        return numSorteado;
        
    }


    public ArrayList<Integer> getNumsSorteados(){
        return numsSorteados;
    }

    public void addGanhador(Jogador ganhador){
        ganhadores.add(ganhador);
    }

    public ArrayList<Jogador> getGanhadores(){
        return ganhadores;
    }
}