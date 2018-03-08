package com.training.patterns.behavioral.command;

public class Update implements ICommand {

	@Override
	public RequestObj execute(final RequestObj requestObj) {
		if (requestObj.getStr()
		              .contains("error")) {
			throw new IllegalStateException("error");
		}
		requestObj.setStr(requestObj.getStr() + " Update");
		return requestObj;
	}

}
