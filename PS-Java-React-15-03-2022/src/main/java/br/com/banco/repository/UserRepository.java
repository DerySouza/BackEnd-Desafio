package br.com.banco.repository;
 
 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import br.com.banco.model.UserCont;

@Repository
public interface UserRepository extends JpaRepository<UserCont,Long> {

	 
  

}
