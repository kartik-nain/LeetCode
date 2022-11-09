class TimeMap {
    HashMap<String, TreeMap<Integer, String>> mainMap;
    
    public TimeMap() {
        mainMap = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!mainMap.containsKey(key)){
            mainMap.put(key, new TreeMap<Integer, String>());
        }
        mainMap.get(key).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        if(!mainMap.containsKey(key)){
            return "";
        }
        
        Integer ourKey = mainMap.get(key).floorKey(timestamp); //return the greatest key less than or equal to given                                                                    key from the parameter.
        if (ourKey != null) {
            return mainMap.get(key).get(ourKey);
        }
        
        return "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */