package mundo.herencia;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona personas = new Persona("Sabrina ", "Quiñonez ", 2006);
		Alumno alumnos = new Alumno("Maria ", "Guarnizo ", 1996);
		Persona persona1 = new Persona("Fernando ", "Vivanco ", 2000);
		alumnos.ponGrupo("11 ", 'M');
		personas.imprime();
		alumnos.imprime();
		alumnos.imprimeGrupo();

	}

}
