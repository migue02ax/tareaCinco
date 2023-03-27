package tareacinco;

public class tareaCinco {
    int agua;
    int cafe;
    int crema;
    int vasos;

    public tareaCinco() {
        agua = 5000;
        cafe = 1000;
        crema = 1500;
        vasos = 50;
    }

    public void servirAmericano() {
        if (agua >= 180 && cafe >= 15 && vasos > 0) {
            agua -= 180;
            cafe -= 15;
            vasos--;
            System.out.println("Su Cafe americano servido");
        } else {
            System.out.println("No se puede servir el cafe americano. Cheque los recursos.");
        }
    }

    public void servirExpreso() {
        if (agua >= 120 && cafe >= 20 && vasos > 0) {
            agua -= 120;
            cafe -= 20;
            vasos--;
            System.out.println("Su cafe expreso servido");
        } else {
            System.out.println("No se puede servir el cafe expreso. Cheque los recursos.");
        }
    }

    public void servirCapuchino() {
        if (agua >= 100 && cafe >= 14 && crema >= 70 && vasos > 0) {
            agua -= 100;
            cafe -= 14;
            crema -= 70;
            vasos--;
            System.out.println("Capuchino servido.");
        } else {
            System.out.println("No se puede servir capuchino. Cheque los recursos.");
        }
    }

    public void estadoRecursos() {
        System.out.println("Recursos actuales:");
        System.out.println("Agua: " + agua + " ml");
        System.out.println("Café: " + cafe + " g");
        System.out.println("Crema: " + crema + " ml");
        System.out.println("Vasos: " + vasos);
    }
}
