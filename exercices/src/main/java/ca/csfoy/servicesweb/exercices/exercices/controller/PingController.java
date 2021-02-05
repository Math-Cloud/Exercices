package ca.csfoy.servicesweb.exercices.exercices.controller;

import org.springframework.web.bind.annotation.RestController;

import ca.csfoy.servicesweb.exercices.exercices.api.ping.PingRessource;

@RestController
public class PingController implements PingRessource {

	public String getStatus() {
		return "Pong";
	}

}
