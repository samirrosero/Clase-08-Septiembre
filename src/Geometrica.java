abstract class Figura{
    abstract double calcularArea();

    public void mostrarArea (){
        System.out.println("El area es: " + calcularArea());
    }
}
class Cuadrado extends Figura(){
    private double lado;

    public Cuadrado (double lado){
        this.lado= lado;
    }
    @Override
    double calcularArea(){
        return lado* lado;
    }
};
public class Geometrica {
    
}
