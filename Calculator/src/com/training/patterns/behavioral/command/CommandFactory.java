package com.training.patterns.behavioral.command;

public class CommandFactory {
	public static ICommand getCommand(final String[] commands) {
		CommandController commandController = new CommandController();

		for (String string : commands) {
			switch (string) {
			case "create":
				commandController.addCommand(new Create());
				break;
			case "update":
				commandController.addCommand(new Update());
				break;
			case "delete":
				commandController.addCommand(new Delete());
				break;
			case "process":
				commandController.addCommand(new Process());
				break;

			default:
				break;
			}

		}
		return commandController;
	}
}
