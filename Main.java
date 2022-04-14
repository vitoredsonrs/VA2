class Main {
  public static void main(String[] args){

  Ala ala1 = new Ala(1,"Ala Gripe");
  Ala ala2 = new Ala(1,"Ala Covid");

  Quarto quarto1 = new Quarto(01);
  Quarto quarto2 = new Quarto(02);

  Paciente paciente1 = new Paciente("João",10, "Gripe");
  Paciente paciente2 = new Paciente("Paulo",14, "Covid");
  Paciente paciente3 = new Paciente("Gloria",2, "Gripe");
  Paciente paciente4 = new Paciente("Emilia",3, "Gripe");

  System.out.println("Relatório " + paciente1.relatorioPaciente);  
  System.out.println("Relatório " + paciente2.relatorioPaciente);  
    
  System.out.println("Ala " + ala1.exibirRelatorio);  

  }  
}