public package biblioteca;

class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private int id;

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setAnioPublicacion(int anioPublicacion){
        this.anioPublicacion = anioPublicacion;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public int getAnioPublicacion(){
        return this.anioPublicacion;
    }
    public int getId(){
        return this.id;
    }
}