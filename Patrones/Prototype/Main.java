package Prototype;

public class Main{
    public static void main(String[] args) {
        
        Documento documento = new Documento("yo", "Patrones",
         "Hola mundo");

        Documento documento2 = documento.clonar();

        System.out.println("Documento original: ");
        System.out.println(documento);
        System.out.println("Clon del documento: ");
        System.out.println(documento2);

    }
}
