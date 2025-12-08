public class coinMachine {

    // --- 1. PROPRIEDADES (O que a máquina TEM) ---
    public String coinType;
    public int count = 0;

    // --- 2. COMPORTAMENTOS (O que a máquina FAZ) ---
    
    // Método para receber a moeda
    public void acceptCoin(String type) {
        coinType = type;
        count = count + 1; // Aumenta a contagem
        System.out.println("Moeda recebida: " + type);
    }

    // Método para imprimir o recibo
    public void printReceipt() {
        System.out.println("--- RECIBO ---");
        System.out.println("Total de moedas: " + count);
        System.out.println("--------------");
    }

    // --- 3. MÉTODO MAIN (Onde o programa começa) ---
    public static void main(String[] args) {
        // Cria a máquina (Instância)
        coinMachine minhaMaquina = new coinMachine();
        
        // Testa a máquina chamando os métodos criados acima
        minhaMaquina.acceptCoin("1 Real");
        minhaMaquina.acceptCoin("50 Centavos");
        
        // Imprime o recibo final
        minhaMaquina.printReceipt();
    }
    
} // Fim da classe