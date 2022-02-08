package ua.edu.znu.cs.models;

import org.springframework.data.repository.CrudRepository;
import ua.edu.znu.cs.entities.TermsUser;

public interface TermsUserRepository  
       extends CrudRepository<TermsUser, Integer> {
    
}
