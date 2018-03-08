package com.training.patterns.behavioral.command;

public class Delete implements ICommand {

	@Override
	public RequestObj execute(final RequestObj requestObj) {
		requestObj.setStr(requestObj.getStr() + " Delete");
		return requestObj;
	}

}
