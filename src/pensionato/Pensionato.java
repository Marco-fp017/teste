package pensionato;

import java.text.ParseException;

import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) throws ParseException{
        Rooms[] vect = new Rooms[10];
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insira o numero de estudantes que vão alugar os quartos: ");
        int nEstudantes = sc.nextInt();
        
        for(int i = 0; i < nEstudantes; i++){
            sc.nextLine();
            System.out.print("Informe o nome do estudante: ");
            String name = sc.nextLine();
            System.out.print("Informe o email do estudante: ");
            String email = sc.nextLine();
            System.out.print("Informe o numero do quarto escolhido: ");
            int room = sc.nextInt();
            
            vect[room] = new Rooms(name, email);
        }
        int cont = 0;
        for(int j = 0; j < vect.length; j++){
            if(vect[j] == null) continue;
            else{
                cont++;
                System.out.println("Rent #" + cont + ":");
                System.out.println("Name: " + vect[j].getName());
                System.out.println("Email: " + vect[j].getEmail());
                System.out.println("Room: " + j);
            }
        }
        
        System.out.println("Busy Rooms: ");
        //for (int )
    }
    
}
