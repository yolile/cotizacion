package py.com.volpe.cotizacion.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author Arturo Volpe
 * @since 4/26/18
 */
@Data
@Entity
public class PlaceBranch {

	@Id
	@GeneratedValue
	private long id;

	private Double latitude;
	private Double longitude;

	private String phoneNumber;
	private String email;
	private String image;
	private String name;

	private String schedule;
	private String remoteCode;

	@ManyToOne
	private Place place;


}
