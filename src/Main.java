public class Main {

    public static void suma ( int num1, int num2, int num3 ) {
        int resultado = num1 + num2 + num3;
       System.out.println(resultado);
    }

    public static class Coche {
        static int numPuertas = 4;
        void addPuertas ( int numPuertas ){
            System.out.println("el numero de puertas del coche son " +Coche.numPuertas);
        }
    }


    public static void main(String[] args) {
        suma(10,20,30);
       Coche miCoche = new Coche();
        miCoche.addPuertas(1);
    }
}