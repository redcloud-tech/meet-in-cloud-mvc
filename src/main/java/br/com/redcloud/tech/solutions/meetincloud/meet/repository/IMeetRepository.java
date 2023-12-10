package br.com.redcloud.tech.solutions.meetincloud.meet.repository;

import br.com.redcloud.tech.solutions.meetincloud.meet.model.Meet;

public interface IMeetRepository {
	void createMeet(Meet meet);
	void updateMeet(Long meetId, Meet newMeet);
	void deleteMeetById(Long meetId);
	Meet findById(Long meetId);
	
	// por enquanto é isso xD
}
