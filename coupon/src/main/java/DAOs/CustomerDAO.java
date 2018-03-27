package DAOs;

import java.util.Collection;

import Beans.Customer;
import Beans.Coupon;
import Exceptions.CouponSystemException;

public interface CustomerDAO {

		int createCustomer(Customer customer) throws CouponSystemException;
		void removeCustomer(Customer customer) throws CouponSystemException;
		void updateCustomer(Customer customer) throws CouponSystemException;
		Customer getCustomer(int id) throws CouponSystemException;
		Collection<Customer> getAllCustomers() throws CouponSystemException;
		Collection<Coupon> getCoupons(int id) throws CouponSystemException;
		int login(String customerName, String password) throws CouponSystemException;
		boolean customerNameExists(Customer customer) throws CouponSystemException;

}
