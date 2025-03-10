package Trimestre2.Examen2025IgnacioB;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public abstract class Arboles {
	
	private Integer numero_serie;
	private LocalDate fecha_plantacion;
	private BigDecimal altura;
	protected String tipo;
	
	private static String frutal = "frutal";
	private static String pino = "pino";
	public Arboles(Integer numero_serie) {
		
		this.numero_serie = numero_serie;
		this.fecha_plantacion = LocalDate.now();
		this.altura = BigDecimal.ZERO;
	}
	
	public LocalDate getFecha_plantacion() {
		return fecha_plantacion;
	}
	public void setFecha_plantacion(LocalDate fecha_plantacion) {
		this.fecha_plantacion = fecha_plantacion;
	}
	public BigDecimal getAltura() {
		return altura;
	}
	public void setAltura(BigDecimal altura) {
		this.altura = altura;
	}

	public Integer getNumero_serie() {
		return numero_serie;
	}
	
	
	public BigDecimal getAlturaMinimaExport() {
		
		BigDecimal altura = BigDecimal.ZERO;
		if(tipo == "frutal") {
			 altura = BigDecimal.valueOf(150);
		}
		if(tipo=="pino") {
			 altura = BigDecimal.valueOf(100);
		}
		
		return altura;
	}
	
	public BigDecimal getPrecioExportacion() {
		BigDecimal total_exportacion = BigDecimal.ZERO;
		BigDecimal precio_pino = BigDecimal.valueOf(0.2);
		BigDecimal precio_frutal = BigDecimal.valueOf(0.5);
		
		if(altura.compareTo(getAlturaMinimaExport()) > 0 && getTipo() == "pino"){
			total_exportacion = precio_pino.multiply(altura);
		}if(altura.compareTo(getAlturaMinimaExport()) > 0 && getTipo() == "frutal"){
			total_exportacion = precio_pino.multiply(altura);
		}
		return total_exportacion;
	}
	
	public boolean sePuedeExportar() {
		boolean comp = false;
		
		if(altura.compareTo(getAlturaMinimaExport()) > 0) {
			comp = true;
		}
		return comp;
	}
	


	@Override
	public int hashCode() {
		return Objects.hash(numero_serie);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Arboles other = (Arboles) obj;
		return Objects.equals(numero_serie, other.numero_serie);
	}

	
	abstract String getTipo();
	
}
