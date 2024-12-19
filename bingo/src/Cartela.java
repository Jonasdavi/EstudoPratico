import java.util.Random;
import java.util.Arrays;

public class Cartela{
    private int cartela[][];
    private int[] coluna0, coluna1, coluna2, coluna3, coluna4; //variaveis para verificar numeros

    private final int TAMANHOLC=5; //tamanho da quantidade de linhas e colunas da cartela

    private Random rand= new Random();

    public Cartela(){
        //inicializando variaveis:
        cartela= new int[TAMANHOLC][TAMANHOLC];
        


    }

    public void criarCartela(){
        //percorrendo o laço de forma que as arrays da matrizes sejam as colunas
        for(int c=0; c<TAMANHOLC; c++){
            for(int l=0; l<TAMANHOLC; l++){
                //para cada coluna, há um intervale de numero diferente

                //coluna 0 (numeros possiveis: 1-15)
                //coluna 1 (numeros possiveis: 16-30)
                //coluna 2 (numeros possiveis: 31-45)
                //coluna 3 (numeros possiveis: 46-60)
                //coluna 4 (numeros possiveis: 61-75)

                int numSorteado;
                do{
                    numSorteado=(rand.nextInt(15)+1) + 15*c; //ajusta o intervalo de numeros possiveis de ser sorteado de acordo com a coluna
                }while(Arrays.asList(cartela[c]).contains(numSorteado)); //verifica se a coluna ja tem o numero sorteado:

                cartela[c][l]=  numSorteado;
                
                
                
            }
        }
        
        for(int c=0; c<TAMANHOLC; c++){
            for(int l=0; l<TAMANHOLC; l++){
                System.out.print(cartela[l][c]+" ");
            }
            System.out.println();
        }
    }

}