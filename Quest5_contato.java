public class Quest5_contato {

    private int numero, recebidas, Nume_naoLidas, nume_enviadas;
    private String nomeContato;
    String[] mensagensNlidas = new String[1000]; String[] mensagem_enviada = new String[1000];
    public Quest5_contato(int numero, String nome){
        this.nomeContato = nome;
        this.numero = numero;
    }
    public void enviar_mensagem (String mensagem){
        this.mensagem_enviada[nume_enviadas] = mensagem;
        this.nume_enviadas++;
    }
    public void men_recebidas(String qual){
        this.mensagensNlidas[this.recebidas] = qual;
        this.recebidas++;
    }
    public void getNume_naoLidas() {
        System.out.println("Quantidade de mensagens não lidas: " + this.recebidas);
    }
    public void mensagensNaoLidas(){
        System.out.println("Mensagens que não foram lidas: ");
        while(this.recebidas > 0){
            System.out.println(this.mensagensNlidas[this.Nume_naoLidas]);
            this.Nume_naoLidas++;
            this.recebidas --;
        }
    }
}