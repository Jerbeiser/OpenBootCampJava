package ejercicios.ejercicio4;

public class Main {
    public static void main(String[] args) {
        SmartDevice.SmartPhone smartPhone = new SmartDevice().new SmartPhone("Xiaomi","Pocophone", "Azul", 16, 108, 8);
        SmartDevice.SmartWatch smartWatch = new SmartDevice().new SmartWatch("Xiaomi", "miBand4", "Verde", true);

        System.out.println("Las características del SmartPhone son:\n- Marca: "+ smartPhone.getMarca() + "\n- Modelo: "+smartPhone.getModelo()+"\n- Color: "+smartPhone.getColor()
                            +"\n- RAM: "+smartPhone.getMemoriaRAM()+"\n- Megapixeles cámara: "+smartPhone.getMpCamara()+"\n- Nucleos procesador: "+smartPhone.getNucleos());
        System.out.println("Las características del SmartWatch son:\n- Marca: "+smartWatch.getMarca() + "\n- Modelo: "+smartWatch.getModelo()+"\n- Color: "+smartWatch.getColor()
                            +"\n- Es sumergible: "+smartWatch.isSumergible());

    }
}
