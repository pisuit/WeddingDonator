package tf.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TFFORM")
@SequenceGenerator(name="SEQ_DONATOR", sequenceName="GEN_DONATOR", allocationSize=1)
public class Donator {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_DONATOR")
	private Long id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="AMOUNT")
	private BigDecimal amount = new BigDecimal("0");
	
	@Column(name="DATA_STATUS")
	private String DataStatus = "NORMAL";
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getDataStatus() {
		return DataStatus;
	}
	public void setDataStatus(String dataStatus) {
		DataStatus = dataStatus;
	}
}
