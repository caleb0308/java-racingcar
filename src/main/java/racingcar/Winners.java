package racingcar;

import java.util.ArrayList;

public class Winners {
	static int getMax(Car[] cars ) {   // 우승자를 가리는 메서드
		int max = cars[0].getCounter();  // 0번째 인덱스의 인스턴스가 가장 많이 전진했다고 가정한다.
		
		
		for (int i = 1; i < cars.length; i++) {   // 가장 많이 전진한 수를 구한다.
				if (max < cars[i].getCounter()) 
					max = cars[i].getCounter();
		}
		return max;
	}
	
	static ArrayList winners(Car[] cars) {
		int max =  getMax(cars);
		ArrayList winners = new ArrayList();   // 우승자를 저장할 ArrayList를 생성한다.
		for (int i = 0; i < cars.length; i++) {   // 인스턴스의 counter가 max와 같다면  winners에 추가한다.
			if (max == cars[i].getCounter())
				winners.add(cars[i]);
		}
		return winners;
	}
}
