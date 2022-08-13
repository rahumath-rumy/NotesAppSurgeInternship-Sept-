package Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import Model.Notes;

public interface NotesRepo extends MongoRepository<Notes, Integer>{

}

