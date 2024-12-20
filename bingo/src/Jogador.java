import java.util.ArrayList;

public class Jogador{
    private String nome;
    private ArrayList<Cartela> cartelas= new ArrayList<Cartela>();
    private int qtCartelas;


    public Jogador(){
        qtCartelas=0;
    }

    public void comprarCartelas(int qtCartelas, Bingo bingo){
        this.qtCartelas+=qtCartelas;
        for(int i=0; i<qtCartelas; i++){
            cartelas.add(bingo.venderCartela());
        }
    }

    public void exibirCartelas(){
        for(Cartela cartela : cartelas){
            cartela.exibirCartela();
            System.out.println();
        }
    }
}