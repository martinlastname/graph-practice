Node.class: Node.java
	javac Node.java

BinaryTree.class: BinaryTree.java Node.class
	javac BinaryTree.java

all: Main.java Node.class BinaryTree.class
	javac Main.java
	java Main

clean:
	rm *.class
