package Clases;

public class Administrativo extends Empleados {
	
	String títulos;
	float AniosEsxp;
	int numPersonasCargo;
	int numExt;
	
	void GenInform() {
		System.out.println("Aquí genera los informes.");
	}
	void ConsultTitulos() {
		System.out.println("Aquí consulta los títulos profesionales.");
	}
	void ModifTitulos() {
		System.out.println("Aquí modifica los títulos profesionales.");
	}

}
