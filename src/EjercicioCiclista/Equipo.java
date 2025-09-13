package EjercicioCiclista;

import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {
    private String nombreEquipo;
    private String pais;
    private static int sumaTiemposEquipo = 0;
    private ArrayList <Ciclista> listaCiclistas; // lista para guardar los ciclistas

    //constructor

    public Equipo (String nombreEquipo, String pais){
        this.nombreEquipo = nombreEquipo;
        this.pais = pais; 
        this.listaCiclistas = new ArrayList<>();
    }


    public String getNombreEquipo() {
        return this.nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void añadirCiclista(Ciclista ciclista){
        listaCiclistas.add(ciclista);
    }

    //mostrar datos

    public void listarNombresCiclistas (){
        System.out.println("-----Nombre de los ciclistas del equipo " + this.nombreEquipo + "-----");
        for (Ciclista ciclista : listaCiclistas){
            System.out.println("- " + ciclista.getNombre());
        }
    }

    //encontrar ciclista con id

    public void buscarCiclista (){
        Scanner sc = new Scanner(System.in);

        System.out.println("?);
    }


}
