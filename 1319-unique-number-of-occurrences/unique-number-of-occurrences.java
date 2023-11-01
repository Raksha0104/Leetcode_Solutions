class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
        for(int i : arr ){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }

        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i: hm.keySet()){
            if(hs.contains(hm.get(i)))
                return false;
            else
                hs.add(hm.get(i));
        }
        return true;
    }
}