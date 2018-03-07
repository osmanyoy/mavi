package com.training.patterns.proxy;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class ConnectionPool {
	private static volatile ConnectionPool instance;

	private ConnectionPool() {
	}

	public static ConnectionPool getInstance() {
		if (ConnectionPool.instance == null) {
			synchronized (ConnectionPool.class) {
				if (ConnectionPool.instance == null) {
					ConnectionPool.instance = new ConnectionPool();
					for (int i = 0; i < 100; i++) {
						MyDbConnection myDbConnection = new MyDbConnection(null);
						ConnectionPool.instance.add(myDbConnection);
					}
				}
			}
		}
		return ConnectionPool.instance;
	}

	private Queue<MyDbConnection> connectionQueue = new ArrayBlockingQueue<>(100);

	public void close(final MyDbConnection connection) {
		this.connectionQueue.add(connection);
	}

	public MyDbConnection getConnection() {
		return this.connectionQueue.poll();
	}

	public void add(final MyDbConnection connection) {
		this.connectionQueue.add(connection);
	}
}
