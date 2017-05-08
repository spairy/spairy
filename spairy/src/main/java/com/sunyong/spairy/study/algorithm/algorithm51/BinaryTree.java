package com.sunyong.spairy.study.algorithm.algorithm51;

import java.util.LinkedList;
import java.util.Stack;

public class BinaryTree {

	/** 访问节点 */
	public static void visit(BinaryTreeNode p) {
		System.out.print(p.getKey() + " ");
	}

	/** 递归实现前序遍历 */
	protected static void preorder(BinaryTreeNode p) {
		if (p != null) {
			visit(p);
			preorder(p.getLeft());
			preorder(p.getRight());
		}
	}

	/** 递归实现中序遍历 */
	protected static void inorder(BinaryTreeNode p) {
		if (p != null) {
			inorder(p.getLeft());
			visit(p);
			inorder(p.getRight());
		}
	}

	/** 递归实现后序遍历 */
	protected static void postorder(BinaryTreeNode p) {
		if (p != null) {
			postorder(p.getLeft());
			postorder(p.getRight());
			visit(p);
		}
	}

	/** 非递归实现前序遍历 */
	protected static void iterativePreorder(BinaryTreeNode p) {
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		if (p != null) {
			stack.push(p);
			while (!stack.empty()) {
				p = stack.pop();
				visit(p);
				if (p.getRight() != null)
					stack.push(p.getRight());
				if (p.getLeft() != null)
					stack.push(p.getLeft());
			}
		}
	}
	
	/** 非递归实现后序遍历 */
	protected static void iterativePostorder(BinaryTreeNode p) {
		BinaryTreeNode q = p;
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		while (p != null) {
			// 左子树入栈
			for (; p.getLeft() != null; p = p.getLeft())
				stack.push(p);
			// 当前节点无右子或右子已经输出
			while (p != null && (p.getRight() == null || p.getRight() == q)) {
				visit(p);
				q = p;// 记录上一个已输出节点
				if (stack.empty())
					return;
				p = stack.pop();
			}
			// 处理右子
			stack.push(p);
			p = p.getRight();
		}
	}

	/** 非递归实现中序遍历 */
	protected static void iterativeInorder(BinaryTreeNode p) {
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		while (p != null) {
			while (p != null) {
				if (p.getRight() != null)
					stack.push(p.getRight());// 当前节点右子入栈
				stack.push(p);// 当前节点入栈
				p = p.getLeft();
			}
			p = stack.pop();
			while (!stack.empty() && p.getRight() == null) {
				visit(p);
				p = stack.pop();
			}
			visit(p);
			if (!stack.empty())
				p = stack.pop();
			else
				p = null;
		}
	}
	
	/* 层次遍历  --- 即位广度优先遍历 bfs */
	public static void levelIterator(BinaryTreeNode root) {
		if (root == null) {
			return;
		}
		LinkedList<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		BinaryTreeNode current = null;
		queue.offer(root);// 将根节点入队
		while (!queue.isEmpty()) {
			current = queue.poll();// 出队队头元素并访问
			System.out.print(current.getKey() + "-->");
			if (current.getLeft() != null)// 如果当前节点的左节点不为空入队
			{
				queue.offer(current.getLeft());
			}
			if (current.getRight() != null)// 如果当前节点的右节点不为空，把右节点入队
			{
				queue.offer(current.getRight());
			}
		}
	}
	
	/* 深度优先遍历 */

	/* 广度优先遍历 */
}
