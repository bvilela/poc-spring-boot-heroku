package com.bvilela.demo;

public class ListBuilderException extends Exception {

	private static final long serialVersionUID = 4682053954814519272L;
	
	public ListBuilderException(String message, Object...args) {
        super(String.format(message, args));
    }
	
	public ListBuilderException(String message) {
        super(message);
    }

}
