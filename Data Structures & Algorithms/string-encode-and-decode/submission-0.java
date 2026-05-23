class Solution {


    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();

        for (String s : strs) {
            encoded.append(s.length()).append('#').append(s);
        }

        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();

        int index = 0;
        while (index < str.length()) {
            int delimiterIndex = str.indexOf('#', index);
            int length = Integer.parseInt(str.substring(index, delimiterIndex));
            int start = delimiterIndex + 1;
            int end = start + length;
            decoded.add(str.substring(start, end));
            index = end;
        }

        return decoded;
    }

}