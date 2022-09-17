package ejercicios;

public class Ejercicio3 {
    public static void main(String[] args) {
        String [] cadenas = {"hola", "que", "tal", "?"};
        unirCadenas(cadenas);

    }

    public static void unirCadenas(String[] cadenas){
        String union = "";
        for(int i =0; i<cadenas.length; i++){
            union += cadenas[i];
        }
        System.out.println(union);
    }
}
