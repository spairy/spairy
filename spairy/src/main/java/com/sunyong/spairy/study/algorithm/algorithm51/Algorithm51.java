package com.sunyong.spairy.study.algorithm.algorithm51;

import java.util.LinkedList;
import java.util.Stack;

public class Algorithm51 {
	
	static BinaryTreeNode root = null;
	
	static BinaryTreeNode separator = new BinaryTreeNode('0', null, null);
	
	public static void main(String[] args) {
		root = init();
		
		Stack<BinaryTreeNode> stack = levelIterator(root);
		
		if (null != stack) {
			BinaryTreeNode p = null;
			boolean tabFlag = false;
			while (!stack.empty()) {
				p = stack.pop();
				if (separator.equals(p)) {
					System.out.println();
					tabFlag = false;
				} else {
					if (tabFlag) {
						System.out.print("\t");
					}
					System.out.print(p.getKey());
					tabFlag = true;
				}
			}
			System.out.println();
		}
	}
	
	
	public static BinaryTreeNode init() {
		BinaryTreeNode h = new BinaryTreeNode('H', null, null);
		BinaryTreeNode g = new BinaryTreeNode('G', null, null);
		BinaryTreeNode f = new BinaryTreeNode('F', null, null);
		BinaryTreeNode e = new BinaryTreeNode('E', g, h);
		BinaryTreeNode d = new BinaryTreeNode('D', null, null);
		BinaryTreeNode c = new BinaryTreeNode('C', e, f);
		BinaryTreeNode b = new BinaryTreeNode('B', null, d);
		BinaryTreeNode a = new BinaryTreeNode('A', b, c);
		return a;
	}
	
	// 修改广度优先遍历，将结果入栈
	public static Stack<BinaryTreeNode> levelIterator(BinaryTreeNode root) {
		if (root == null) {
			return null;
		}
		LinkedList<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		BinaryTreeNode current = null;
		queue.offer(root);       // 将根节点入队
		queue.offer(separator);  // 层级标记
		stack.push(root);        // 将根节点入栈
		stack.push(separator);   // 层级标记
		while (!queue.isEmpty()) {
			current = queue.poll();// 出队队头元素并访问
			if (separator.equals(current)) {
				if (!queue.isEmpty()) {
					queue.offer(separator);
					stack.push(separator);
				}
			} else {
				if (current.getLeft() != null)// 如果当前节点的左节点不为空入队
				{
					queue.offer(current.getLeft());
					stack.push(current.getLeft());
				}
				if (current.getRight() != null)// 如果当前节点的右节点不为空，把右节点入队
				{
					queue.offer(current.getRight());
					stack.push(current.getRight());
				}
			}
		}
		stack.pop();
		return stack;
	}
}
