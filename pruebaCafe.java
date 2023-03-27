package tareacinco;

import java.util.Scanner;

public class pruebaCafe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tareaCinco maquina = new tareaCinco();
        maquina.estadoRecursos(); 

        boolean detener = false;
        while (!detener && maquina.vasos > 0 && (maquina.agua >= 180 || maquina.cafe >= 20 || maquina.crema >= 70)) {
            System.out.println("Seleccione que cafe quiere:");
            System.out.println("1. Cafe americano");
            System.out.println("2. Cafe expreso");
            System.out.println("3. Capuchino");
            System.out.println("4. Detener maquina");

            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    maquina.servirAmericano();
                    break;
                case 2:
                    maquina.servirExpreso();
                    break;
                case 3:
                    maquina.servirCapuchino();
                    break;
                case 4:
                    detener = true;
                    break;
                default:
                    System.out.println("Opción no valida. Seleccione una opción válida.");
                    break;
            }

            if (!detener) {
                maquina.estadoRecursos(); 
                if (maquina.vasos == 0 || (maquina.agua < 180 && maquina.cafe < 20 && maquina.crema < 70)) {
                    System.out.println("No existen los recursos suficientes para dicha accion");
                    detener = true;
                }
            }
        }
    }
}
