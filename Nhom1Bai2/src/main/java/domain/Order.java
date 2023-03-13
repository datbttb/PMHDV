package domain;

public class Order {
	private String companyID;
	private String OrderNumber;
	private int trangthai;
	private int id;
	
	public Order() {
		super();
	}
	
	public Order(String companyID, String orderNumber, int trangthai, int id) {
		super();
		this.companyID = companyID;
		OrderNumber = orderNumber;
		this.trangthai = trangthai;
		this.id = id;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(int trangthai) {
		this.trangthai = trangthai;
	}
	public String getCompanyID() {
		return companyID;
	}
	public void setCompanyID(String companyID) {
		this.companyID = companyID;
	}
	public String getOrderNumber() {
		return OrderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		OrderNumber = orderNumber;
	}
	@Override
	public String toString() {
		return "Order [companyID=" + companyID + ", OrderNumber=" + OrderNumber + ", trangthai=" + trangthai + "]";
	}
}
