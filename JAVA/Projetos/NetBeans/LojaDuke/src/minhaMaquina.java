/**
 *
 * @author NOTEBOOKDELL
 */
class CoinMachine {

    // Método para aceitar moedas em reais
    public void acceptCoin(String real) {
        System.out.println("Moeda recebida: " + real);
    }

    // Método para aceitar moedas em centavos
    public void acceptCentavos(String centavos) {
        System.out.println("Moeda recebida: " + centavos);
    }

    // Método para imprimir recibo
    public void printReceipt() {
        System.out.println("Recibo impresso!");
    }

    // Método principal para testar
    public static void main(String[] args) {
        // Cria a máquina
        CoinMachine minhaMaquina = new CoinMachine();

        // Testa os métodos
        minhaMaquina.acceptCoin("1 Real");
        minhaMaquina.acceptCentavos("50 Centavos");
        minhaMaquina.printReceipt();
    }
}