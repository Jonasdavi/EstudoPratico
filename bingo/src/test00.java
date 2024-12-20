import java.util.Random;
public class test00 {
    public static void main(String[] args) throws Exception {
        Cartela c= new Cartela();
        Cartela c2=new Cartela();

        c.sortearNumsCartela();
        c2.sortearNumsCartela();
        c.exibirCartela();
        System.out.println();
        c2.exibirCartela();

        System.out.println(c2.equals(c));

        while(true){
            if(c.equals(c2)){
                System.out.println("igual");
                break;
            }
            else{
                System.out.println("nao igual");
                c2.sortearNumsCartela();
                break;
            }
        }
        
    }
}
