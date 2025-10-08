
import java.util.List;

public class MetodosList {

    private List<ObjPelicula> cartelera;

    public void agregarfinal(ObjPelicula p){
        cartelera.add(p);
        System.out.println("Pelicula agregada: "+ p);

    }

    public void eliminarpeliculaportitulo (String titulo){
        for (ObjPelicula p : cartelera) {
            if(p.getPelicula().equalsIgnoreCase(titulo)){
                cartelera.remove(p);
                System.out.println("Pelicula " + titulo +" eliminada");
                return;
            }
        }

        System.out.println("Pelicula "+ titulo + " no encontrada");
    }

    public void agregarpeliculaenposicion(ObjPelicula p, int ind){
        if (ind >= 0 && ind <= cartelera.size()){
            cartelera.add(ind,p);
            System.out.println("Pelicula " + p + " agregada en la posicion " + ind);
        }
        else{
            System.out.println("Indice fuera de rango");
        }
    }

    public void mostrarcartelera (){
        if(cartelera.isEmpty()){
            System.out.println("Cartelera vacia");
            
        }
        int ind = 0;
        for (ObjPelicula p : cartelera) {
            System.out.println(ind+":" + p);

            
        }

    }
}
