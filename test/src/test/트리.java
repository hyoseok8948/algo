package test;

import java.util.Scanner;

public class 트리 {

	  // 이진 트리의 한 '노드'를 표현하기 위한 설계도
    static class Tree {
        int val;
        Tree left;
        Tree right;

        Tree(int val) {
            this.val = val;
        }
    }

    // 노드의 값을 인덱스로 사용하여 Tree 객체를 빠르게 찾기 위한 배열
    static Tree[] nodeLookup;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수

        for (int tc = 1; tc <= T; tc++) {
            int E = sc.nextInt(); // 간선의 수

            // 노드 객체들을 저장할 배열을 넉넉한 크기로 초기화
            nodeLookup = new Tree[E + 2]; 

            // 1. 트리 구축
            // 루트 노드는 항상 1이므로 미리 생성
            Tree root = new Tree(1);
            nodeLookup[1] = root;

            for (int i = 0; i < E; i++) {
                int parent = sc.nextInt();
                int child = sc.nextInt();

                // 부모/자식 노드가 배열에 없으면 새로 생성
                if (nodeLookup[parent] == null) {
                    nodeLookup[parent] = new Tree(parent);
                }
                if (nodeLookup[child] == null) {
                    nodeLookup[child] = new Tree(child);
                }
                
                Tree parentNode = nodeLookup[parent];
                Tree childNode = nodeLookup[child];

                // 부모의 왼쪽이 비어있으면 왼쪽에, 아니면 오른쪽에 자식을 연결
                if (parentNode.left == null) {
                    parentNode.left = childNode;
                } else {
                    parentNode.right = childNode;
                }
            } // 트리 구축 완료

            // 2. 필요한 배열의 최종 크기 계산
            int maxIndex = findMaxIndex(root, 1);
            int[] resultArray = new int[maxIndex + 1];

            // 3. 계산된 크기의 배열에 노드 값 채우기
            populateArray(root, 1, resultArray);

            // 4. 결과 출력
            System.out.print("#" + tc + " ");
            for (int i = 1; i < resultArray.length; i++) {
                System.out.print(resultArray[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
    /**
     * 트리를 재귀적으로 순회하며 필요한 배열의 최대 인덱스를 찾습니다.
     */
    public static int findMaxIndex(Tree node, int index) {
        if (node == null) {
            return 0;
        }
        int leftMax = findMaxIndex(node.left, index * 2);
        int rightMax = findMaxIndex(node.right, index * 2 + 1);
        return Math.max(index, Math.max(leftMax, rightMax));
    }
    
    /**
     * 트리를 재귀적으로 순회하며 배열에 노드 값을 채웁니다.
     */
    public static void populateArray(Tree node, int index, int[] arr) {
        if (node == null || index >= arr.length) {
            return;
        }
        arr[index] = node.val;
        populateArray(node.left, index * 2, arr);
        populateArray(node.right, index * 2 + 1, arr);
    }
}