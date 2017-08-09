package ro.adi;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ro.adi.mesajController.Even;
import ro.adi.mesajController.List;
import ro.adi.mesajController.Mesaj;
import ro.adi.mesajController.Palindrom;
import ro.adi.mesajController.Prim;
import ro.adi.mesajController.Sort;
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@Controller
@RestController
@CrossOrigin(origins="*")
@SpringBootApplication
public class ConexiuneDbApplication {

	
	
	
	
	
	@RequestMapping(value = "/v1/getlist", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> jsGetMessages()
			
			 {

		Mesaj mc = new Mesaj();
		List entitate = new List();
		entitate.setLista(mc.veziLista());
		
		return ResponseEntity.status(HttpStatus.OK).body(entitate.getLista());
		

	}

	
	@RequestMapping(value = "/v1/checkPalindrom", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> jsPalindrom(@RequestParam(value="number") int number)
			
			 {

		Palindrom p = new Palindrom();
		if(p.palindrom(number)==true){
			return ResponseEntity.status(HttpStatus.OK).body(true);
			
		}
		else
		{
		
		return ResponseEntity.status(HttpStatus.OK).body(false);
		}

	}
	
	
	@RequestMapping(value = "/v1/checkPrime", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> jsPrime(@RequestParam(value="number") int number)
			
			 {

		Prim p = new Prim();
		
		
		return ResponseEntity.status(HttpStatus.OK).body(p.listaNrPrime(number));
		

	}
	
	@RequestMapping(value = "/v1/checkEven", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> jsEven(@RequestParam(value="x") int x,@RequestParam(value="y") int y)
			
			 {

		Even e = new Even();
		
		
		return ResponseEntity.status(HttpStatus.OK).body(e.listaNrPare(x, y));
		

	}
	
	@RequestMapping(value = "/v1/checkSort", method = RequestMethod.POST)
	public ResponseEntity<?> jsSort(@RequestParam(value="vector") int x[])
	
	 {

Sort s = new Sort();
 

	

return ResponseEntity.status(HttpStatus.OK).body(s.sortareVector(x));


}
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(ConexiuneDbApplication.class, args);
	}
}
