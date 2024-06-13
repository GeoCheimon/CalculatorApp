package com.GeoCheimon.exceptions;

public class OverflowException extends Exception{
	//2 ways
	public OverflowException(String msg) {
		super(msg);//Αντι να κανω override την getMessage()
		//Καλω τον default constructor της Exception και ετσι πάμε στον Calculator και βάζω ότι μήνυμα
		//θέλω μεσα στο throw. ΔΛΔ αυτο: throw new OverflowException("Overflow"); Και θα μας βγει μετα 
		//μετα απο την getMessage(), αλλα επειδη είναι πλεον msg 
	}
	/*
	//To Μονο που θελουμε να κανουμε override ειναι η getMessage()
	//δλδ θα επαναπροσδιορίσουμε=override αυτην την μέθοδο
	@Override
	public String getMessage() {
		return ("Numbers too big. Overflow has occured");
	}*/
}
