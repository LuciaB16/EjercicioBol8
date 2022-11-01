public class Funciones {
    public void mostrarMenu() {
        System.out.println("Muestro menu");
    }

    public int introducirOpcion() {
        //pide opcion al usuario

        return 1;
    }

    public int introducirNumero() {
        //pide numero
        int numero = 5;
        return numero;
    }


    public void mostrarArea(int area) {
        System.out.println(area);
    }

    public int calcularAreaCuadrado(int lado) {
        return lado * lado;
    }

    public int calcularAreaTriangulo(int base, int altura) {
        return base * altura / 2;
    }

    public int calcularAreaCircunferencia(int radio) {
        return (int) (Math.PI * Math.pow(radio, 2));
    }

    public void mostrarMensaje() {
        return;

    }
}

