public class formatadorCep {
  public static void main(String[] args) {
    try {
      String cepFormatado = formatadorCep("2376506");
      System.out.println(cepFormatado);
    } catch (CepInvalidoException e) {
      System.out.println("o cep não coresponde com as regras de negocio");
      // TODO Auto-generated catch block
     
    }
  }
    static String formatadorCep(String cep) throws CepInvalidoException{
    if(cep.length() != 8) 
    throw new CepInvalidoException();


    return "23.765-064";
  }
}
