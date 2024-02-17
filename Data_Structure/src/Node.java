class Node {
	//Data
	public final Integer key; 		// associated data
	public final boolean color;   	//fales = red
	public static Node left, right;

	// Constructor
	public Node(Integer data, boolean color){
			 this.key = data;
			 this.color = color;
		 }
	public Node(Node l){
		this.key = l.key;
		this.color = l.color;
	}
	//Setters
	public void set_left(Node left){
		this.left = left;
	}
	public void set_right(Node right){
		this.right = right;
	}

	//Getters
	public Integer get_data(){return this.key;}
	public boolean get_color(){return this.color;}
	public Node get_left(){return this.left;}
	public Node get_right(){return this.left;}
	public boolean HasLeft(){
		return (this.get_left() != null);
	}
	public boolean HasRight(){
		return (this.get_right() != null);
	}



		 public String toString(){
			 String ans = this.key.toString() + " , ";
			 if (this.color) {
				 ans += "black";
			 }
			 else {ans += "red";
			 }
			return ans;
		 }
}

	
	
	
	
	
	

