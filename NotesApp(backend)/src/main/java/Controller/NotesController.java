package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Model.Notes;
import Model.User;
import Repository.NotesRepo;

public class NotesController {
	
	@CrossOrigin(origins = "http://localhost:8080")
	@RestController
	@RequestMapping("/notes")
	public class notesController {
	  
		@RequestMapping(value = "/user", method = RequestMethod.GET)
		public User P1() {
			User user = new User();
			user.setId(1);
			user.setFname("Alex");
			user.setLname("Harrington");
			user.setEmail("alex@gmail.com");
			user.setDob(1998-12-10);
			user.setMobile(0778916517);
			user.isStatus(yes);
			user.setPassword("alex");

			return user;
		}
		
	  @Autowired
	  NotesRepo NotesRepository;
	  @GetMapping("/user")
	  public ResponseEntity<List<Notes>> getAllNotes
	  	(@RequestParam(required = false) 
	  		String title) {
			return null;
	  }
	  
	  @GetMapping("/note/{id}")
	  public ResponseEntity<Notes> getnoteById
	  (@PathVariable("id") Integer id) {
		return null;
	    
	  }
	  @PostMapping("/note")
	  public ResponseEntity<Notes> createnote
	  (@RequestBody Notes note) {
		return null;
	    
	  }
	  @PutMapping("/note/{id}")
	  public ResponseEntity<Notes> updateUser
	  (@PathVariable("id") Integer id, 
			  @RequestBody Notes note) {
				return null;
	    
	  }
	  @DeleteMapping("/note/{id}")
	  public ResponseEntity<HttpStatus> 
	  	deletenote(@PathVariable("id") Integer id) {
			return null;
	    
	  }
	  @DeleteMapping("/note")
	  public ResponseEntity<HttpStatus> deleteAllnote() {
		return null;
	   
	  }
	}
}