class Paciente{
  String nome, relatorioPaciente, diagnostico;
  int diasInternado;

  Medico medico = new Medico("Getulio");

  Paciente(String nome, int diasInternado, String diagnostico){
    this.nome = nome;
    this.diasInternado = diasInternado;
    this.diagnostico = diagnostico;
    
  }
  String relatorio(){
    String relatorioPaciente = "Nome: "+nome+ " Dias internado: " + diasInternado + " Diagnóstico: "+ diagnostico;
    return relatorioPaciente;
  }
}