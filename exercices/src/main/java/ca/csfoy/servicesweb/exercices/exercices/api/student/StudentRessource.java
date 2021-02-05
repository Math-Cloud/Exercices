package ca.csfoy.servicesweb.exercices.exercices.api.student;

import java.util.Collection;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/students")
public interface StudentRessource {

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody StudentDTO student);

	@GetMapping
	public Collection<StudentDTO> get();

	@GetMapping("/find")
	public Collection<StudentDTO> get(@RequestParam("nom") String nom, @RequestParam("prenom") String prenom);
	
	@GetMapping("/{matricule}")
	public StudentDTO get(@PathVariable("matricule") long matricule);
	
	@PutMapping
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void update(@RequestBody StudentDTO student);

	@DeleteMapping("/{matricule}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("matricule") long matricule);

}
