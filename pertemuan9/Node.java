package pertemuan9;

public class Node {

	    private int data;
	    private Node next;

	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }

	    public Node getNext() {
	        return next;
	    }

	    public void setNext(Node next) {
	        this.next = next;
	    }

	    public int getNilai() {
	        return data;
	    }
	}

