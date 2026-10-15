
class TimeMap {
    
    class Entry{
        int timeStamp; 
        String value;

        public Entry(int timeStamp, String value){
            this.timeStamp = timeStamp;
            this.value = value;
        }
    }
    Map<String, List<Entry>> map;

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timeStamp) {
        List<Entry> list = map.getOrDefault(key, new ArrayList<>());
        list.add(new Entry(timeStamp, value));
        map.put(key, list);

    }
    
    public String get(String key, int timeStamp) {
        if (!map.containsKey(key)){return "";}
        List<Entry> list = map.get(key); 
        return binarySearch(list, timeStamp);
        
    }

    private String binarySearch(List<Entry> list, int timeStamp){
        int left = 0;
        int right = list.size() - 1; 
        String result = ""; 

        while (left <= right){
            int mid = left + (right - left) / 2; 

            if (list.get(mid).timeStamp <= timeStamp){
                result = list.get(mid).value; 
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        return result; 
    }
}
