package behavioral.interpreter.developer_cv_scanner;

public class DeveloperCvScanner {

    public static Expression getJavaDeveloperExpression() {
        TerminalExpression java = new TerminalExpression("java");
        TerminalExpression javaCore = new TerminalExpression("java core");

        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaEEDeveloperExpression() {
        TerminalExpression java = new TerminalExpression("java");
        TerminalExpression spring = new TerminalExpression("spring");

        return new AndExpression(java, spring);
    }

    public static void main(String[] args) {

        Expression isJava = getJavaDeveloperExpression();
        Expression isJavaEE = getJavaEEDeveloperExpression();

        String competencyFromCV_1 = "java";
        String competencyFromCV_2 = "java spring";
        String competencyFromCV_3 = "java core";
        String competencyFromCV_4 = "java";

        System.out.println("Does CV_1 developer know Java core? " + isJava.interpret(competencyFromCV_1));
        System.out.println("Does CV_2 developer know JavaEE? " + isJavaEE.interpret(competencyFromCV_2));
        System.out.println("Does CV_3 developer know Java core? " + isJava.interpret(competencyFromCV_3));
        System.out.println("Does CV_4 developer know JavaEE? " + isJavaEE.interpret(competencyFromCV_4));

    }
}
