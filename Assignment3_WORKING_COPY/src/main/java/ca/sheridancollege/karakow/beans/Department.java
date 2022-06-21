package ca.sheridancollege.karakow.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department implements Serializable{

	private Long DEPARTMENT_ID;
	@NonNull
	private String DEPARTMENT_NAME;
	private Long MANAGER_ID;
	private Long LOCATION_ID;
}
