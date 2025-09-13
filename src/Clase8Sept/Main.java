package Clase8Sept;
class Animal {
    public void hacerSonido(){
        System.out.println("El animal hace un sonido: ");
    }
}

class Perro extends Animal{
    public void hacerSonido(){
        System.out.println("El perro dice: guau!");
    }

    public void mostrarTruco() {
        
        System.out.println("El perro hace un truco.");
    }
}

public class Main{
    public static void main(String[] args) {
        // conversion ascendente: Un perro se trata como un Animal
        Animal miAnimal= new Perro();
        System.out.println(miAnimal);
        /*
         * conversion descendente (downcasting) explicita un objeto animal se trata
         * como un perro
         * ahora miAnimal apunta a un objeto animal, no a un perro
         */
        if (miAnimal instanceof Perro) {
            Perro miPerro = (Perro) miAnimal; // esto lanzaara un aexcepcion en tiempo de ejecucion
            miPerro.hacerSonido(); // muestra el perro dice: guau
            miPerro.mostrarTruco(); // error en tiempo de ejecucion
        } else {
            System.out.println("La conversion descendente no es segura.");
        }
    }

    @Override
    public String toString() {
        return "Main []";
    }
}