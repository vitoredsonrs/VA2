class Ala{
  int id;
  String especialidade, exibirRelatorio, relatorio;
  
  Ala( int id, String especialidade){
    this.id = id;
    this.especialidade = especialidade;
  }
  String relatorio(){
    String exibirRelatorio = "Id: "+id+"Especialidade: "+especialidade;
    return exibirRelatorio; 
  }
}