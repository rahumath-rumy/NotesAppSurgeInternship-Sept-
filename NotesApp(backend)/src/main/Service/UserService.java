
public class UserService {

	@Autowired  
	UserRepository userRepository;  
	
	public List<User> getAllUsers()   
	{  
		List<Users> user = new ArrayList<Users>();  
		UsersRepository.findAll().forEach(user1 -> user.add(user1));  
		return user;  
	}  
	 
	public user getuserById(int id)   
	{  
		return userRepository.findById(id).get();  
	}  
	
	public void saveOrUpdate(user user)   
	{  
		userRepository.save(user);  
	}  
	 
	public void delete(int id)   
	{  
		userRepository.deleteById(id);  
	}  
	
	public void update(user user, int bookid)   
	{  
		userRepository.save(user);  
	}  
	}  