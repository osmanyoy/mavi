package com.training.patterns.behavioral.chainofresponsibility;

import java.util.Scanner;

public class RunChain {
	public static void main(final String[] args) {
		IHandle handle = HandlerFactory.getHandler();
		Scanner scanner = new Scanner(System.in);
		int nextInt = scanner.nextInt();
		Request request = new Request();
		request.setSayi(nextInt);
		handle.handleRequest(request);
	}
}
