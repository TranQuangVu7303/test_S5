package bai8;

import java.util.Scanner;

public class hinhVuong implements ShapeInterFace,IO_InterFace{
	protected double a;
	hinhVuong(){}
	
	public hinhVuong(double a) {
		this.a = a;
	}

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("moi ban nhap a : ");
		a=sc.nextDouble();		
	}

	@Override
	public void output() {
		System.out.println("hinh vuong["+a+"]");		
	}

	@Override
	public double calcArea() {
		return a*a;
	}

	@Override
	public double calcPerimeter() {
		return a*4;
	}

	



}
