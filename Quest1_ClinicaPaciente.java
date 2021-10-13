public class Quest1_ClinicaPaciente {

    public static void main(String[] args){

        Quest1_Paciente paciente_1 = new Quest1_Paciente("LARISSA SILVA NUNES", 11, "22/08/2004", "Feminina", "Nenhuma", "Nenhum", "O+");
        System.out.println("Codigo: "+paciente_1.getCodigo());
        System.out.println("Nome: "+ paciente_1.getNome());
        System.out.println("Data de Nascimento: "+ paciente_1.getDataNascimento());
        System.out.println("Sexo: "+ paciente_1.getSexo());
        System.out.println("Plano de saude: "+ paciente_1.getPlanoSaude());
        System.out.println("Alergia: "+ paciente_1.getAlergia());
        System.out.println("Tipo Sanguíneo: "+ paciente_1.getTipoSanguineo());
        paciente_1.setNome("MARINALVA SILVA FERNANDES");
        paciente_1.setDataNascimento("22/01/1978");
        paciente_1.setSexo("Feminino");
        paciente_1.setAlergia("Pólem");
        paciente_1.setPlanoSaude("Avancado");
        paciente_1.setTipoSanguineo("B-");
        paciente_1.setCodigo(90);
        System.out.println(" ");
        System.out.println("Codigo: "+paciente_1.getCodigo());
        System.out.println("Nome: "+ paciente_1.getNome());
        System.out.println("Data de Nascimento: "+ paciente_1.getDataNascimento());
        System.out.println("Sexo: "+ paciente_1.getSexo());
        System.out.println("Plano de saude: "+ paciente_1.getPlanoSaude());
        System.out.println("Alergia: "+ paciente_1.getAlergia());
        System.out.println("Tipo Sanguíneo: "+ paciente_1.getTipoSanguineo());
    }
}
