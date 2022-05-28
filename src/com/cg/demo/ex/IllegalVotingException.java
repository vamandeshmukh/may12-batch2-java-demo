package com.cg.demo.ex;

public class IllegalVotingException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public IllegalVotingException() {
		super();
	}

	public IllegalVotingException(String message) {
		super(message);
	}
}
