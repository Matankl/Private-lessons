/* ToDo:
1) is binery serch tree
in order to do this you have to save max,min
2) dose all roots has the same amount of black nodes
calc min and max and compare
 */
public class Ex3 {

    /*returns true if the tree is binary tree
    works by using an inner method that's gives boundaries to every bode data */
    public static boolean isValidBST(BinaryTree tree) {
        return isValidBST(tree.getRoot(),Integer.MAX_VALUE, Integer.MIN_VALUE);         //for the firs node there is no boundaries
    }
    //the main working method
    public static boolean isValidBST(Node curr,int max, int min) {
        //if the tree is empty return true
        if(curr == null){return true;}

        //check if the node follows the min max restriction and return false if not
        if(curr.get_data()<min || curr.get_data()>max){
            return false;
        }
        //recursive call on bouth childrens by tightening the boundaries
        return isValidBST(curr.get_right(),max, curr.get_data()+1) && isValidBST(curr.get_left(),curr.get_data()-1,min);

    }




    //returns true if all the roots from root to leafs have the same amount of black nodes
    public static boolean hasValidHeight(BinaryTree tree) {
    return hasValidHeight(tree.getRoot());
    }

    //this method counts the number of black nodes and return
    public static boolean hasValidHeight(Node curr) {
        if (curr == null){return true;}
        //return false if it dose nont have the same amount of blacks
        else if (max_number_of_black(curr)!=min_number_of_black(curr)) {return false;}
        //return if valid for the kids
        return hasValidHeight(curr.get_left()) && hasValidHeight(curr.get_right());

    }

    public static int max_number_of_black(Node curr) {
        //null nodes = nil nodes = black
        if(curr == null){return 1;}
        int righitco = max_number_of_black(curr.get_right());
        int leftco = max_number_of_black(curr.get_left());
        int nodecolnum =0;
        if (curr.get_color() == true){nodecolnum++;}
        return righitco <= leftco ? leftco+nodecolnum : righitco+nodecolnum;
    }
    public static int min_number_of_black(Node curr) {
        //null nodes = nil nodes = black
        if(curr == null){return 1;}
        int righitco = min_number_of_black(curr.get_right());
        int leftco = min_number_of_black(curr.get_left());
        int nodecolnum =0;
        if (curr.get_color() == true){nodecolnum++;}
        return righitco >= leftco ? leftco+nodecolnum : righitco+nodecolnum;
    }






}