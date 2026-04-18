public class ObjPaginaWeb {

    private String url;
    private String titulo;
    private int fechaAcceso;

    public ObjPaginaWeb() {
    }

    public ObjPaginaWeb(String url, String titulo, int fechaAcceso) {
        this.url = url;
        this.titulo = titulo;
        this.fechaAcceso = fechaAcceso;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getFechaAcceso() {
        return fechaAcceso;
    }

    public void setFechaAcceso(int fechaAcceso) {
        this.fechaAcceso = fechaAcceso;
    }
    
}
