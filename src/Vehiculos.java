public class Vehiculos {
    String modelo;
    int anio;
    String color;
    String tipo_aros;
    String placa;

    //constructor
    public Vehiculos(String modelo, int anio, String color) {
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
    }

    //Crear un constructor solo para imprimir modelo
    public Vehiculos(String modelo) {
        this.modelo = modelo;
    }

    //Constructor 5 atributos
    public Vehiculos(String modelo, int anio, String color, String tipo_aros, String placa) {
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.tipo_aros = tipo_aros;
        this.placa = placa;
    }

    //Constructor vacio
    public Vehiculos() {
        this.modelo = "Modelo Vacio";
        this.anio = 2021;
        this.color = "Color Vacio";
        this.tipo_aros = "Aros Vacios";
        this.placa = "Placa Vacia";
    }

    //Metodo
    public void imprimir() {
        System.out.println("El modelo del vehiculo es: " + modelo + " El año del vehiculo es: " + anio + " El color del vehiculo es: " + color);
    }

    //Metodo para imprimir solo el modelo del vehiculo (usará el constructor que imprime solo el modelo)
    public void imprimirModelo() {
        System.out.println("El modelo del vehiculo es: " + modelo);
    }

    //Metodo 5 atributos
    public void imprimirDetalles() {
        System.out.println("El modelo del vehiculo es: " + modelo + " El año del vehiculo es: " + anio + " El color del vehiculo es: " + color + " Los aros del vehiculo son: " + tipo_aros + " La placa del vehiculo es: " + placa);
    }
}
