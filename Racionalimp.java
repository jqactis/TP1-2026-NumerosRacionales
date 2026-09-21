public class Racionalimp implements Racional {
    public int numerador;
    public int denominador;
    public Racionalimp(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public Racionalimp(int numerador) {
        this.numerador = numerador;
        this.denominador = 1;
    }
    public void suma(Racional r) {
        Racionalimp r2 = (Racionalimp) r;
        if (this.repOk() == false || r2.repOk() == false) {
            throw new IllegalArgumentException("Denominador no puede ser 0");
        }
        else {
        if (this.denominador == r2.denominador) {
            this.numerador = this.numerador + r2.numerador;
            
        }
        else {
        this.numerador = this.numerador * r2.denominador + r2.numerador * this.denominador;
        this.denominador = this.denominador * r2.denominador;
    }}
}
    public void mult(Racional r) {
        Racionalimp r2 = (Racionalimp) r;
        this.numerador = this.numerador * r2.numerador;
        this.denominador = this.denominador * r2.denominador;
    }
    public void div(Racional r) {
        Racionalimp r2 = (Racionalimp) r;
        this.numerador = this.numerador * r2.denominador;
        this.denominador = this.denominador * r2.numerador;

        
    }
    public void neg() {
        this.numerador = -this.numerador;
    }
    public boolean repOk() {
        return this.denominador != 0;
    }
    public String toString() {
        return this.numerador+"R"+this.denominador;

}


}
