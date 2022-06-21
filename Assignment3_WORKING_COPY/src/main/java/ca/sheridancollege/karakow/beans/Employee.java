package ca.sheridancollege.karakow.beans;

import java.io.Serializable;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable{

	private Long EMPLOYEE_ID;
	private String FIRST_NAME;
	@NonNull
	private String LAST_NAME;
	@NonNull
	private String EMAIL;
	private String PHONE_NUMBER;
	@NonNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date HIRE_DATE;
	@NonNull
	private String JOB_ID;
	private Double SALARY;
	private Double COMMISSION_PCT;
	private Long MANAGER_ID;
	private Long DEPARTMENT_ID;
	
	
}
