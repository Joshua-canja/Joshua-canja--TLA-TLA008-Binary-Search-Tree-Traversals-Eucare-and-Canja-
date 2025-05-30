package wow.tree;

/**
 *
 * @author Student's Account
 */
import java.util.Scanner;
import java.util.LinkedList;

public class Tree {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner scan = new Scanner(System.in);
        LinkedList<Integer> allowance = new LinkedList<>();

        while (true) {

            System.out.println(" ");
            System.out.println(">>>> Main Menu <<<<");
            System.out.println("1. Display Allowance");
            System.out.println("2. input Allowance of a student");
            System.out.println("3. Exit");
            System.out.print("Please chooce from options above: ");
            System.out.print(" ");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println(" ");
                        System.out.println(">>>> Choose From Options <<<<");
                        System.out.println("1. Acending order");
                        System.out.println("2. Decending order");
                        System.out.println("3. PreOrder ");
                        System.out.println("4. PostOrder ");
                        System.out.println("5. Exit");
                        System.out.println(" ");
                        System.out.print("Your Choice: ");
                        
                        int pili = scan.nextInt();
                        
                        switch (pili) {
                            case 1:
                            tree.inorder();
                            if (allowance.isEmpty()) {
                            System.out.println(" ");
                            System.out.println("No Allowance added yet.");
                            System.out.println("-------<>-------");
                                continue;

                            case 2:
                                HighToLow(tree.root, allowance);
                                for (int value : allowance) {
                                    System.out.println(value);
                                }
                            if (allowance.isEmpty()) {
                            System.out.println(" ");
                            System.out.println("No Allowance added yet.");
                            System.out.println("-------<>-------");
                                continue;

                            case 3:
                            tree.preorder();
                            if (allowance.isEmpty()) {
                            System.out.println(" ");
                            System.out.println("No Allowance added yet.");
                            System.out.println("-------<>-------");
                                continue;

                            case 4:
                            tree.postorder();
                            if (allowance.isEmpty()) {
                            System.out.println(" ");
                            System.out.println("No Allowance added yet.");
                            System.out.println("-------<>-------");
                                continue;
                                
                            case 5:
                                return;
                                
                            default:
                                System.out.println("Error Invalid Input");
                        }

                        System.out.println(" ");
                        System.out.println(">>>>> List of All Allowance <<<<<");
                            continue;
                        }
                        return;
                    }
                case 2:
                    System.out.print("Please Input Your Allowance: ");
                    int kwarta = scan.nextInt();
                    tree.insert(kwarta);
                    continue;
                case 3:
                    return;
                default:
                    System.out.println("Error: Invalid Input");
            }
        }
    }

    private static void HighToLow(Node root, LinkedList<Integer> allowance) {
        if (root != null) {
            HighToLow(root.right, allowance);
            allowance.add(root.value);
            HighToLow(root.left, allowance);
        }
    }
}
