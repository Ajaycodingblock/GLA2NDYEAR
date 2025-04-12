class Asteroid_collison {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int a : asteroids) {
            boolean destroyed = false;

            // While current asteroid is moving left and the top of stack is moving right
            while (!stack.isEmpty() && a < 0 && stack.peek() > 0) {
                if (Math.abs(a) > stack.peek()) {
                    // Current asteroid is bigger, so the one in the stack explodes
                    stack.pop();
                } else if (Math.abs(a) == stack.peek()) {
                    // Both are equal in size, both explode
                    stack.pop();
                    destroyed = true;
                    break;
                } else {
                    // Current asteroid is smaller, so it gets destroyed
                    destroyed = true;
                    break;
                }
            }

            // If current asteroid didn't get destroyed, push it to the stack
            if (!destroyed) {
                stack.push(a);
            }
        }

        // Convert stack to array and return
        int[] result = new int[stack.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = stack.get(i);
        }
        return result;
    }
}
