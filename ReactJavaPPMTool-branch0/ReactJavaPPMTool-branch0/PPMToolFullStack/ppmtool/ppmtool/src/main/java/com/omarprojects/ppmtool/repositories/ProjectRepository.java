package com.omarprojects.ppmtool.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.omarprojects.ppmtool.domain.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

	@Override
	default Iterable<Project> findAllById(Iterable<Long> arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	Project findByProjectIdentifier(String projectId);
	
	@Override 
	Iterable<Project> findAll();
	
	
	

}
