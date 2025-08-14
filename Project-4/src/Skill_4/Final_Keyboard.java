package Skill_4;

public class Final_Keyboard {
	private final int blank_final_variable;

    public Final_Keyboard(int value) {
    	blank_final_variable = value;
    }

    public final void Final_Method() {
        System.out.println("This is the Final Keyword.");
    }

    public static void main(String[] args) {
    
        Final_Keyboard fnl = new Final_Keyboard(42);       
        fnl.Final_Method();
        System.out.println("Blank final variable value: " + fnl.blank_final_variable);
        final StringBuilder sb = new StringBuilder("Final keyword");
        System.out.println("Before append: " + sb);
        sb.append(" skill-4");
        System.out.println("Updated StringBuilder content: " + sb);
    }

}
