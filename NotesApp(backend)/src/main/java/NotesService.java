import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import Model.Notes;
import Repository.NotesRepo;

public class NotesService {

	@Autowired  
	NotesRepo notesRepository;  
	
	public List<Notes> getAllUsers()   
	{  
		List<Notes> note = new ArrayList<Notes>();  
		notesRepository.findAll().forEach(note1 -> note.add(note1));  
		return note;  
	}  
	 
	public Notes getuserByNote(int id)   
	{  
		return notesRepository.findById(id).get();  
	}  
	
	public void saveOrUpdate(Notes note)   
	{  
		notesRepository.save(note);  
	}  
	 
	public void delete(int id)   
	{  
		notesRepository.deleteById(id);  
	}  
	
	public void update(Notes note, int bookid)   
	{  
		notesRepository.save(note);  
	}  
}
