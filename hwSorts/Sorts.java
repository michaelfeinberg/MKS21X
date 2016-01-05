public class Sorts{
    public static void printArray(int[] ary){
	String retString = "{";
	for(int x = 0;x<ary.length-1;x++){
	    retString += ary[x] + ",";
	   
	}
	System.out.println(retString + ary[ary.length-1]+"}");
    }
    public static void insertionSort(int[] data){
	int temp;
	for(int x = 0;x<data.length;x++){
	    temp = data[x];
	    int replacer;
	    for(replacer = x;replacer>0 && temp<data[replacer-1];replacer--){
		data[replacer] = data[replacer-1];
	    }
	    data[replacer] = temp;
	}
    }
    public static int[] selectionSort(int[] data){
	int placeholder;
	int index;
	for(int x = 0;x<data.length;x++){
	    placeholder = data[x];
	    index = x;
	    for(int y = x;y<data.length;y++){
		if (placeholder > data[y]){
		    placeholder = data[y];
		    index = y;
		}
	    }
	    data[index] = data[x];
	    data[x] = placeholder;
	}
	return data;
    }
    
    public static int[] bubbleSort(int[] data){
	
	int holder;
	int x = 0;
	do{
	    for(int j = 0;j<data.length-x-1;j++){
		
		if(data[j]>data[j+1]){
		    holder = data[j];
		    data[j] = data[j+1];
		    data[j+1]=holder;
		    
		}
	    }
	    x++;
	}while(x<data.length-1);
	return data;
    }

    public static void main(String[]args){
	int[] a = {8,0,4,3,6,6,7,234,-1,3,4,8,123};
	int[] b = {8,-2,-1};
	/*Sorts.printArray(a);
	Sorts.insertionSort(a);
	Sorts.printArray(a);
	Sorts.insertionSort(b);
	Sorts.printArray(b);
	*/
	Sorts.printArray(a);
	Sorts.bubbleSort(a);
	Sorts.printArray(a);
    }
}