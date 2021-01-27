package boj;

import java.util.Scanner;

public class LCS9251 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//���ڿ� �� �� �Է¹ޱ�
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		int size1 = str1.length();
		int size2 = str2.length();
		
		//�� �κ� ���ڿ��� ���� LCS�� ����� �迭 ����
		int lcs[][] = new int[size1+1][size2+1];
		
		//ǥ ä���ֱ�
		for (int i = 0; i < size1; i++) {
			for (int j = 0; j < size2; j++) {
				if(str1.charAt(i)==str2.charAt(j))
					lcs[i+1][j+1] = lcs[i][j] + 1;
				else
					lcs[i+1][j+1] = Math.max(lcs[i][j+1], lcs[i+1][j]);
			}
		}
		
		//��� ���
		System.out.print(lcs[size1][size2]);
		
		sc.close();
	}

}
