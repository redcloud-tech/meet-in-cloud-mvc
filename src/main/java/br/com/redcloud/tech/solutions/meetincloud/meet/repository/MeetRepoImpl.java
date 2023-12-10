package br.com.redcloud.tech.solutions.meetincloud.meet.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.redcloud.tech.solutions.meetincloud.meet.model.Meet;
import lombok.extern.slf4j.Slf4j;

@Repository
public class MeetRepoImpl implements IMeetRepository{
	
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	public MeetRepoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void createMeet(Meet meet) {
	String insertSQL = "INSERT INTO MEET 									\n" +
				"( meeting_name , meeting_start_date, meeting_end_date,		\n" +
				"  meeting_start_time, meeting_end_time, creation_date,		\n" +
				"  priority, meeting_category, meeting_description )		\n" +
				"VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ? ); "
				; 
		
		Object[] property = {
				meet.getMeetingName(), meet.getMeetingStartDate(), 
				meet.getMeetingEndDate(), meet.getMeetingStartTime(),
				meet.getMeetingEndTime(), meet.getCreationDate(),
				meet.getPriority(), meet.getMeetingCategory(), 
				meet.getMeetingDescription()
		};
		
		jdbcTemplate.update(insertSQL, property);
	}

	@Override
	public void updateMeet(Long meetId, Meet newMeet) {
		String updateMeetSQL = 
				"UPDATE MEET 					\n" +
				"	SET meeting_name = ?, 		\n" +
				"		meeting_start_date = ?,	\n" +		
				"		meeting_end_date = ?,	\n" +
				"		meeting_start_time = ?, \n" + 
				" 		meeting_end_time = ?,	\n" +
				"		creation_date = ?,		\n" + 
				" 		priority = ?,			\n" + 
				"		meeting_category = ?	\n" + 
				"		meeting_description = ? \n" + 
				"	WHERE meet_id = ?;			";
		
		Object[] property = {
				newMeet.getMeetingName(), newMeet.getMeetingStartDate(), 
				newMeet.getMeetingEndDate(), newMeet.getMeetingStartTime(),
				newMeet.getMeetingEndTime(), newMeet.getCreationDate(),
				newMeet.getPriority(), newMeet.getMeetingCategory(), 
				newMeet.getMeetingDescription(),meetId
				
		};
		jdbcTemplate.update(updateMeetSQL);
	}

	@Override
	public void deleteMeetById(Long meetId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Meet findById(Long meetId) {
		// TODO Auto-generated method stub
		return null;
	}

}
