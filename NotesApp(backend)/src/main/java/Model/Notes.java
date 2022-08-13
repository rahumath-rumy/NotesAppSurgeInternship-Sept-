package Model;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="Notes")
public class Notes {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int id;
	private String title;
	private String desc;
	@Override
	public String toString() {
		return "Notes [id=" + id + ", title=" + title + ", desc=" + desc + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}