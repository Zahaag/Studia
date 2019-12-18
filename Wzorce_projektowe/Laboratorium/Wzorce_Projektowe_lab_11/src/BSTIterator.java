import java.util.ArrayList;

abstract class BSTIterator<T> implements Iterator<T> {
    ArrayList<BSTElement<T>> tree;
    int IndexNow;
    abstract void wypelnij(BSTElement<T> tr);
    void reset(BSTElement<T> root){
        wypelnij(root);
        IndexNow =0;
    }
    protected BSTIterator(BSTElement<T> root){
        tree = new ArrayList<>();
        reset(root);
    }
    @Override
    public boolean hasNext() {
        if(IndexNow>tree.size()) return false;
        else return true;
    }
    @Override
    public T next() {
        int temp = IndexNow;
        IndexNow++;
        return tree.get(temp).data;
    }
}
