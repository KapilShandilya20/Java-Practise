class Table {
	public static void main(String[] args) {
		int i;
		int j;


		for(i = 10 ; i <= 20 ; i++) {
			System.out.println("The table of: " +i);
			for(j = 1 ; j <= 10 ; j++) {
				System.out.println(i*j);
			}
			System.out.println(" ");
		}
	}
}