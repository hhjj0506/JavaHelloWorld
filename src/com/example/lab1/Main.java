package com.example.lab1;

import java.util.Scanner;

// edit
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Hello World!!!\n");
		System.out.print("�̸� �Է� : ");
		String name = s.next();
		s.close();
		System.out.println("[" + name + "]�� ȯ���մϴ�~");
	}

}
