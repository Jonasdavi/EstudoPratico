public class test01 {
    public static void main(String[] args) throws Exception {
        Bingo bingo= new Bingo();
        Jogador j1= new Jogador("Jonas");
        bingo.addJogador(j1);
        j1.comprarCartelas(3, bingo);
        
        do { 
            j1.marcarNumSorteado(bingo.sortearNum());
        } while (!j1.ganhou()); //rode enquanto o o jogador 1 nao ganhou
        bingo.addGanhador(j1);
       
        for(Jogador ganhador: bingo.getGanhadores()){
            ganhador.exibirCartelasPremiadas();
        }
    }
}
