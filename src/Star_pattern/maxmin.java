package Star_pattern;


	public class maxmin{
		public static void main(String[] args) {
			int [] arr= {1,25,45,67,455};
			int max=Integer.MIN_VALUE;
			for(int i:arr) {
				if(i>max) {
					max=i;
				}
			
			
		}
			System.out.println("max element is"+max);
	}

}
