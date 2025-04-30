class Solution {
     ArrayList<String>ans=new ArrayList<>();
    public List<String> letterCombinations(String digits){
if(digits.length()==0){return ans;}
else{
Combination("",digits);
return ans;
}
    
    }
      private void Combination(String processed, String unProcessed){
        if(unProcessed.isEmpty()){
           ans.add(processed);
            return;
        }
        int first=unProcessed.charAt(0)-'0';
        System.out.println(first);
        int start=(first-2)*3;
        int end=((first-2)*3)+3;
        if(first==8||first==9){start=((first-2)*3)+1; end=((first-2)*3)+4;}
        if(first==7||first==9){end=((first-2)*3)+4;}
        for(int i=start;i<end;i++){
            System.out.println(i);
            char ch=(char)('a'+i);
               System.out.println(processed+ch);
                 System.out.println(unProcessed.substring(1));
            Combination(processed+ch,unProcessed.substring(1));
        }
      } 
    
}