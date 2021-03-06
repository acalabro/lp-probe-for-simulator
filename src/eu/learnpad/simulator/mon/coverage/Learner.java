package eu.learnpad.simulator.mon.coverage;

public class Learner {

	
	private int id;
	private int id_role;
	private String name;
	private String surname;
	private float globalScore;
	private float relativeGlobalScore;
	private float absoluteGlobalScore;
	
	public Learner(int id, int id_role, String name, String surname, float globalScore, float relativeGlobalScore, float absoluteGlobalScore) {
		this.id = id;
		this.id_role = id_role;
		this.name = name;
		this.surname = surname;
		this.globalScore = globalScore;
		this.relativeGlobalScore = relativeGlobalScore;
		this.absoluteGlobalScore = absoluteGlobalScore;
	}
	
	public Learner(int id, int id_role, String name, String surname, float globalScore) {
		this.id = id;
		this.id_role = id_role;
		this.name = name;
		this.surname = surname;
		this.globalScore = globalScore;
		this.relativeGlobalScore = 0;
		this.absoluteGlobalScore = 0;
	}
	
	public Learner(int id, int id_role, String name, String surname, float globalScore, float relativeGlobalScore) {
		this.id = id;
		this.id_role = id_role;
		this.name = name;
		this.surname = surname;
		this.globalScore = globalScore;
		this.relativeGlobalScore = relativeGlobalScore;
		this.absoluteGlobalScore = 0;
	}
	
	public Learner(int id, int id_role, String name, String surname) {
		this.id = id;
		this.id_role = id_role;
		this.name = name;
		this.surname = surname;
		this.globalScore = 0;
		this.relativeGlobalScore = 0;
		this.absoluteGlobalScore = 0;
	}
	
	public Learner(int id, String name, String surname) {
		this.id = id;
		this.id_role = 0;
		this.name = name;
		this.surname = surname;
		this.globalScore = 0;
		this.relativeGlobalScore = 0;
		this.absoluteGlobalScore = 0;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdRole() {
		return id_role;
	}
	public void setIdRole(int id_role) {
		this.id_role = id_role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public float getGlobalScore() {
		return globalScore;
	}
	public void setGlobalScore(float globalScore) {
		this.globalScore = globalScore;
	}
	public float getRelativeGlobalScore() {
		return relativeGlobalScore;
	}
	public void setRelativeGlobalScore(float relativeGlobalScore) {
		this.relativeGlobalScore = relativeGlobalScore;
	}
	public float getAbsolute_global_score() {
		return absoluteGlobalScore;
	}
	public void setAbsoluteGlobalScore(float absoluteGlobalScore) {
		this.absoluteGlobalScore = absoluteGlobalScore;
	}	
	
	
}
