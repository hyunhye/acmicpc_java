import java.util.Scanner;

public class Main {

	public static int[] arr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N;
		Scanner scanner = new Scanner(System.in);

		N = scanner.nextInt();
		arr = new int[N];
		for (int i = 0; i < N; i++)
			arr[i] = scanner.nextInt();

		HeapSort heapSort = new HeapSort();
		heapSort.heapSort(arr);
		
		for (int i = 0; i < N; i++)
			System.out.println(arr[i]);
	}

}

class HeapSort {
	public static void heapSort(int[] arr){
		Heap heap = new Heap();
		
		for(int i = 0 ; i < arr.length ; i++)
			heap.insertHeap(arr[i]);
		
		for(int i = arr.length -1 ; i>=0 ; i--)
			arr[i] = heap.deleteHeap();
		
		
	}
}

class Heap {
	private int heapSize;
	private int itemHeap[];

	public Heap() {
		heapSize = 0;
		itemHeap = new int[1000000];
	}

	public void insertHeap(int item) {
		int i = ++heapSize;

		while ((i != 1) && (item > itemHeap[i / 2])) { // 부모 자식보다 크면
			itemHeap[i] = itemHeap[i / 2];
			i /= 2;
		}

		itemHeap[i] = item;
	}

	public int getHeapSize() {
		return this.heapSize;
	}

	public int deleteHeap() {
		int parent, child;
		int item, tmp;

		item = itemHeap[1];
		tmp = itemHeap[heapSize--];
		parent = 1;
		child = 2;

		while (child <= heapSize) {
			if ((child < heapSize) && itemHeap[child] < itemHeap[child + 1])
				child++;

			if (tmp >= itemHeap[child])
				break;

			itemHeap[parent] = itemHeap[child];
			parent = child;
			child *= 2;

		}

		itemHeap[parent] = tmp;
		return item;
	}
}