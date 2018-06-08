package com.eclipse.test;

import java.awt.Dialog;
import java.awt.Frame;

public class TestBranchOperation extends Dialog {

	public TestBranchOperation(Frame arg0, String arg1) {
		super(arg0, arg1);
		
		Dialog test = new Dialog(arg0);
		System.out.println("Say.... Hello!!!");
	}

}
