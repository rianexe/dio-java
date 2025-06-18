public class App {
    public static void main(String[] args) throws Exception {

        Funcionario funcionario = new Funcionario();

        //Upcast
        Funcionario gerente = new Gerente();        //Não precisa "explicar", já que a classe Gerente já é filha de Funcionario
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Downcast
        Vendedor vendedor_ = (Vendedor) new Funcionario();      //Pegando a classe mãe e especificando para qual filha tornará
        //Gerente gerente_ = new Funcionario();         errado!
    }
}
