
public class StudentFees {
	int pension =0;
	int matricula = 0;
	int transporte = 0;
	int alimentacion =0;
	/**
	 * @param pension
	 * @param matricula
	 * @param transporte
	 * @param alimentacion
	 */
	public StudentFees(int pension, int matricula, int transporte, int alimentacion) {
		super();
		this.pension = pension;
		this.matricula = matricula;
		this.transporte = transporte;
		this.alimentacion = alimentacion;
	}
	@Override
	public String toString() {
		return "StudentFees [pension=" + pension + ", matricula=" + matricula + ", transporte=" + transporte
				+ ", alimentacion=" + alimentacion + "]";
	}
	

}
