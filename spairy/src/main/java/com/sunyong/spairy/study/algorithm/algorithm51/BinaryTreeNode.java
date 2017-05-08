package com.sunyong.spairy.study.algorithm.algorithm51;

public class BinaryTreeNode {

	private char key;

	private BinaryTreeNode left, right;

	public BinaryTreeNode(char key) {
		this(key, null, null);
	}

	public BinaryTreeNode(char key, BinaryTreeNode left, BinaryTreeNode right) {
		this.key = key;
		this.left = left;
		this.right = right;
	}

	public char getKey() {
		return key;
	}

	public void setKey(char key) {
		this.key = key;
	}

	public BinaryTreeNode getLeft() {
		return left;
	}

	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}

	public BinaryTreeNode getRight() {
		return right;
	}

	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}
}
