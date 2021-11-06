public class TestaContaComCheckedException {
  public static void main(String[] args) {
    Conta c = new Conta();
    try {
      c.deposita();
    } catch(MyException exception) {
      System.out.println(exception);
    }
  }
}
