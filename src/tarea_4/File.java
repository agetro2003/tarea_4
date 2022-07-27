package tarea_4;

public class File {
	
@FieldsAnnotation (NombreCampo = "nombre", LlavePrimaria = false)
	public String nombre;

@FieldsAnnotation (NombreCampo = "apellido", LlavePrimaria = false)
	public String apellido;

@FieldsAnnotation (NombreCampo = "cedula", LlavePrimaria = true)
	public int cedula;
	
	public void SetNombre(String n) {
	nombre = n;
}
	public String GetNombre() {
		return nombre;
	}
	public void SetApellido(String a) {
	apellido = a;
}
	public String GetApellido() {
		return apellido;
	}
	public void SetCedula(int c) {
	cedula = c;
}
	public int GetCedula() {
		return cedula;
	}
	
	public void Imprimir() {
		System.out.println("\n Lista de propiedades de la persona \n");
		System.out.println(" nombre = "+GetNombre()+" \n apellido = "+GetApellido()+" \n cedula = "+GetCedula());
	}

}
