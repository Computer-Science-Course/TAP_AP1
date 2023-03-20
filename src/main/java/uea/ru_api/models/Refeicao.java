package uea.ru_api.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import uea.ru_api.models.enums.TipoRefeicao;

@Entity
public class Refeicao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@NotNull(message = "Data consumo é obrigatório")
	private LocalDateTime dataConsumo;

	@Enumerated(EnumType.STRING)
	@NotNull(message = "Tipo é obrigatório")
	private TipoRefeicao tipo;
	
	public Refeicao() {

	}

	public Refeicao(Long codigo, LocalDateTime dataConsumo, TipoRefeicao tipo) {
		super();
		this.codigo = codigo;
		this.dataConsumo = dataConsumo;
		this.tipo = tipo;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public LocalDateTime getDataConsumo() {
		return dataConsumo;
	}

	public void setDataConsumo(LocalDateTime dataConsumo) {
		this.dataConsumo = dataConsumo;
	}

	public TipoRefeicao getTipo() {
		return tipo;
	}

	public void setTipo(TipoRefeicao tipo) {
		this.tipo = tipo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Refeicao other = (Refeicao) obj;
		return Objects.equals(codigo, other.codigo);
	}

}
