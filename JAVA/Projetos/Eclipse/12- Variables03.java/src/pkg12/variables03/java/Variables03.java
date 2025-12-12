// Define o "pacote" (a pasta) onde seu arquivo está. Isso ajuda o Java a se organizar.
// Nota: O nome exato aqui depende da estrutura de pastas que você criou no NetBeans.
package pkg12.variables03.java; 

// Declaração da Classe. Em Java, tudo acontece dentro de uma classe.
// Regra de ouro: O nome "Variables03" aqui DEVE ser igual ao nome do arquivo (Variables03.java).
public class Variables03 { 

    // Este é o método "main" (principal). É o ponto de partida.
    // Quando você dá o "Play", o Java procura essa linha específica para começar a executar.
    public static void main(String[] args) { 

        // --- PARTE 1: DECLARAÇÃO DE VARIÁVEIS ---
        
        // Tipo boolean: Só aceita 'true' (verdadeiro) ou 'false' (falso).
        // Erro comum corrigido: Não existe "bool" no Java, o nome certo é "boolean".
        boolean bool = true; 

        // Tipo int: Armazena números inteiros (sem casas decimais).
        int intVar1 = 1; 
        int intVar2 = 2; 
        int intVar3 = 3; 

        // Tipo double: Armazena números com ponto flutuante (casas decimais).
        // Atenção: Em programação, usamos PONTO (.) para separar decimais, nunca vírgula.
        double doubleVar1 = 1.1; 
        double doubleVar2 = 2.1; 
        double doubleVar3 = 3.1; 
        double doubleVar4 = 4.1; 

        // Tipo String: Armazena TEXTO. 
        // Regra 1: "String" começa com letra Maiúscula (é uma Classe, não um tipo primitivo).
        // Regra 2: O valor do texto deve estar sempre entre aspas duplas (" ").
        String stringVar1 = "11"; 
        String stringVar2 = "22"; 

        // --- PARTE 2: SAÍDA DE DADOS (MOSTRAR NA TELA) ---

        // System.out.println: Comando para imprimir uma linha no console de saída.
        // O operador "+" aqui não é soma, é CONCATENAÇÃO (juntar texto com variável).
        
        System.out.println("bool = " + bool);            // Escreve o texto "bool = " e junta com o valor true.
        System.out.println("intVar1 = " + intVar1);      // Escreve "intVar1 = " e junta com o número 1.
        System.out.println("intVar2 = " + intVar2);      // Escreve "intVar2 = " e junta com o número 2.
        System.out.println("intVar3 = " + intVar3);      // Escreve "intVar3 = " e junta com o número 3.
        
        System.out.println("doubleVar1 = " + doubleVar1); // Mostra o decimal 1.1
        System.out.println("doubleVar2 = " + doubleVar2); // Mostra o decimal 2.1
        System.out.println("doubleVar3 = " + doubleVar3); // Mostra o decimal 3.1
        System.out.println("doubleVar4 = " + doubleVar4); // Mostra o decimal 4.1
        
        System.out.println("stringVar1 = " + stringVar1); // Mostra o texto "11"
        System.out.println("stringVar2 = " + stringVar2); // Mostra o texto "22"

    } // Fecha a chave do método main. O programa termina aqui.
} // Fecha a chave da classe Variables03.