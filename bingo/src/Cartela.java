import java.util.Random;
import java.util.Arrays;

public class Cartela{
    private int cartela[][];
    private Integer[][] colunas; // para certificar que as colunas nao tenham numeros repetidos (Integer porque vou usar o metodo asList da classe Arrays que aceita apenas objetos)

    private final int TAMANHOLC=5; //tamanho da quantidade de linhas e colunas da cartela
    private final int LUGARFREE=0;

    private Random rand= new Random();

    public Cartela(){
        //inicializando variaveis:
        cartela= new int[TAMANHOLC][TAMANHOLC];
        colunas= new Integer[TAMANHOLC][TAMANHOLC];


    }


    public void sortearNumsCartela(){
        //zerar numeros anteriores das colunas (para nao quebrar a verificaçao dos numeros repetidos)
        for(int c=0; c<TAMANHOLC; c++){
            for(int n=0; n<TAMANHOLC; n++){
                colunas[c][n]=0;
            }
        }

        //percorrendo o laço de forma que as arrays da matrizes sejam as colunas
        for(int l=0; l<TAMANHOLC; l++){
            for(int c=0; c<TAMANHOLC; c++){
                //para cada coluna, há um intervale de numero diferente

                //coluna 0 (numeros possiveis: 1-15)
                //coluna 1 (numeros possiveis: 16-30)
                //coluna 2 (numeros possiveis: 31-45)
                //coluna 3 (numeros possiveis: 46-60)
                //coluna 4 (numeros possiveis: 61-75)

                int numSorteado;
                do{
                    numSorteado=(rand.nextInt(6)+1) + 15*c; //ajusta o intervalo de numeros possiveis de ser sorteado de acordo com a coluna
                }while(Arrays.asList(colunas[c]).contains(numSorteado)); //verifica se a coluna ja tem o numero sorteado:

                colunas[c][l]=numSorteado; //adicionando o numero sorteado a sua respectiva coluna

                cartela[l][c]=  numSorteado; //adicionando numero a cartela
            }
        }
        //retirando o numero do meio da cartela por ele ser "free"
        cartela[2][2]= LUGARFREE;
        colunas[2][2]= LUGARFREE;

        
        
        
    }

    public void exibirCartela(){
        for(int l=0; l<TAMANHOLC; l++){
            for(int c=0; c<TAMANHOLC; c++){
                System.out.print(cartela[l][c]+ (cartela[l][c]<=9?"   ":"  "));
            }
            System.out.println();

        }
        System.out.println();
    }


    @Override
    public boolean equals(Object o){
        Integer[][] colunas= ((Cartela) o).getColunas();

        for(int col=0; col<TAMANHOLC; col++){
            for(int n=0; n<TAMANHOLC; n++){
                if(Arrays.asList(colunas[col]).contains(this.colunas[col][n])){
                    continue;
                }
                else{
                    return false;
                }
            }
        }

        return true;
    }

    public int[][] getCartela(){
        return cartela;
    }
    public Integer[][] getColunas(){
        return colunas;
    }
}