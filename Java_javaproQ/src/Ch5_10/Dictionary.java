package Ch5_10;

public class Dictionary extends PairMap{
	
	public Dictionary(int n) {
		// TODO Auto-generated constructor stub
		keyArray = new String[n];
		valueArray = new String[n];
	}
	@Override
	String get(String key) {
		for(int i = 0; i < keyArray.length; i++) {
			if(keyArray[i] == key) {
				return valueArray[i];
			}
		}
		return null;
	}

	@Override
	void put(String key, String value) {
		// TODO Auto-generated method stub
		for(int i = 0; i < keyArray.length; i++) {
			if(keyArray[i] == key) {
				valueArray[i] = value;
				break;
			}
			if(keyArray[i] == null) {
				keyArray[i] = key;
				valueArray[i] = value;
				break;
			}
		}
	}

	@Override
	void delete(String key) {
		// TODO Auto-generated method stub
		for(int i = 0; i < keyArray.length; i++) {
			if(keyArray[i] == key) {
				keyArray[i] = null;
				valueArray[i] = null;
				break;
			}
		}
	}

	@Override
	int length() {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i = 0; i < keyArray.length; i++) {
			if(keyArray[i] != null) {
				count++;
			}
		}
		return count;
	}

}
