//question -- '''Array consists of 0s,1s and 2s write an algorithm
	//to sort this array in O(n) time complexty with one transverasal
//############################# AlgoRithm #########
//'''lower = 0 middle = 1 and high = 2
//if array[mid] = 2 then swapping mid to high and High--
//if array[mid] = 0 then swapping mid to low and low ++ ,mid++
//if array[mid]=1 then no swap only mid++''''''
	
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
