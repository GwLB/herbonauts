package models.activities;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import models.Mission;
import models.User;
import models.contributions.Contribution;

import play.db.jpa.Model;

@Entity
@DiscriminatorValue("MISSION_CLOSE")
public class MissionCloseActivity extends Activity {
	
	@ManyToOne
	private Mission mission;

	public MissionCloseActivity(Mission mission) {
		super();
		this.setMission(mission);
	}

	public void setMission(Mission mission) {
		this.mission = mission;
	}

	public Mission getMission() {
		return mission;
	}
	
}
