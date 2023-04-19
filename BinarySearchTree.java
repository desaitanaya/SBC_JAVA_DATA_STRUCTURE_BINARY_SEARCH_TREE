public class BinarySearchTree {
	class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	Node root;

	void insert(int data) {
		root = insertData(root, data);
	}

	Node insertData(Node root, int data) {
		// Insert a new node if tree is empty
		if (root == null) {
			root = new Node(data);
		}
		/*
		 * If data is less than the root node 
		 * then insert the data to left of the root
		 * node
		 */
		if (data < root.data) {
			root.left = insertData(root.left, data);
		}
		/*
		 * If data is greater than the root node 
		 * then insert the data to right of the
		 * root node
		 */
		else if (data > root.data) {
			root.right = insertData(root.right, data);

		}
		return root;
	}

	void display() {
		displayNode(root);
	}

	void displayNode(Node root) {
		// Traversing the tree
		if (root != null) {
			// Displaying the left elements of the root node
			displayNode(root.left);

			// Displaying the root node
			System.out.print(root.data + ",");

			// Displaying the right elements of the root node
			displayNode(root.right);
		}

	}

	public static void main(String[] args) {
		BinarySearchTree bt = new BinarySearchTree();
		
		System.out.println();
		System.out.println("BINARY SEARCH TREE");
	
		bt.insert(56);
		bt.insert(30);
		bt.insert(22);
		bt.insert(40);
		bt.insert(11);
		bt.insert(3);
		bt.insert(16);
		bt.insert(70);
		bt.insert(60);
		bt.insert(95);
		bt.insert(65);
		bt.insert(63);
		bt.insert(67);

		bt.display();
	}
}