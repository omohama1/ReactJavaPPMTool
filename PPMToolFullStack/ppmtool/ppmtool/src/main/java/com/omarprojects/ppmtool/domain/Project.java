package com.omarprojects.ppmtool.domain;

import javax.persistence.*;

@Entity
public class Project {
	
	@Id
	@GeneratedValue (strategy =  GenerationType.IDENTITY)
	private Long id;
	private String projectName;
	private String description;
	private String projectIdentifier;
	
	

}
