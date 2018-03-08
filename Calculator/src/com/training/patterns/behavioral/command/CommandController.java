package com.training.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class CommandController implements ICommand {
	private List<ICommand> commands = new ArrayList<>();

	@Override
	public RequestObj execute(final RequestObj req) {
		RequestObj cloneRequest = new RequestObj();
		cloneRequest.setStr(req.getStr());
		RequestObj requestObj = req;
		boolean errorOccurred = false;
		for (ICommand iCommand : this.commands) {
			try {
				requestObj = iCommand.execute(requestObj);
			} catch (Exception e) {
				errorOccurred = true;
			}
		}
		if (errorOccurred) {
			return cloneRequest;
		} else {
			return requestObj;
		}
	}

	public void addCommand(final ICommand command) {
		this.commands.add(command);
	}

}
