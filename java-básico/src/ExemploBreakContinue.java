public class ExemploBreakContinue {

    public static void main(String[] args) {
        
        for (int i=0; i <=5; i++){
            if(i == 3)
                continue;
                //retorna à ao inicio da iteração
            System.out.println(i);
        }
    }
}