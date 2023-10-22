import java.util.Random;

public class MegaSena {
    public static void main(String[] args) {
        Random random = new Random();
        
        System.out.println("Números da Mega-Sena:");
        for (int i = 0; i < 6; i++) {
            int numero = random.nextInt(60) + 1; // Gera um número entre 1 e 60
            System.out.print(numero + " ");
        }
    }
}
