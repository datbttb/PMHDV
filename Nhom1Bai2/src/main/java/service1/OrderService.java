package service1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import config.DatabaseConnection;
import domain.Order;

public class OrderService extends DatabaseConnection {
	public Order checkOrder(String OrderNumber, String companyID) throws ClassNotFoundException, SQLException {
		Connection connection= initializeDatabase();
		PreparedStatement st = connection.prepareStatement("SELECT * FROM nhom1bai2.bai2 where companyID like '%"+companyID+"%' and OrderNumber like '%"+OrderNumber+"%';",Statement.RETURN_GENERATED_KEYS);
//		st.setString(1, companyID);
//		st.setString(2, OrderNumber);
		
		ResultSet rs= st.executeQuery();
		Order order=new Order();
		while (rs.next()) {
			order.setId(rs.getInt("id"));
			order.setCompanyID(rs.getString("companyID"));
			order.setOrderNumber(rs.getString("OrderNumber"));
			order.setTrangthai(rs.getInt("trangthai"));
		}
		return order;
	}
}
