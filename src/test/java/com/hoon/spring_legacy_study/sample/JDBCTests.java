package com.hoon.spring_legacy_study.sample;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.jupiter.api.Test;

public class JDBCTests {

	@Test
	public void testConnection() throws Exception {
		Class.forName("org.mariadb.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306", "springdbuser", "springdbuser");
		
		System.out.println(connection);;
		
		connection.close();
	}
}
