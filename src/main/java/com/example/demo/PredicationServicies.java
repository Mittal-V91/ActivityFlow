package com.example.demo;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@Transactional
public class PredicationServicies {
	
	public PredicationServicies() {
		
	}
	
	  
	   
	    public String aimlPedict() {
	    	System.out.println("aiml model!!!!!!!!!!!!!!!!!!!");

            return "y";


	       
	        
	     }
	    
	  
	    public String createPedict() {
	    	System.out.println("createPedict!!!!!!!!!!!!!!!!!");
	    

	    	return "y";

	       
	        
	    }
	   
	    public String queue() {
	    	System.out.println("queue!!!!!!!!!!!!!!");
	    

	    	return "y";

	       
	        
	    }
	   
	    public String publish() {
	    	System.out.println("publish!!!!!!!!!!!!!");
	    

	    	return "y";

	       
	        
	    }

	
}
