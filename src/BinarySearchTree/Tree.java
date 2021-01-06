package BinarySearchTree;

public class Tree {
	private TreeNode root;
	public void insert(int value) {
		if(root == null) {
			root = new TreeNode(value);
		}else {
			root.insert(value);
		}
	}
	
	public int min() {
		if(root == null) {
			return Integer.MIN_VALUE;
		}else {
			return root.min();
		}
	}
	
	public int max() {
		if(root == null) {
			return Integer.MAX_VALUE;
		}else {
			return root.max();
		}
	}
	
	public void traverseInOrder() {
		if(root !=null) {
			root.traverseInOrder();
		}
	}
	
	public TreeNode get(int value) {
		if(root !=null) {
			return root.get(value);
		}
		return null;
	}
	
	public void delete(int value) {
//		we are passing the root of the subtree, and the value we want to delete
		root = delete(root, value);
	}
	
	private TreeNode delete(TreeNode subtreeRoot, int value) {
		if(subtreeRoot == null) {
			return subtreeRoot;
		}
		if(value < subtreeRoot.getData()) {
			subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
		}else if(value > subtreeRoot.getData()) {
			subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
		}else {
//			cases 1 and 2: node to delete has 1 or 2 children
			if(subtreeRoot.getLeftChild()==null) {
				return subtreeRoot.getRightChild();
			}else if(subtreeRoot.getRightChild()==null) {
				return subtreeRoot.getLeftChild();
			}
		}
		return subtreeRoot;
	}
}
