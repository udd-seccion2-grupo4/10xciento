package ejemplopipeline;

public class Diezxciento {

	public int ahorro;
	public int sueldo;

	public Diezxciento() {
		ahorro = 20000000;
		sueldo = 700000;
	}

	public Diezxciento(int ahorro, int sueldo) {
		this.ahorro = ahorro;
		this.sueldo = sueldo;
	}

	public int diezxciento() {
		double diezxciento = ahorro * 0.1;
		System.out.println(diezxciento);
		return (int) diezxciento;
	}

	public Float impuesto(int sueldo) {
		Integer sueldoAnual = sueldo * 12;

		float impuesto = 0.0f;
		if (sueldoAnual > 17864280 && (sueldoAnual < 29773800)) {
			impuesto = 0.08f;
		} else if (sueldoAnual > 29700000 && (sueldoAnual < 41600000)) {
			impuesto = 0.135f;
		}

		System.out.println("Sueldo Anual: " + sueldoAnual);
		System.out.println("impuesto" + impuesto);
		return impuesto;
	}

	public int saldoAhorro() {
		double noventaxciento = ahorro * 0.9;
		return (int) noventaxciento;
	}

}