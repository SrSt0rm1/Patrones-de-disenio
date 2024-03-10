package Prototype;

public class Documento implements DocumentoClonable{
    private String autores;
    private String formato;
    private String configuracion;

    public Documento(String autores, String formato, String configuracion) {
        this.autores = autores;
        this.formato = formato;
        this.configuracion = configuracion;
    }

    @Override
    public Documento clonar(){
        return new Documento(autores,formato, configuracion);
    }

    public String getAutores() {
        return autores;
    }

    public String getFormato() {
        return formato;
    }

    public String getConfiguracion() {
        return configuracion;
    }

    @Override
    public String toString() {
        return "Documento [autores=" + autores + ", formato=" + formato + ", configuracion=" + configuracion + "]";
    }    
}
