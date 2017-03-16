package io.github.xudaojie;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * Created by xdj on 2017/3/16.
 * java BinarySearch tinyW.txt < tinyT.txt
 * "java < tinyT.txt" 表示输入流由tinyT.txt文件中读取，而不是等待用户在终端输入
 */
public class BinarySearch {
    public static int rank(int key, int[] a) {
        return -1;
    }

    public static void main(String[] args) {
        // 打印不存在与白名单中的标准输入流数据
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();
        Arrays.sort(whitelist);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whitelist) < 0)
                StdOut.println(key);
        }
    }
}
