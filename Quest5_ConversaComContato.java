public class Quest5_ConversaComContato {

    public static void main(String[] args){
        Quest5_contato Prof = new Quest5_contato(992485746, "Adalberto Duplat");
        Prof.enviar_mensagem("Professor, pode adiar a atividade?");
        Prof.getNume_naoLidas();
        Prof.men_recebidas("Não!");
        Prof.men_recebidas("O prazo era hoje");
        Prof.men_recebidas("E além do mais, todo mundo fez");
        Prof.men_recebidas("Por que não fizeste tu?");
        Prof.men_recebidas("Será reprovada, assim");
        Prof.getNume_naoLidas();
        Prof.mensagensNaoLidas();
        Prof.getNume_naoLidas();
    }
}
