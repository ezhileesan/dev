package com.excite.atm.controller;

import com.excite.atm.ejb.AtmMgrBean;
import com.excite.atm.ejb.AtmMgrRemote;
import com.excite.atm.model.UserAccount;

public class AtmController {

	AtmMgrRemote atmMgr = null;

	public void execute(UserAccount userAccount) {
		atmMgr = new AtmMgrBean(userAccount);
		atmMgr.drawMainMenu();
	}
}
