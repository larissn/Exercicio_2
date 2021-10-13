public class Quest4_ECommerce {
    public static void main(String[] args){
        Quest4_Produto_Ecommerce P1 = new Quest4_Produto_Ecommerce("Macarrão", 10, 11);
        System.out.println("Produto: "+P1.getNomeProduto());
        System.out.println("Preco: "+P1.getPrecoProduto());
        P1.ComprarProduto(1);
        System.out.println("Quantidade em estoque: "+P1.getQuantidadeProduto());
        P1.ComprarProduto(1);
        System.out.println("Quantidade em estoque: "+P1.getQuantidadeProduto());
        P1.ComprarProduto(9);
        System.out.println("Quantidade em estoque: "+P1.getQuantidadeProduto());
    }
}
