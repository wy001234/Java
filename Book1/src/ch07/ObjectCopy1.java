package ch07;

public class ObjectCopy1 {
public static void main(String[] args) {
	Book[] library1 = new Book[3];
	Book[] library2 = new Book[3];
	
	library1[0] = new Book("태백산맨", "조정래");
	library1[1] = new Book("데미안","헤르만 헤세");
	library1[2] = new Book("어떻게 살것인가","유시민");
	System.arraycopy(library1, 0, library2, 0, 3);
	
	for(int i =0; i < BookArray2.length; i++) {
		 BookArray2[i].showBookInfo();
	}
}
}
