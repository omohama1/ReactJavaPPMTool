package com.omarprojects.ppmtool.domain;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Project {
	
	@Id
	@GeneratedValue (strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Project name is required")
	private String projectName;
	
	@NotBlank(message = "Project description is required")
	private String description;
	
	@NotBlank(message = "Project identifier is required")
	@Size(min=4, max=5, message = "Please use 4 to 5 characters")
	@Column(updatable=false, unique=true)
	private String projectIdentifier;
	
	@JsonFormat(pattern="yyyy-mm-dd")
	private Date startDate;
	@JsonFormat(pattern="yyyy-mm-dd")
	private Date endDate;
	@JsonFormat(pattern="yyyy-mm-dd")
	private Date createdAt;
	@JsonFormat(pattern="yyyy-mm-dd")
	private Date updatedAt;
	
	public Project() {}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProjectIdentifier() {
		return projectIdentifier;
	}

	public void setProjectIdentifier(String projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
	
	

}
