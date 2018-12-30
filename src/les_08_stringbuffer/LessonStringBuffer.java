package les_08_stringbuffer;

public class LessonStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World! Java ");
        sb.append("courses!");
        System.out.println(sb);
        sb.setCharAt(sb.length() - 1,'?');
        System.out.println(sb);
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
        int index = sb.indexOf("World");
        System.out.println(index);
        int index2 = sb.lastIndexOf("d");
        System.out.println(index2);
        sb.delete(5,11);
        System.out.println(sb);
        sb.insert(7,"MAUP ");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.replace(7,11,"KPI");
        System.out.println(sb);
    }
}
