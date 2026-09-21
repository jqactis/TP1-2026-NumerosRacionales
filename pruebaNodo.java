public class pruebaNodo {
    public static void main(String[] args) {
        PilaDoblementeEnlazada<Racional> pila = new PilaDoblementeEnlazada<>();
        Racional r1 = new Racionalimp(1, 2);
        Racional r2 = new Racionalimp(1, 3);
        pila.apilar(r1);
        pila.apilar(r2);
        pila.desapilar();
        pila.imprimir();
    }
}
