public class Traversal {
  public static void main(String[] args) {
    TreeNode<String> Stringroot = new TreeNode<String>("lol", null, null);
    Stringroot.left = new TreeNode<String>("Laugh", null, null);
    Stringroot.right = new TreeNode<String>("Chuckle", null, null);

    TreeNode<Integer> root = new TreeNode<Integer>(10, null, null);
    root.left = new TreeNode<Integer>(9, null, null);
    root.left.left = new TreeNode<Integer>(5, null, null);
    root.left.right = new TreeNode<Integer>(2, null, null);
    root.right = new TreeNode<Integer>(15, null, null);
    root.right.left = new TreeNode<Integer>(-3, null, null);
    root.right.right = new TreeNode<Integer>(5, null, null);
    root.right.right.right = new TreeNode<Integer>(22, null, null);

    preOrder(root);
    System.out.println();
    postOrder(root);
    System.out.println();
    inOrder(root);
    System.out.println();
    inOrder(Stringroot);
    System.out.println();
    preOrderGreater(root);
    System.out.println();
    System.out.println(countNodes(root));
    System.out.print(countNodes(Stringroot));
  }
  public static void preOrder(TreeNode<?> node){
    if (node == null) return;
    System.out.print(node.value);
    preOrder(node.left);
    preOrder(node.right);
  }
  public static void postOrder(TreeNode<?> node){
    if (node == null) return;
    postOrder(node.left);
    postOrder(node.right);
    System.out.print(node.value + " ");
  }
  public static void inOrder(TreeNode<?> node){
    if (node == null) return;
    inOrder(node.left);
    System.out.print(node.value + " ");
    inOrder(node.right);
  }
  public static void preOrderGreater(TreeNode<Integer> node){
    if (node == null) return;
    if (node.value > 7) {
      System.out.print(node.value + " ");
    }
    preOrderGreater(node.left);
    preOrderGreater(node.right);
  }
  public static int countNodes(TreeNode<?> node) {
    if (node == null) return 0;
    if (node.right == null && node.left == null) return 1;
    return countNodes(node.right) + countNodes(node.left) + 1;
  }
}
