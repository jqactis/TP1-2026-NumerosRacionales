public class Calculadora {
    /**
     * Evalua una expresion matemática
     * 
     * @param expresion Representación como string de la expresión matemática a
     *                  evaluar
     * @return
     */
    private static Racional r1;
    private static Racional r2;
    public static Racional evaluarExpresion(String expresion) {
        
        if (expresion.equals("+")) {
            r1.suma(r2);
            System.out.println("debug de esto es suma: " + r1.toString());


            return r1;
        }
        if (expresion.equals("-")) {
            r2.neg();
            r1.suma(r2);
            System.out.println("debug de esto es resta: " + r1.toString());
            return r1;
        }
        if (expresion.equals("*") || expresion.toLowerCase().equals("x")) { //esto realmente es inecesario ya que encima
            r1.mult(r2);                                                    //tira error el * en la terminal si no lo especificas como string osea "*"
            System.out.println("debug de esto es mult: " + r1.toString());  //pero lo dejo por si pinta
            return r1;                                                      //el unico que se puede usar sin especificar del or es el x
        } 
        if(expresion.equals("/")) {
            r1.div(r2);
            System.out.println("debug de esto es div: " + r1.toString());
            return r1;
        }



        return null;
    }

    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Usar java Calculadora <expresion>");
            System.out.println("Ej: java Calculadora '+ 1R2 2R3'");
        } else {
            //https://es.stackoverflow.com/questions/45846/c%C3%B3mo-separar-un-string-en-java-c%C3%B3mo-utilizar-split
            //saque el split de aca 
            String Racional1[] = args[1].split("R");
            String Racional2[] = args[2].split("R");
            r1=new Racionalimp(Integer.parseInt(Racional1[0]), Integer.parseInt(Racional1[1]));
            r2=new Racionalimp(Integer.parseInt(Racional2[0]), Integer.parseInt(Racional2[1]));
            System.out.println("Evaluando expresion: " + args[0]);
            System.out.println(evaluarExpresion(args[0]));
        }
    }
}
