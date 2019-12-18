import java.util.ArrayList;
import java.util.Scanner;

public class IntBinarySearchTree<T> {
    BSTElement<Integer> root;
    ArrayList<BSTIterator<T>> lista_iterator = new ArrayList<>();

    void addElement(int data) {

        for (BSTIterator<T> seed : lista_iterator) {
            seed.IndexNow = 0;
            seed.tree.clear();
        }

        if (root == null) {
            BSTElement<Integer> newElement = new BSTElement<>();
            newElement.data = data;
            root = newElement;
        } else {
            BSTElement<Integer> newElement = new BSTElement<>();
            newElement.data = data;
            BSTElement<Integer> pointer = root; // temp1
            BSTElement<Integer> last_pointer = null; // temp2

            while (pointer != null) { // szuka wolnego liscia
                last_pointer = pointer;
                if (newElement.data < pointer.data) {
                    pointer = pointer.leftChild;
                } else {
                    pointer = pointer.rightChild;
                }
            }

            if (last_pointer == null) {
                last_pointer = newElement;
            } else if (newElement.data < last_pointer.data) {
                last_pointer.leftChild = newElement;

            } else {
                last_pointer.rightChild = newElement;
            }

        }
    }


    private class PreorderIterator extends BSTIterator<Integer> {

        PreorderIterator() { //konstruktor
            super(root);
            wypelnij(root);
        }

        public void see(BSTElement node) { // przechodzi tree
            if (node != null) {
                tree.add(node);
                see(node.leftChild);
                see(node.rightChild);
            }
        }

        @Override
        void wypelnij(BSTElement<Integer> tr) {
            see(root);
        }
    }

    public Iterator<Integer> preorderIterator() {
        PreorderIterator it = new PreorderIterator();
        lista_iterator.add((BSTIterator<T>) it);
        return it;
    }

    private class InOrderIterator extends BSTIterator<Integer> {

        InOrderIterator() { //konstruktor
            super(root);
            wypelnij(root);
        }

        public void see(BSTElement node) { // przechodzi tree
            if (node != null) {
                see(node.leftChild);
                tree.add(node);
                see(node.rightChild);
            }
        }

        @Override
        void wypelnij(BSTElement<Integer> tr) {
            see(root);
        }
    }

    public Iterator<Integer> InOrderIterator() {
        InOrderIterator it = new InOrderIterator();
        lista_iterator.add((BSTIterator<T>) it);
        return it;
    }

    private class PostIterator extends BSTIterator<Integer> {

        PostIterator() { //konstruktor
            super(root);
            wypelnij(root);
        }

        public void see(BSTElement node) { // przechodzi tree
            if (node != null) {
                see(node.leftChild);
                see(node.rightChild);
                tree.add(node);
            }
        }

        @Override
        void wypelnij(BSTElement<Integer> tr) {
            see(root);
        }
    }

    public Iterator<Integer> PostIterator() {
        PostIterator it = new PostIterator();
        lista_iterator.add((BSTIterator<T>) it);
        return it;
    }

    @Override
    public String toString() {
        StringBuilder SB = new StringBuilder();
       for(int i = 0; i<lista_iterator.size(); i++)
       { SB.append(lista_iterator.get(i)).append(" ");}
        return SB.toString();
    }

    public static void main(String[] args) {
        IntBinarySearchTree mytree = new IntBinarySearchTree();
        System.out.println("Podaj cyfry oddzielone spacją");
        Scanner s = new Scanner(System.in);
        String[] inputs  = (s.nextLine().split(" "));
        int Integers[] = new int [inputs.length]; // tworzy tablice int o dlugosci tablicy stringów

        for (int i = 0; i < inputs.length; i++){ // potrzebna nowa pętla, gdyż nie ma konwertacji string[]->int[]
            Integers[i] = Integer.parseInt(inputs[i]);
        }
        for(int i: Integers){
            mytree.addElement(i);
        }

        Iterator<Integer> post = mytree.PostIterator();
        Iterator<Integer> pre  = mytree.preorderIterator();
        Iterator<Integer> in  = mytree.InOrderIterator();

        while(post.hasNext()){
            System.out.print(post.next());
        }
        System.out.println();
        while(pre.hasNext()){
            System.out.print(pre.next());
        }
        System.out.println();
        while(in.hasNext()){
            System.out.print(in.next());
        }

    }
}