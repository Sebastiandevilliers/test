


public class BinaryTree {
	
	Node root;
		
		BinaryTree() {root = null;}
		
		void printPostorder(Node node){
			if (node == null)
				return;
				
				printPostorder (node.left);
				
				printPostorder (node.right);
				
				System.out.println(node.key + " ");
			}
			
			void printInorder(Node node)
			{
				if(node == null)
				return;
				
				
				
				printInorder(node.left);
				System.out.println(node.key + " ");
				printInorder(node.right);
			}
			
			void printPoster(){ printPostorder(root);}
			void printInorder(){printInorder(root);}
			void printPreorder(){printPreorder(root);}
	
	public static void main (String[] args) {
		
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		tree.printPreorder();
		tree.printInorder();
		tree.printPostorder();
		
		
		System.out.println("This is a test");
		
				
		
		
	}
	
	class Node{
		int key;
		Node left, right;
		
		public Node(int item)
		{
			key = item;
			left = right = null;
		}
	}

}

