public class Comedor {
    private int capacidad;
    private String nombre;
    private Menu menu;
    //podriamos poner las coordenadas en donde esta para lo de la geolocalizacion al final
    
    public Comedor(int capac, String nomb, Menu menu) {
        capacidad = capac;
        nombre = nomb;
        menu = menu;
    }
}
