public class llamarClase {
    public static void main(String[] args) {
        Vehiculos auto1 = new Vehiculos("Toyota", 2003, "Blanco");
        Vehiculos auto2 = new Vehiculos("Chevrolet", 2024, "Gris");

        //Objeto con un solo parametro usando el constructor de modelo
        Vehiculos auto3 = new Vehiculos("Ferrari");

        //Objeto 5 atributos
        Vehiculos auto4 = new Vehiculos("Mazda", 2000, "Negro", "ondulados", "PBU-9230");

        //Objeto constructor vacio (simplemente no le paso los campos porque ya los defini en el constructor)
        Vehiculos auto5 = new Vehiculos();

        auto1.imprimir();
        auto2.imprimir();

        //Llamar al metodo que solo imprime el modelo
        auto3.imprimirModelo();

        //Llamar al metodo 5 atributos
        auto4.imprimirDetalles();

        //Llamar al metodo de 5 atributos ya que de todas formas queremos hacer lo mismo (imprimir los 5 valores del construcor vacio (valores quemadoseeefe))
        auto5.imprimirDetalles();
    }
}
