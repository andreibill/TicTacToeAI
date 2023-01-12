import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true){
            System.out.println("Input command: ");
            String input = scanner.nextLine().toLowerCase().trim();
            if(input.equals("exit")) break;
            if(!input.matches("start\\s+(easy|user|medium|hard)\\s+(easy|user|medium|hard)")){
                System.out.println("Bad parameters");
                continue;
            }
            String[] command = input.split(" ");
            Player[] players = {Player.getPlayer(command[1]), Player.getPlayer(command[2])};
        }
    }
}