package ejercicio2;

public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("El precio con IVA de algo que cuesta 2€ sin él es: "+iva(2));
    }
    public static double iva(double precio){
        return (precio*0.21)+precio;

    }

}
