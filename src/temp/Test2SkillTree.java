package temp;

import java.util.*;

public class Test2SkillTree {

    // 스킬트리
    public int Solution(String skill, String[] skill_trees) {
        int failure = 0;
        for(String test : skill_trees) {
            LinkedList<String> compareList = new LinkedList<>();
            String[] arr = String.valueOf(skill).split("");
            for(int i = 0; i<skill.length(); i++) {
                compareList.add(arr[i]);
            }

            Stack<String> stack = new Stack<>();
            for (int i = test.length()-1; i>=0; i--) {
                stack.push(String.valueOf(test.charAt(i)));
            }

            while(!stack.isEmpty()) {
                if(compareList.size() > 0) {
                    if (stack.peek().equals(compareList.get(0)) && compareList.contains(stack.peek())) {
                        compareList.remove(0);
                        stack.pop();
                    } else if (!stack.peek().equals(compareList.get(0)) && compareList.contains(stack.peek())) {
                        failure++;
                        break;
                    } else {
                        stack.pop();
                    }
                } else {
                    break;
                }
            }
        }

        return skill_trees.length - failure;
    }

    public static void main(String[] args) {
        Test2SkillTree test = new Test2SkillTree();
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"}; // "BACDE", "CBADF", "AECB", "BDA"
        System.out.println(test.Solution(skill, skill_trees));
    }

}
