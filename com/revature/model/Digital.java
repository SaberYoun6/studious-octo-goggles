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

	public Digital(){
		super();
	}
	public Digital(String firstName, String lastName){
		this();
		Digital digital= new Digital();
		setFirstName(firstName);
		setLastName(lastName);
		digital.setArtist(firstName,lastName);
	}
	public Digital(String firstName,String lastName, String style, String medium){
		this( firstName,lastName);
		Digital digital = new Digital();
		digital.setStyle(style);
		digital.setmediums(medium);
	}
	public Digital(String firstName,String lastName,String style, String medium, int numberOfPrint){
		this(firstName,lastName,style, medium);
		Digital digital = new Digital();
		digital.setNumbOfPrint(numberOfPrint);
	}
	public Digital(String firstName, String lastName, String style, String medium, int numberOfPrint, boolean isProfessional){
		this(firstName, lastName,style, medium, numberOfPrint);
		Digital digital = new Digital();
		digital.setProfessional(isProfessional);
	}
	public Digital(String firstName,String lastName, String style, String medium, int numberOfPrint, boolean isProfessional, String description){
		this(firstName,lastName,style,medium,numberOfPrint,isProfessional);
		this.description = description;
	}
	public Digital(String firstName, String lastName, String style, String medium, int numberOfPrint, boolean isProfessional,String description,String works){
		this(firstName,lastName,style,medium,numberOfPrint,isProfessional,description);
		this.works = works;
	}


	public String artist(){
		return firstName +" " +lastName;
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
		Digital digital = new Digital();
		digital.setFirstName(firstName);
		digital.setLastName(lastName);

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
