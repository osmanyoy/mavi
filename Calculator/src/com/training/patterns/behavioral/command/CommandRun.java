package com.training.patterns.behavioral.command;

public class CommandRun {
	public static void main(final String[] args) {
		ICommand command = CommandFactory.getCommand(new String[] { "update", "process", "delete" });
		RequestObj requestObj = new RequestObj();
		requestObj.setStr("error merr");
		RequestObj execute = command.execute(requestObj);
		System.out.println(execute);

		System.out.println(CommandRun.concat("osman",
		                                     "yaycýoðlu",
		                                     "48"));
		System.out.println(CommandRun.test(10,
		                                   "soa",
		                                   100L));
		System.out.println(CommandRun.test(10,
		                                   "soa",
		                                   100L,
		                                   200L));
	}

	public static String concat(final String... strings) {
		StringBuilder stringBuilder = new StringBuilder();
		for (String string : strings) {
			stringBuilder.append(string);
			stringBuilder.append(" ");
		}
		return stringBuilder.toString();
	}

	public static String test(final int a, final String b, final long c, final Object... objects) {
		return b + a + c;
	}

}
