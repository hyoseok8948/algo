package relay;

import java.util.Scanner;

public class C1 {
	static class Tree{
		int val;
		Tree left;
		Tree right;
		
		Tree(int val){
			this.val = val;
			
		}
	}
	
	static Tree[] nodeL;
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int testCase = sc.nextInt();
	
	for(int tc = 1; tc <= testCase; tc++) {
		int E = sc.nextInt();
		nodeL = new Tree[E+2];
		
		Tree root = new Tree(1);
		nodeL[1] = root;
		
		for(int i = 0; i < E ; i++) {
			int parent = sc.nextInt();
			int child = sc.nextInt();
			
			if(nodeL[parent] == null) nodeL[parent] = new Tree(parent);
			if(nodeL[child] == null) nodeL[child] = new Tree(child);
			
			Tree parentN = nodeL[parent];
			Tree childN = nodeL[child];
			
			if(parentN.left == null) {
				parentN.left = childN;
			} else if(parentN.right == null) {
				parentN.right = childN;
			}
		}
		
		int max = findM(root, 1);
		int[] result = new int[max + 1];
		pArray(root, 1, result);
		
		System.out.print("#" + tc + " ");
		for(int i = 1; i < result.length; i++) {
			System.out.print(result[i] + " ");
		} System.out.println();
		
	}
	

	}
	public static int findM(Tree node, int index) {
		if(node == null) {
			return 0;
		}
		int leftM = findM(node.left, index *2);
		int rightM = findM(node.right, index*2 +1);
		return Math.max(index, Math.max(leftM, rightM));
	}
	
	public static void pArray(Tree node, int index, int[] arr) {
		if(node == null || index >= arr.length) {
			return;
		}
		
		arr[index] = node.val;
		pArray(node.left, index *2, arr);
		pArray(node.right, index * 2+1, arr);
	}

}
