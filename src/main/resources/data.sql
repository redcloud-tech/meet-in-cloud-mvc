CREATE SEQUENCE meet_id_seq START WITH 1 INCREMENT BY 1;

CREATE TABLE MEET (
    meet_id 			  INTEGER DEFAULT NEXTVAL('meet_id_seq')PRIMARY KEY	,
    meeting_name 		  VARCHAR(40) 							NOT NULL	,
    meeting_start_date 	  DATE 									NOT NULL	,
    meeting_end_date 	  DATE 									NOT NULL	,
    meeting_start_time 	  TIME 									NOT NULL	,
    meeting_end_time 	  TIME 									NOT NULL	,
    priority 			  INTEGER 								NOT NULL	,
    meeting_category 	  VARCHAR(30) 							NOT NULL	,
    creation_date 		  DATE 									NOT NULL	,
    meeting_description   CLOB									NOT NULL
);

