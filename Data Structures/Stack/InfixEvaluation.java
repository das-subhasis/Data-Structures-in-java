package Stack;

import javax.lang.model.type.MirroredTypeException;

public class InfixEvaluation extends StackEval {
    InfixEvaluation(int capacity) throws Exception {
        super(capacity);
    }

    // Rules: (Scan from left to right)
    // 1. Priorities ['()','^','*,/','+,-']
    // 2. Associativity ['^':'L-R,'+,-': L-R,'*,/':L-R]
    // 3. No two operator of the same priorities can stay together
    // 4. Lowest priority operand can't be placed on top of highest priority operand

    public static boolean checkOperand(char chr) {
        return chr == '+' | chr == '-' | chr == '/' | chr == '*' | chr == '^' | chr == '(' | chr == ')';
    }

    public void pushOperands(String expression) throws Exception {
        for (char chr : expression.toCharArray()) {
            if (checkOperand(chr)) {
                if(super.empty()) {
                    super.push(chr);
                }
                else {
//                    if(chr)
                }
            }
        }
    }

}
