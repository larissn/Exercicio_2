public class Quest2_Postagem_facebook {
    public static void main(String[] args){
        Quest2_Postagem amazonia = new Quest2_Postagem("'Salve-me', disse a amazonia", "https://www.instagram.com");
        amazonia.Dar_curtida();
        amazonia.Dar_curtida();
        amazonia.Dar_curtida();
        System.out.println("Quantidade de curtidas: "+amazonia.getNumeroCurtidas());
        amazonia.compartilhar();
        amazonia.compartilhar();
        System.out.println("Quantidade de compartilhamentos: "+amazonia.getNumeroCompartilhamento());
    }
}
