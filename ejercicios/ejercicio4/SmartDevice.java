package ejercicios.ejercicio4;

public class SmartDevice {
    private String marca;
    private String modelo;
    private String color;

    public SmartDevice() {
    }

    public SmartDevice(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public class SmartPhone extends SmartDevice{
        private int memoriaRAM;
        private int mpCamara;
        private int nucleos;

        public SmartPhone() {
        }

        public SmartPhone(String marca, String modelo, String color, int memoriaRAM, int mpCamara, int nucleos) {
            super(marca, modelo, color);
            this.memoriaRAM = memoriaRAM;
            this.mpCamara = mpCamara;
            this.nucleos = nucleos;
        }

        public int getMemoriaRAM() {
            return memoriaRAM;
        }

        public void setMemoriaRAM(int memoriaRAM) {
            this.memoriaRAM = memoriaRAM;
        }

        public int getMpCamara() {
            return mpCamara;
        }

        public void setMpCamara(int mpCamara) {
            this.mpCamara = mpCamara;
        }

        public int getNucleos() {
            return nucleos;
        }

        public void setNucleos(int nucleos) {
            this.nucleos = nucleos;
        }
    }
    public class SmartWatch extends SmartDevice{
        private boolean isSumergible;

        public SmartWatch() {
        }

        public SmartWatch(String marca, String modelo, String color, boolean isSumergible) {
            super(marca, modelo, color);
            this.isSumergible = isSumergible;
        }

        public boolean isSumergible() {
            return isSumergible;
        }

        public void setSumergible(boolean sumergible) {
            isSumergible = sumergible;
        }
    }

}
