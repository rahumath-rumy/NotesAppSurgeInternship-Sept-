package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tourism_org.com.tourismapp.config.DbConnection;

import org.springframework.web.bind.annotation.RequestMethod;

import Model.User;
import Repository.UserRepo;
 
@RestController
public class UserController {
//
//		@RequestMapping(value = "/employee", method = RequestMethod.GET)
//		public Employee firstPage() {
	
	@CrossOrigin(origins = "http://localhost:8080")
	@RestController
	///@RequestMapping("/user", method = RequestMethod.GET)
	public class userController {
	  
		@RequestMapping(value = "/user", method = RequestMethod.GET)
		public User P1() {
			User user = new User();
			user.setId(1);
			user.setFname("Alex");
			user.setLname("Harrington");
			user.setEmail("alex@gmail.com");
			user.setDob(1998-12-10);
			user.setMobile(778916517);
			user.isStatus("true");
			user.setPassword("alex");

			return user;
		}
		
		
	  @Autowired
	  UserRepo UserRepository;
	  @GetMapping("/user")
	  public ResponseEntity<List<User>> getAllUser
	  	(@RequestParam(required = false) 
	  		String title) {
			return null;
	  }
	  
	  @GetMapping("/user/{id}")
	  public ResponseEntity<User> getuserById
	  (@PathVariable("id") Integer id) {
		return null;
	    
	  }
	  @PostMapping("/user")
	  public ResponseEntity<User> createuser
	  (@RequestBody User user) {
		return null;
	    
	  }
	  @PutMapping("/user/{id}")
	  public ResponseEntity<User> updateUser
	  (@PathVariable("id") Integer id, 
			  @RequestBody User user) {
				return null;
	    
	  }
	  @DeleteMapping("/user/{id}")
	  public ResponseEntity<HttpStatus> 
	  	deleteuser(@PathVariable("id") Integer id) {
			return null;
	    
	  }
	  @DeleteMapping("/user")
	  public ResponseEntity<HttpStatus> deleteAlluser() {
		return null;
	    
	  }
	  @GetMapping("/user/email")
	  public ResponseEntity<List<User>> findByEmail() {
		return null;
	    
	  }
	}

	public String Sha1Encrypt(String input) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserController userAuth(String email, String password) {
		
			try {

		      String encryptedPassword = Sha1Encrypt (password);  
		      String sql ="Select * from `customer` where `Email` = ? and `password`=?";
		      PreparedStatement stmt = connection.prepareStatement(sql);
		      stmt.setString(1,email);
		      stmt.setString (2, encryptedPassword);
		      
		      ResultSet resultSet = stmt.executeQuery();
		      
		      int rows =0;
		      User User = new User();
		      while (resultSet.next()) {
		    	  
		    	    rows ++;
		    	
					User.setId(resultSet.getInt("customer_id"));
					User.setFname(resultSet.getString("Fname"));
					User.setLname(resultSet.getString("Lname"));
					User.setPhone(resultSet.getInt("Phone"));
					User.setAddress(resultSet.getString("Address"));
					User.setNationality(resultSet.getString("Nationality"));
					User.setSrilankan(resultSet.getBoolean("Srilankan"));
					User.setCountry(resultSet.getString("Country"));
					User.setEmail(resultSet.getString("Email"));
					User.setPassport(resultSet.getString("PassportOrNIC"));
					User.setPassword(resultSet.getString("password"));
		    	  
		      }
		      
	      if (rows == 1) {
		        	  
	    	  Connection conn1 = DbConnection.getInstance().getConnection();

		    	    	 
		         String sql1 = "INSERT INTO `customer_login` (`loginid`,`Email`, `password`)"
		    	  				+ "VALUES (?,?,?);";
		    	  		
		  		PreparedStatement stmt1 = conn1.prepareStatement(sql1);
	   	 
				stmt1.setString(1, User.getLoginid());
	   	  		stmt1.setString(2, User.getEmail());
		  		stmt1.setString(3, User.getPassword());

		    	int resultSet1 = stmt1.executeUpdate();		    	  		
	    	  	return User;
		  
	      } else {
	    	  return null;
	      }
	      
		} catch (Exception e) {
			e.printStackTrace();
			 logger.info("SQL ERROR :  Invalid data for login - "+e.getMessage());
			return null;
		}

	}
		
