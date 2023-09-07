package bai8;

import java.util.Scanner;

public class HinhChuNhat implements ShapeInterFace,IO_InterFace{
	protected double chieuDai,chieuRong;
	HinhChuNhat(){}
	public HinhChuNhat(double chieuDai, double chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("moi ban nhap chieu dai: ");
		chieuDai=sc.nextDouble();
		System.out.println("moi ban nhap chieu rong: ");
		chieuRong=sc.nextDouble();
	}
	@Override
	public void output() {
		System.out.println("hinh chu nhat["+chieuDai+","+chieuRong+"]");
		
	}
	@Override
	public double calcArea() {
		return chieuDai*chieuRong;
	}
	@Override
	public double calcPerimeter() {
		return (chieuDai+chieuRong)*2;
	};
	

}
