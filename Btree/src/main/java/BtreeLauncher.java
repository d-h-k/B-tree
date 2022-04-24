import btree.Btree;
import shell.Shell;

public class BtreeLauncher {

    public static void main(String[] args) {
        Btree btree = new Btree();
        new Shell(btree);
    }


}
