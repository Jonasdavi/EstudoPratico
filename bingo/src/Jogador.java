import java.util.ArrayList;

public class Jogador{
    private String nome;
    private ArrayList<Cartela> cartelas= new ArrayList<Cartela>();
    private int qtCartelas;
    private boolean ganhou;
    private ArrayList<Cartela> cartelasPremiadas= new ArrayList<Cartela>();


    public Jogador(String nome){
        this.nome=nome;
        qtCartelas=0;
        ganhou= false;
    }

    public void comprarCartelas(int qtCartelas, Bingo bingo){
        this.qtCartelas+=qtCartelas;
        for(int i=0; i<qtCartelas; i++){
            cartelas.add(bingo.venderCartela());
        }
    }

    public void exibirCartelas(){
        for(Cartela cartela : cartelas){
            System.out.println("Jogador: " + nome);
            cartela.exibirCartela();
        }
    }

    public void marcarNumSorteado(int numSorteado){
        for(Cartela cartela : cartelas){
            cartela.temNaCartela(numSorteado);
        }
    }

    public boolean ganhou(){
        boolean ganhou=false;
        for(Cartela cartela : cartelas){
            if(cartela.ganhou()){
                cartelasPremiadas.add(cartela);
                ganhou= true;
            }
        }
        return ganhou;
    }

    public ArrayList<Cartela> getCartelasPremiadas(){
        return cartelasPremiadas;
    }

    public void exibirCartelasPremiadas(){
        for(Cartela cartela : cartelasPremiadas){
            cartela.exibirCartela();
        }
    }
}