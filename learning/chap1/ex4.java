class Ex4
{
    private static final String STR_SPACE = " ";

    public static void main(String[] args)
    {
        String input = "Mr ABC DEF  ";
        System.out.println(convert(input));
    }

    public static String convert(String input)
    {
        String target = input.trim();
        String[] strArray = new String[target.length()];

        String tmp;
        for (int i = 0; i < target.length(); i++) {
            tmp = String.valueOf(target.charAt(i));
            if (tmp.equals(STR_SPACE)) {
                strArray[i] = "%20";
                continue;
            }
            strArray[i] = tmp;
        }

        StringBuffer sentence = new StringBuffer();
        for (String w : strArray) {
            sentence.append(w);
        }

        return sentence.toString();
    }
}
