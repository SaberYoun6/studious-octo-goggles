package com.revature.model;

public class Art{
	private String medium;
	private String artist;
	private String stylized;
	private String description;
	private boolean isProfessional;
	private	int number;
	private String artists;

	public Art(){
	}
	public Art(String artist) {
		this();
		setArtist(artist);
	}
	public Art(String artist,String artists) {
		this(artist);
		setArtists(artists);
	}
	public Art(String artist, String artists, String stylized) {
		this(artist, artists);
		setStylized(stylized);
		
	}
	public Art(String artist, String artists, String stylized, String medium){
		this(artist,artists,stylized);
		setMedium(medium);
	}
	public Art(String artist,String artists, String stylized,String medium, String description) {
		this(artist,artists,stylized);
		setDescription(description);
	}
	
	public String mediums(){
		return "mediums";
	}
	public String artist(){
		return artist + " " + artists;
	}
	public String style() {
		return stylized;
	}
	public int numOfPrint(int number ){
		return 0;
	}
	public String descriptionImage( ){
		return description;
	}
	public boolean professional(){
		return isProfessional;
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
		this.artist = artist.substring(0,1).toUpperCase().concat(artist.substring(1));
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
	public String getArtists() {
		return artists;
	}
	public void setArtists(String artists) {
		this.artists=  artists.substring(0,1).toUpperCase().concat(artists.substring(1));
	
	}
}	
