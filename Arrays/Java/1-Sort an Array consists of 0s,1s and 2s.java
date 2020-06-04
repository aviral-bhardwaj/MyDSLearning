//question -- '''Array consists of 0s,1s and 2s write an algorithm
	//to sort this array in O(n) time complexty with one transverasal'''
	
	public static void sort(int [] array) {
		int low = 0,mid = 0;
		int high = array.length-1;
		
		while (mid <= high){
			if (array[mid] == 0){
				swap(array,low,mid);
				++low;
				++mid;
			}
			else if (array[mid] == 2){
				swap(array,mid,high);
				--high;
			}
			else
				++mid;		
			
		}

	}}
