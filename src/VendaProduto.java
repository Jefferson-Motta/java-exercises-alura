public class VendaProduto {
    static void main(String[] agrs) {
    /*
       O programa declara uma variável double (preçoProduto) e uma variável tipo int (quantidade).
       Calcula o valor de um desconto em reais e aplica ao preço original.
       Multiplica o preço do produto pela quantidade. Realiza a conversão para dólar.
       E apresente o resultado em uma mensagem.
    */

        int quantidade = 20;
        double precoProduto = 100.000;
        double percentualDesconto = 10.0;
        double desconto = (percentualDesconto/100.0) * precoProduto;
        double precoDesconto = precoProduto - desconto;
        double valorTotalreais = (quantidade * precoProduto);
        double valorEmDolar = precoProduto /4.94;

        String mensagem = String.format("""
        Produto X
        
        Quantidade em estoque: %d
        Valor do produto em dolar: U$%.3f
        Valor do produto em reais: R$%.3f
        Porcentagem de desconto: %.0f
        valor com desconto: R$%.3f
        Valor total em estoque: R$%.3f
        
        
        """,quantidade,valorEmDolar,precoProduto,percentualDesconto,precoDesconto,valorTotalreais);

        System.out.println(mensagem);

    }
}