package service1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import config.DatabaseConnection;
import domain.Order;

public class CardService extends DatabaseConnection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		OrderService os1=new OrderService();
		Order od=os1.checkOrder("ZRA56782C","Mega Electronics Ltd.");
		System.out.println(od);
	}
}
