package br.com.redcloud.tech.solutions.meetincloud.meet.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.redcloud.tech.solutions.meetincloud.meet.model.Meet;
import br.com.redcloud.tech.solutions.meetincloud.meet.repository.IMeetRepository;

@Service
public class MeetServiceImpl implements IMeetService {
	
	private IMeetRepository meetRepository;
	
	@Autowired
	public MeetServiceImpl(IMeetRepository meetRepository) {
		this.meetRepository = meetRepository;
	}
	
	/***
	 * Inserir uma reunião (Meet) na tabela no banco de dados.
	 * @param meet
	 */
	@Override
	public void createMeet(Meet meet) {
		meet.setCreationDate(LocalDate.now());
		meetRepository.createMeet(meet);
	}

	/***
	 * Atualizar uma reunião (Meet) na tabela no banco de dados.
	 * @param meetId
	 * @param newMeet
	 */
	@Override
	public void updateMeet(Long meetId, Meet newMeet) {
		meetRepository.updateMeet(meetId, newMeet);
	}

	@Override
	public void deleteMeetById(Long meetId) {
		// null
		meetRepository.deleteMeetById(meetId);		
	}

	@Override
	public Meet findById(Long meetId) {
		// null
		Meet meet = meetRepository.findById(meetId);
		return meet;
	}
}
