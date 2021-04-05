package com.kajal.banking.wallet;
import java.math.BigDecimal;
import java.sql.SQLException;
import com.kajal.banking.Customer;

public interface WalletService {
	
	public Customer createAccount(String name ,String mobileno, BigDecimal amount);
	public Customer showBalance (String mobileno);
	public Customer fundTransfer (String sourceMobileNo,String targetMobileNo, BigDecimal amount);
	public Customer depositAmount (String mobileNo,BigDecimal amount );
	public Customer withdrawAmount(String mobileNo, BigDecimal amount);
	public boolean save(Customer customer) throws SQLException, ClassNotFoundException ;
	public Customer findOne(String mobileNo) throws ClassNotFoundException, SQLException;
}
