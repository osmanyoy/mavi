package com.training.patterns.behavioral.command;

public class Create implements ICommand {

	@Override
	public RequestObj execute(final RequestObj requestObj) {
		requestObj.setStr(requestObj.getStr() + " Create");
		return requestObj;
	}

}
