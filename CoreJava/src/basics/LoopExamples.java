package basics;

public class LoopExamples {

	public static void main(String[] args) {
		String names[] = { "Rahul", "Arun", "Peter", "Seema", "Alen" };

		/*
		 * System.out.println("======FOR======="); for(int i = 0 ; i <
		 * names.length ; i ++) { System.out.println(names[i]); }
		 * System.out.println("====Enhanced For Loop===="); for(String name :
		 * names) { System.out.println(name); }
		 * 
		 * System.out.println("======WHILE======="); int idxWhile = 0;
		 * while(idxWhile < names.length) {
		 * System.out.println(names[idxWhile++]); }
		 * 
		 * System.out.println("======DO WHILE======="); int idxDoWhile = 0; do {
		 * System.out.println(names[idxDoWhile++]); } while (idxDoWhile <
		 * names.length);
		 */

		int folksIdx = 0;
		/**
		 * If you want to have for loop to run infinite number of times then use for(;;)
		 */
//		for (;;)
		while(true){
			System.out.println("Hello Folks " + folksIdx++);
			if(folksIdx == 3000){
				break;
			}
		}
		
		System.out.println("Hello Guys");
		
		
		
		
		
	}

}
