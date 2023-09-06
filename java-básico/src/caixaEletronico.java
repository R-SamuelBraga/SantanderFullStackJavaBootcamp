public class caixaEletronico {
    public static void main(String[] args){
        double saldo = 25.0;
        double valorSolicitado = 26.0;

        if(valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;
        else
            System.out.println("O valor que deseja sacar é maior que o seu saldo bancário");
        System.out.println(saldo);
    }
}
