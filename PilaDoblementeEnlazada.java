public class PilaDoblementeEnlazada<T> implements Pila<T> {

    private NodoPila<T> inicio;
    private NodoPila<T> fin;

    PilaDoblementeEnlazada() {
        this.inicio = null;
        this.fin = null;
    }

    @Override
    public boolean esVacia() {
        return this.inicio == null && this.fin == null;
    }

    @Override
    public T tope() throws IllegalStateException {
        if(this.esVacia()) {
            throw new IllegalStateException("La pila está vacía");
        }else {
            return this.fin.getItem();
        }
        
    }

    @Override
    public void apilar(T elem) throws IllegalStateException {
        NodoPila<T> nuevoNodo = new NodoPila<>(null, elem, this.inicio);
        if(elem == null) {
            throw new IllegalArgumentException("El elemento no puede ser nulo");
        }
        if(this.inicio == null) {
            this.fin = nuevoNodo;
            this.inicio =nuevoNodo;
        }else { 
            this.inicio.setPrev(nuevoNodo);
            this.inicio = nuevoNodo;
        }
        
        
    }

    @Override
    public T desapilar() throws IllegalStateException {
        if(this.esVacia()) {
            throw new IllegalStateException("La pila está vacía");
        }else {
            T item = this.inicio.getItem();
            if(this.inicio == this.fin) {
                this.inicio = null;
                this.fin = null;
            }else {
                this.inicio = this.inicio.getNext();
                this.inicio.setPrev(null);

            
            }
            return item;
        }
    }

    @Override
    public void imprimir() {
        NodoPila<T> aux = this.inicio;
        while(aux != null) {
            System.out.println(aux.getItem());
            aux = aux.getNext();
        }
        
    }

}