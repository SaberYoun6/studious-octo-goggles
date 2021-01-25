package com.revature.model;

public class Art{
	private String medium;
	private String artist;
	private String stylized;
	private String description;
	private boolean isProfessional;
	private	int number;

	public Art(){
	}
	public Art(String artist) {
		this.artist= artist;
	}
	public Art(String artist,String stylized) {
		this(artist);
		this.stylized= stylized;
	}
	public Art(String artist, String stylized, String description) {
		this(artist,stylized);
		this.description= description;
	}
	
	public String mediums(String medium){
		return "generic medium statment";
	}
	public String artist(){
		return artist;
	}
	public String style() {
		return "generic style";
	}
	public int numOfPrint(int number ){
		return 0;
	}
	public String descriptionImage( String description){
		return " Generic descriptoin Image ";
	}
	public String professional( boolean isProfessional){
		return  "false";
	}
	public String getMedium() {
		return medium;
	}
	public void setMedium(String medium) {
		this.medium = medium;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getStylized() {
		return stylized;
	}
	public void setStylized(String stylized) {
		this.stylized = stylized;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isProfessional() {
		return isProfessional;
	}
	public void setProfessional(boolean isProfessional) {
		this.isProfessional = isProfessional;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}	
