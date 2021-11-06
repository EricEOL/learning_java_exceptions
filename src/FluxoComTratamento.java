public class FluxoComTratamento {
  public static void main(String[] args) {
    System.out.println("Ini do main");
    try {
      metodo1();
    } catch (Exception exception) {
      System.out.println("Exception: " + exception.getMessage());
      exception.printStackTrace();
    }
    System.out.println("Fim do main");
  }

  private static void metodo1() throws MyException{
    System.out.println("Ini do metodo1");
    metodo2();
    System.out.println("Fim do metodo1");
  }

  private static void metodo2() throws MyException{
    System.out.println("Ini do metodo2");
    for (int i = 1; i <= 5; i++) {
      System.out.println(i);
      Conta c = new Conta();
      c.deposita();
      int a = i / 0;
    }
    System.out.println("Fim do metodo2");
  }
}