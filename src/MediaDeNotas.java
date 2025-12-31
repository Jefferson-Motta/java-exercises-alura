public class MediaDeNotas {
    public static void main(String[] args) {
    /*Programa declara uma variável tipo char, uma tipo String e concatena em uma mensagem.
    realiza a média de duas notas decimais, faz o casting da variável double para int.
    */
        String nome = ("Jefferson ");
        char sobrenome = 'S';
        double nota1 = 8.4;
        double nota2 = 4.3;
        double notafinal = (nota1 + nota2) /2;
        int media = (int) (notafinal);
        String mesnsagen = String.format (""" 
                 
                 Média de notas
                 Nota 1: %.1f
                 Nota 2: %.1f
                 Nota final: %.1f
                 Média inteira: %d
                 """, nota1, nota2, notafinal,media);

        System.out.println(nome + sobrenome);
        System.out.println(mesnsagen);

    }
}
