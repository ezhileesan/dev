package com.excite.atm.ejb;

import com.excite.atm.model.UserAccount;

import junit.framework.TestCase;

public class AtmMgrBeanTest extends TestCase {
	
	public void testDeposit(){
		UserAccount userAccount = new UserAccount();
		AtmMgrBean atmMgrBean = new AtmMgrBean(userAccount);
		atmMgrBean.deposit(20);
		assertEquals(userAccount.getAvailableBal(), 100,  0.5);
	}
	
	public void testCheckNsf(){
		UserAccount userAccount = new UserAccount();
		AtmMgrBean atmMgrBean = new AtmMgrBean(userAccount);
		atmMgrBean.checkNsf(20);
		assertEquals(userAccount.getAvailableBal(), 60,  0.5);
	}


}
