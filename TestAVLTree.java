public class TestAVLTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AVLTree avl = new AVLTree(1);
		avl.add(2);
		avl.add(3);
		avl.add(4);
		avl.add(5);
		avl.add(6);
		avl.add(7);
		avl.add(8);
		avl.add(9);
		avl.add(10);

		System.out.println(avl);
		System.out.println("");

		System.out.println("1 검색 결과 : "+avl.search(avl, 1));
		System.out.println("3 검색 결과 : "+avl.search(avl, 3));
		System.out.println("5 검색 결과 : "+avl.search(avl, 5));
		System.out.println("11 검색 결과 : "+avl.search(avl, 11));

		System.out.println(" 1 삭제");
		avl.remove(1);
		System.out.println(avl);

		System.out.println(" 3 삭제");
		avl.remove(3);
		System.out.println(avl);

		System.out.println(" 5 삭제 ");
		avl.remove(5);
		System.out.println(avl);
		
		System.out.println(" 11 삭제 ");
		avl.remove(11);
		System.out.println(avl);

	}

}