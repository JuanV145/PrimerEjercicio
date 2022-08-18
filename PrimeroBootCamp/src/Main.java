public class Main {
    public static void main(String[] args) {

        int sumaTres = suma(11, 22, 33);
        System.out.println("La suma de 3 numeros es: " + sumaTres);

        Coche coche = new Coche();
        coche.addPuertas();
        System.out.println("La cantidad de puertas es: " + coche.nPuertas);

    }
    public static int suma(int a, int b, int c) {
        return (a + b + c);
    }
}
class Coche {

    public int nPuertas = 0;

    public void addPuertas() {
        this.nPuertas++;
    }


}
