package com.training.patterns.proxy;

import java.sql.Connection;
import java.sql.SQLException;

public class Run {

	public static void main(final String[] args) throws SQLException {
		Connection connection = ConnectionPool.getInstance()
		                                      .getConnection();

		connection.close();
	}

}
