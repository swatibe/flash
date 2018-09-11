package com.relevance.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepostiary extends CrudRepository<Course,String> {
   
	public List<Course> findByTopicId(String topicId);
	
	
	
}
