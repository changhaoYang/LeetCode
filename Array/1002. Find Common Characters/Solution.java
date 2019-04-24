class Solution {
    public List<String> commonChars(String[] A) {
        // i++返回原来的值，++i返回+1后的值
        List<String> ans = new ArrayList<>();   // 动态数组存放结果
        int[] count = new int[26];              // 存放字母的出现次数
        Arrays.fill(count, Integer.MAX_VALUE);  // 先将频率全改为最大数
        for (String str : A) {                  // 遍历字符串数组
            int[] cnt = new int[26];
            for (char c : str.toCharArray()) {  // 计算每一个单词字母频率
                cnt[c - 'a']++; 
            } 
            for (int i = 0; i < 26; i++) {      // 更新最小频率
                count[i] = Math.min(cnt[i], count[i]); 
            } 
        }
        for (int i = 0; i < 26; i++) {
            while (count[i]-- > 0) { 
                ans.add("" + (char)(i + 'a'));  // 转换为字母
            }
        }
        return ans;
    }
}