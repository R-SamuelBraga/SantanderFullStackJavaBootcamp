public class ExemploFor {
    public static void main(String[] args){

        String alunos [] = {"carlos", "felipe", "renan", "samuel"};

        for (int i = 0; i < alunos.length; i++){
            System.out.println(alunos[i]);
        }

        for(String aluno : alunos){
            System.out.println(aluno);
        }
    }
}
