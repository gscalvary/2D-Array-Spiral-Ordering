package com.oliver;

public class Main {

    public static void main(String[] args) {

        SpiralTraverser<Integer> st = new SpiralTraverser<Integer>();
        Integer[][] array = new Integer[][]{{1, 2, 3, 4},
                                            {5, 6, 7, 8},
                                            {9, 10, 11, 12}};
        st.traverse(array);
    }
}
