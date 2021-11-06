public class TesteConexao {
  public static void main(String[] args) {

    try (Conexao conexao = new Conexao()){
      conexao.leDados();
    } catch(Exception exception) {
      System.out.println("Erro na conexão");
    }

    //-------------------------------------

/*     Conexao conexao = null;

    try {
      conexao = new Conexao();
      conexao.leDados();

    } catch (Exception exception) {
    } finally {
        System.err.println("Finally");
        if(conexao != null) {
          conexao.close();
        }
    } */
  }
}
