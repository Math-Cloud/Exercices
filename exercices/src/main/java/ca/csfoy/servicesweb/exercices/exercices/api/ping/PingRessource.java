package ca.csfoy.servicesweb.exercices.exercices.api.ping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/ping")
public interface PingRessource {

	@GetMapping
	public String getStatus();

}
