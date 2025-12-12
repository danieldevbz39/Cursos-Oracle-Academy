
public class Customer {

    // -- CAMPOS (Propriedades) ---
    // Atributos definidos
    public String name = "Junior Duke";
    public int custId = 1205;
    public String address;
    public int orderNum;
    public int age;

    // -- MÉTODOS (Comportamento) -- 
    // Método para exibir o cliente
    public void displayCustomer() {
        System.out.println("Cliente: " + name);
        System.out.println("ID do Cliente: " + custId);
    }
    // -- MÉTODO MAIN (Para testar o código) ---

    public static void main(String[] args) {

        // Criando uma "instância" (um objeto real) do mold Customer
        Customer cliente1 = new Customer();

        // Chamando o comportamento do objeto
        cliente1.displayCustomer();
    }

}
