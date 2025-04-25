package ar.edu.unahur.obj2;

public class Archivo implements IElemento() { 
	private String nombre;
	private Integer tamanio;
	private String extension;
	
	
	
	public Archivo(String nombre, Integer tamanio, String extension) {
		this.nombre = nombre;
		this.tamanio = tamanio;
		this.extension = extension;
	}

}

@Override
public String nombre() {
	return nombre + "" + extension;
}

@Override
public Integer tamanio() {
	return tamanio;
}

@Override
public void mostrar(Integer identacion) {
	throw new UnsupportedOperationException(message:"Unimplemented method 'mostrar'");
}

@Override
public IElemento archivoMasPesado() {
	return this;
}

