package com.sunyong.spairy.study.algorithm.algorithm73;

public class SegmentTree {

	private static final int MAXN = 10000;
	private static SegmentTreeNode[] tree = new SegmentTreeNode[MAXN];
	private static int tod = 0;
	private static int min, max, number = 0;
	
	public static void build(int min0, int max0) {
		tod++;
		int now = tod;
		tree[now] = new SegmentTreeNode();
		tree[now].min = min0;
		tree[now].max = max0;
		if (max0 - min0 >= 1) {
			int mid = (min0 + max0) >> 1;
			tree[now].left = tod + 1;
			build(min0, mid);
			tree[now].right = tod + 1;
			build(mid + 1, max0);
		}
	}
	
	public static void insert(int num) {
		if (min <= tree[num].min && max >= tree[num].max) {
			tree[num].cover++;
		} else if (max < tree[num].min || min > tree[num].max) {
			return;
		} else {
			int mid = (tree[num].min + tree[num].max) >> 1;
			if (min <= mid) {
				insert(tree[num].left);
			}
			if (max >= mid) {
				insert(tree[num].right);
			}
		}
	}
	
	public static void del(int num) {
		if (min <= tree[num].min && max >= tree[num].max) {
			tree[num].cover--;
		} else {
			int mid = (tree[num].min + tree[num].max) / 2;
			if (min <= mid) {
				del(tree[num].left);
			}
			if (max >= mid) {
				del(tree[num].right);
			}
		}
	}

	public static void count(int num) {
		if (tree[num].cover != 0) {
			number += tree[num].max - tree[num].min + 1;
		} else {
			if (tree[num].left != 0) {
				count(tree[num].left);
			}

			if (tree[num].right != 0) {
				count(tree[num].right);
			}
		}
	}
}
