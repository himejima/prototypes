class Ex5
{
    private static final String STR_SPACE = " ";

    public static void main(String[] args)
    {
        // String input = "aabcccccaaa";
        String input = "abc";
        System.out.println(compression(input));
    }

    public static String compression(String input)
    {
        String target = input.trim();
        String current_line, prev_line;
        Integer count = 1;

        StringBuffer sentence = new StringBuffer();
        for (int i = 1; i < target.length(); i++) {
            current_line = String.valueOf(target.charAt(i));
            prev_line = String.valueOf(target.charAt(i - 1));

            if (current_line.equals(prev_line)) {
                count++;
            } else {
                String part = current_line + String.valueOf(count);
                sentence.append(part);
                count = 1;
            }

            if (i == target.length() - 1) {
                String last_part = current_line + String.valueOf(count);
                sentence.append(last_part);
            }
        }

        return (sentence.toString().length() >= input.length()) ? input : sentence.toString();
    }
}
