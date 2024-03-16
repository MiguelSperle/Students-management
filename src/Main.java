import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static String name;
    private static int age;
    private static String course;

    public static void main(String[] args) {
        ArrayList<Student> studentArray = new ArrayList<Student>();

        System.out.println("Sistema de Gerenciamento");

        System.out.print("Escolha uma das opções disponiveis: ");

        System.out.println("1 -> Adicionar um novo usuário");

        int choice;

        Scanner scanner = new Scanner(System.in);

        choice = scanner.nextInt();
        scanner.nextLine();

        boolean addOtherStudent = true;

            while (addOtherStudent) {
                if(choice == 1){
                    System.out.print("Coloque o nome completo do estudante:  ");
                    Main.name = scanner.nextLine();

                    System.out.print("Coloque a idade do estudante: ");
                    Main.age = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Coloque o curso que o estudante vai fazer: ");
                    Main.course = scanner.nextLine();

                    Student newStudent = new Student(name, age, course);
                    studentArray.add(newStudent);

                    System.out.print("Deseja adicionar outro estudante? (S -> Sim /N -> Não /V -> Ver): ");

                    String againOrNot;

                    againOrNot = scanner.nextLine();

                    if (!againOrNot.equalsIgnoreCase("S")) {
                        if(againOrNot.equalsIgnoreCase("N")){
                            addOtherStudent = false;
                        } else if(againOrNot.equalsIgnoreCase("V")){
                            System.out.println("Foram adicionados " + studentArray);
                            System.out.print("Gostaria de adicionar mais ? (S -> Sim /N -> Não)");

                            againOrNot = scanner.nextLine();

                            if(!againOrNot.equalsIgnoreCase("S")){
                                addOtherStudent = false;
                            }
                        } else {
                            System.out.println("Você colocou um comando desconhecido");
                            addOtherStudent = false;
                        }
                    }
                } else if (choice == 2){
                    System.out.println(studentArray.get(0));
                }
            }
    }
}