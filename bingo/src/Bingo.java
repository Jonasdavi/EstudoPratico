import java.util.ArrayList;

public class Bingo{
    private ArrayList<Cartela> cartelasVendidas= new ArrayList<Cartela>();
    private ArrayList<Integer> numsSorteados= new ArrayList<Integer>();



    public Cartela venderCartela(){
        Cartela c= new Cartela();
        c.sortearNumsCartela();
        boolean cartelaRepetida= false;

        do{
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

    public ArrayList<Integer> getNumsSorteados(){
        return numsSorteados;
    }
}