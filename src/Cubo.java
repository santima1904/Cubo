public class Cubo {
    //Atributos
    private String material;
    private boolean asa;
    private int capacidadMax;
    private int capacidadActual;
    private String color;

    //Métodos
    public Cubo() {
        material = "plastico";
        asa = false;
        color = "negro";
        capacidadMax = 10;
        capacidadActual = 0;
    }

    public Cubo(String material, boolean asa, String color, int capacidadActual, int capacidadMax) {
        this.material = material;
        this.asa = asa;
        this.color = color;
        this.capacidadActual = capacidadActual;
        this.capacidadMax = capacidadMax;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setAsa(boolean material) {
        this.asa = asa;
    }

    public boolean getAsa() {
        return this.asa;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public int getCapacidadMax() {
        return this.capacidadMax;
    }

    public void setCapacidadActual(int capacidadActual) {
        if (capacidadActual <= capacidadMax) {
            this.capacidadActual = capacidadActual;
        }
    }

    public int getCapacidadActual() {
        return this.capacidadActual;
    }

    public void llenar(int litrosLlenar) {
        capacidadActual = capacidadActual + litrosLlenar;
        if (capacidadActual <= capacidadMax) {
            System.out.println("Volumen ocupado: " + capacidadActual);
        } else {
            System.out.println("Se ha desbordado el cubo");
        }
    }

    public void vaciar(int litrosVaciar) {
        capacidadActual = capacidadActual - litrosVaciar;
        if (capacidadActual > 0) {
            System.out.println("Volumen ocupado: " + capacidadActual);
        } else {
            System.out.println("El cubo está vacío");
        }
    }

    public void pintar() {

    }
}



