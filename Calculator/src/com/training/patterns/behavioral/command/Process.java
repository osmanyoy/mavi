package com.training.patterns.behavioral.command;

public class Process implements ICommand {

	@Override
	public RequestObj execute(final RequestObj requestObj) {
		requestObj.setStr(requestObj.getStr() + " Process");
		return requestObj;
	}

}
