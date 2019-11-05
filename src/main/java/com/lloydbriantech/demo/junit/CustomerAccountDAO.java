package com.lloydbriantech.demo.junit;

import java.sql.SQLException;


// no real class implementation yet
public class CustomerAccountDAO {
	
	public boolean saveAccount(CustomerAccount ca) throws SQLException {
		return true;
	}
	public boolean updateAccount(CustomerAccount ca) throws SQLException {
		return true;
	}	
	public boolean deleteAccount(CustomerAccount ca) throws SQLException {
		return true;
	}	
	public CustomerAccount getAccount(String acctNum) throws SQLException {
		return null;
	}
	
	public String newAcctNumber(String name, String phone) throws SQLException {
		return "1111222233334444";
	}
}
