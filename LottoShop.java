package lotto;

import java.util.Random;

public class LottoShop {
	private int[] lottoBall = new int[45];
	private int temp;
	private int rndN;
	private Random rnd = new Random();
	
	int[] createBall () {
		for(int i = 0; i < lottoBall.length; i++) {
			lottoBall[i] = i + 1;
		}
		return lottoBall;
	}
	
	int[] suffleBall (int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			rndN = rnd.nextInt(45);
			temp = arr[i];
			arr[i] = arr[rndN];
			arr[rndN] = temp;
		}
		return arr;
	}
	
	int[] currentBall(int[] arr) {
		int[] currentBall = new int[7];
		for(int i = 0; i < currentBall.length; i++) {
			currentBall[i] = arr[i];
		}
		return currentBall;
	}
	
	
	int[] arrSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i; j < arr.length - 1; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	void answerCheck(int[] lotto, int[] user) {
		String[] answer = new String[6];
		int cnt = 0;
		int ansCnt = 0;
		
		for(int i = 0; i < lotto.length; i++) {
			for(int j = 0; j < user.length; j++) {
				if(lotto[i] == user[j]) {
					answer[cnt] = "("+user[j]+")";
					cnt++;
					ansCnt++;
				} else if(j == user.length - 1) {
					answer[cnt] = ""+user[j]+"";
					cnt++;
				}
			}
		}
	}
	
}































