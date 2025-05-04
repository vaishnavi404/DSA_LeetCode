class Solution {
    public String longestCommonPrefix(String[] strs) {
        Optional<String>ShortestString=Arrays.stream(strs).min((a,b)->a.length()-b.length());
          return ShortestString.map(minStr -> 
          { 
            return IntStream.range(0, minStr.length())
            .takeWhile(i->Arrays.stream(strs)
                         .allMatch(s->s.charAt(i)==minStr.charAt(i)))
                         .mapToObj(i -> String.valueOf(minStr.charAt(i)))
                         .collect(Collectors.joining());
          }).orElse("");
          
          
    }
}