public class Chickens01{
    public static void main(String [] args){
        //Inicialização das variáveis (Cenário 1)
        int eggsPerChicken = 5;
        int chickenCount = 3;
        int totalEggs =0;
        
        
        // -- Segunda-feira ---
        // Ele recolhe os ovos das galinhas que tem
        totalEggs = totalEggs + (chickenCount * eggsPerChicken);
        
        
        // -- Tera-ferira --
        // Ganha 1 galinha de manhã
        chickenCount = chickenCount +1;
        // Recolhe os ovos ao meio-dia
        totalEggs = totalEggs + (chickenCount * eggsPerChicken);
        
        // -- Quarta-feira --
        // Perde metade dads galinhas de manhã
        chickenCount = chickenCount /2;
        // Recolhe os ovos ao meio-dia
        totalEggs = totalEggs + (chickenCount * eggsPerChicken);
        
        // Imprime o resultado final
        System.out.println("Total de ovos recolhidos: " + totalEggs);
    }
}