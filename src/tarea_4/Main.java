package tarea_4;
import java.lang.reflect.*;
import java.lang.annotation.Annotation;
public class Main {

	public static void main(String[] args) {
	

		@SuppressWarnings("rawtypes")
		Class clase;
		Field campo, campos[];
		Method metodo, metodos[];
		try {
			clase = Class.forName("tarea_4.File");
			File persona = new File();
			System.out.println("Lista de campos: \n");
			campos = clase.getDeclaredFields();
			for(int i=0; i < campos.length; i++)
			{
				Annotation a[] = campos[i].getAnnotations();
				System.out.println(a[0] + "\n");
			}
			
			metodos = clase.getDeclaredMethods();
			
			metodos[0].invoke(persona, "pedro");
			metodos[2].invoke(persona, "Perez");
			metodos[4].invoke(persona, 1234567);
			metodos[6].invoke(persona);
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
