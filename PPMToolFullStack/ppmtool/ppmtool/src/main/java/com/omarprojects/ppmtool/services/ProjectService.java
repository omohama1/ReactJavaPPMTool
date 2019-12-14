package com.omarprojects.ppmtool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omarprojects.ppmtool.domain.Project;
import com.omarprojects.ppmtool.exceptions.ProjectIdException;
import com.omarprojects.ppmtool.repositories.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	public Project saveOrUpdateProject(Project project) {
		
		
	try {
		project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
		return projectRepository.save(project);
	}
		
	catch(Exception e)
	{
		throw new ProjectIdException("Project ID '" + project.getProjectIdentifier().toUpperCase() + "' already exists");
		}
	}
	
	public Project findProjectByIdentifier(String projectId) {
		Project project = projectRepository.findByProjectIdentifier(projectId.toUpperCase());
		if(project == null) {
			throw new ProjectIdException("Project ID '" + projectId.toUpperCase() + "' does not exist");
		}
		return projectRepository.findByProjectIdentifier(projectId);
	}
	
	public Iterable <Project> findAllProjects(){
		return projectRepository.findAll();
	}
	
	public void deleteProjectByIdentifier(String projectId) {
		Project project = projectRepository.findByProjectIdentifier(projectId);
		
		if (project==null) {
			throw new ProjectIdException("cannot find Project with ID '" + projectId+ "'. Project does not exist");
		}
		else {
		projectRepository.delete(project);
		}
	}
	
	public Project updateProjectByIdentifier(String projectId, Project project1) {
		Project project = projectRepository.findByProjectIdentifier(projectId.toUpperCase());
		if(project==null) {
			throw new ProjectIdException("cannot find Project with ID '" + projectId+ "'. Project does not exist");
		}
		else {
			project.setProjectName(project1.getProjectName());
			project.setDescription(project1.getDescription());
			return projectRepository.save(project);
		}
	}

}
