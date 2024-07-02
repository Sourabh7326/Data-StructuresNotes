import java.util.*;

class histogram {
    public int largestRectangleArea(int[] h) {
        if (h.length == 1) return h[0]; // single bar
        
        int[] prevSmall = new int[h.length];
        int[] nextSmall = new int[h.length];
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        
        // Calculate prev smaller index, if not found default value is -1
        for (int i = 0; i < h.length; i++) {
            while (!st1.isEmpty() && h[st1.peek()] >= h[i]) {
                st1.pop();
            }
            prevSmall[i] = st1.isEmpty() ? -1 : st1.peek();
            st1.push(i);
        }
        
        // Calculate next smaller index, if not found default value is h.length
        for (int i = h.length - 1; i >= 0; i--) {
            while (!st2.isEmpty() && h[st2.peek()] >= h[i]) {
                st2.pop();
            }
            nextSmall[i] = st2.isEmpty() ? h.length : st2.peek();
            st2.push(i);
        }
        
        // Calculate maximum area
        int maxArea = 0;
        for (int i = 0; i < h.length; i++) {
            int width = nextSmall[i] - prevSmall[i] - 1;
            int area = h[i] * width;
            maxArea = Math.max(maxArea, area);
        }
        
        return maxArea;
    }
}
