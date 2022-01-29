package com.individuallogin;

public class ExistingUser {
	private void userName() {
		System.out.println("Karthick");
	}
	private void password() {
		System.out.println("Lucky");
	}
private void login() {
	System.out.println("Click the login");
}
public static void main(String[] args) {
	ExistingUser a=new ExistingUser();
	a.userName();
	a.password();
	a.login();
}
}
