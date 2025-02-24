import java.io.Serializable;

class Libro implements Serializable{
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private int id;

    public Libro(String titulo, String autor,int anioPublicacion, int id){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.id = id;

    }

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
    @Override
    public String toString(){
        return " Titulo: "+ titulo +" Autor: " + autor + " Publicacion: "+ anioPublicacion+ " Id: "+ id;
    }
}