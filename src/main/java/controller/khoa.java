package controller;

import database.anhdao;
import model.anh;

public class khoa {
public static void main(String[] args) {
	long b = anhdao.soluong();
	anh a= new anh("4","4","4","4");
	anhdao.insertt(a);
	
	System.out.println(b);
	
}
	
	
}
