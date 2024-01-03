package paquete;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private Scanner sc = new Scanner(System.in);
    private el10 clase10 = new el10();

    public static void menu() {
        System.out.println("1. Ver datos ");
        System.out.println("2. Insertar datos ");
        System.out.println("3. Actualizar datos ");
        System.out.println("4. Eliminar");
        System.out.println("5. Salir");
    }

    public void start() {
        while (true) {
            menu();
            int opc = sc.nextInt();

            switch (opc) {
                case 1:
                    ArrayList<el10> lista = clase10.listaobj();
                    for (el10 arg : lista) {
                        System.out.println(arg);
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el ID:");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el nombre:");
                    String nombre = sc.nextLine();

                    System.out.println("Ingrese el monto:");
                    int monto = sc.nextInt();

                    clase10.insertarDatos(id, nombre, monto);
                    break;
                case 3:
                    System.out.println("Ingrese el ID a modificar:");
                    int ID = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el nombre:");
                    String name = sc.nextLine();

                    System.out.println("Ingrese el monto:");
                    int cant = sc.nextInt();

                    clase10.actualizar(ID, name, cant);
                    break;
                case 4:
                    System.out.println("ID de usuario a eliminar");
                    int userID = sc.nextInt();
                    clase10.eliminacion(userID);
                    break;
                case 5:
                    System.out.println("Saliendo....");
                    System.exit(0); // Salir del sorware
                default:
                    System.out.println("Opción invalidada");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }
}
