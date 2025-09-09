abstract class Figura{
    abstract double calcularArea();

    public void mostrarArea (){
        System.out.println("El area es: " + calcularArea());
    }
}
class Cuadrado extends Figura{
    private double lado;

    public Cuadrado (double lado){
        this.lado= lado;
    }

    @Override
    double calcularArea(){
        return lado* lado;
    }
}
class Rectangulo extends Figura  {
    private double largo;
    private double ancho;

    public Rectangulo (double largo, double ancho){
        this.largo = largo;
        this.ancho = ancho;
    }
    @Override
    double calcularArea(){
        return largo * ancho;
    }
}

class Circulo extends Figura {
    private double radio;
    public Circulo (double radio){
        this.radio = radio;
    }
    @Override 
    double calcularArea(){
        return Math.PI * radio * radio;
    }
}
public class Geometrica {
    public static void main(String[] args) {
        Figura miCirculo = new Circulo(5);
        Figura miCuadrado = new Cuadrado(10);
        Figura miRectangulo = new Rectangulo(10, 50);

        miCirculo.mostrarArea();
        miRectangulo.mostrarArea();
        miCuadrado.mostrarArea();
    }
}
