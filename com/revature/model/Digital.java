package com.revature.model;

public class Digital extends Art{
	public String getArtist() {
		return artist;
	}
	public String getStyle() {
		return style;
	}
	public String getMedium() {
		return medium;
	}
	public int getNumberOfPrint() {
		return numberOfPrint;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName.toUpperCase().substring(0,1)+ firstName.substring(1);
	}
	public void setLastName(String lastName) {
	    this.lastName= lastName.toUpperCase().substring(0,1)+ lastName.substring(1);
	}
	public String getLastName() {
		return lastName;
	}
	public String getDescription() {
		return description;
	}
	public boolean isProfessional() {
		return isProfessional;
	}
	public String getWorks() {
		return works;
	}
	private String artist;
	private String style;
	private String  medium;
	private int numberOfPrint;
	private String firstName;
	private String lastName;
	private String description;
	private boolean isProfessional;
	private String works;
	
	
	public Digital(String firstName, String lastName){
		super(firstName,lastName);
	}
	public Digital(String firstName,String lastName,String style, String medium, String works, String description) {
		this( firstName, lastName);
		super.setStylized(style);
		super.setMedium(medium);
		super.setWorks(works);
		super.setDescription(description);
	}
	
	public Digital(String firstName,String lastName,String style, String medium, String works, String description, int numberOfPrint ){
		this(firstName,lastName,style, medium, works,description);
		setNumbOfPrint(numberOfPrint);
	}
	public Digital(String firstName, String lastName, String style, String medium,String works,String description, int numberOfPrint, boolean isProfessional){
		this(firstName, lastName,style, medium,works,description,numberOfPrint);
		setProfessional(isProfessional);
	}
	

	public String artist(){
		return getFirstName() + " " + getLastName();
	}
	public int numOfPrint(){
		return numberOfPrint;
	}
	public String style(){
		return style;
	}
	public void setStyle(String style){
		this.style = style;
	}
	public void setArtist(String firstName, String lastName){
		setFirstName(firstName);
		setLastName(lastName);
	}
	public String mediums(){
		return medium;
	}
	public void setmediums(String medium){
		this.medium =medium;
	}
	public void setNumbOfPrint(int numberOfPrint){
		this.numberOfPrint = numberOfPrint;
	}
	public String descriptoionImage(String description){
		return description;
	}
	public String professional( boolean isProfessional){
		if (isProfessional){
			return "Yes, this person is a professional";
		}else {
			return "No, this person is not a proffesional but is hoping to be";
		}
	}
	public void setProfessional(boolean isProfessional){
		this.isProfessional = isProfessional;
	}
	public String worksofArt(String works){
		return works;
	}
	public String combinedDigital(String artist, String medium, String style,
			String works, String description, int numberOfPrint, boolean isProfessional){ 
		String s=  "the " + artist +" the style is " + style +" with this medium " + medium + "one of his their works is" + works + "a little bit of description of this work " + description + " number in the series is "+ numberOfPrint +(professional(isProfessional));
		return s;
	}
		
}
