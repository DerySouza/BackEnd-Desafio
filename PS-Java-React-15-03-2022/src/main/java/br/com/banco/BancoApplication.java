package br.com.banco;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration;


import br.com.banco.model.UserCont;
import br.com.banco.repository.UserRepository;

 




@SpringBootApplication(exclude = SqlInitializationAutoConfiguration.class)

public class BancoApplication implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(BancoApplication.class, args);
         
    }

    @Autowired
    private UserRepository userRepository;
    
	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new UserCont ("Gasper","10/12/2012",50.0,"transferência"));
		this.userRepository.save(new UserCont  ("Jasper","11/02/2021",650.0,"depósito"));
		this.userRepository.save(new UserCont  ("Snow","20/01/2022",850.0,"transferência"));
		 
	}
	
	
	 
    
}
