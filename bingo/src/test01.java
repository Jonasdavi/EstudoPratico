public class test01 {
    public static void main(String[] args) throws Exception {
        Bingo bingo= new Bingo();
        Jogador j1= new Jogador();

        Cartela c=new Cartela();
        c.sortearNumsCartela();
        
        c.exibirCartela();
        for(int i=1; i<76; i++){
            c.temNaCartela(i);
        }
       
        c.exibirCartela();
    }
}
