package Clases;

public class Administrativo extends Empleados {
	
	String t�tulos;
	float AniosEsxp;
	int numPersonasCargo;
	int numExt;
	
	void GenInform() {
		System.out.println("Aqu� genera los informes.");
	}
	void ConsultTitulos() {
		System.out.println("Aqu� consulta los t�tulos profesionales.");
	}
	void ModifTitulos() {
		System.out.println("Aqu� modifica los t�tulos profesionales.");
	}

}
