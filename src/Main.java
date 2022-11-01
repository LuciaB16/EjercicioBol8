public class Main {

    final static int CUADRADO = 1;
    final static int TRIANGULO = 2;
    final static int CIRCUNFERENCIA = 3;

    public static void main(String[] args) {


        Funciones misFunciones = new Funciones();
        misFunciones.mostrarMenu();
        int opcion = misFunciones.introducirOpcion();

        int area, lado, altura, base, radio;

        switch (opcion) {
            case CUADRADO:
                lado = misFunciones.introducirNumero();
                area = misFunciones.calcularAreaCuadrado(lado);
                misFunciones.mostrarArea(area);
                break;

            case TRIANGULO:
                altura = misFunciones.introducirNumero();
                base = misFunciones.introducirNumero();
                area = misFunciones.calcularAreaTriangulo(base, altura);
                misFunciones.mostrarArea(area);
                break;

            case CIRCUNFERENCIA:
                radio = misFunciones.introducirNumero();
                area = (int) misFunciones.calcularAreaCircunferencia(radio);
                misFunciones.mostrarArea(area);
                break;

            default:
                misFunciones.mostrarMensaje();
                break;
        }
    }
                }