public class MyArrayList {
class MyVector<T>{
	private Object arr[] = null;
	private int count=0;
	
	T get(int idx) {
		return (T)arr[idx];
	}
	int size() {
		return count;
	}
	
	/**
	 *Vector의 add,remove기능을 직접 구현해보는 코드.
	 * @author 김서현
	 * @param data
	 */

	
	
	void add(T data) {
		if(count==0) {
			arr=new Object[1];
		}else {
			Object[] temp=arr;
			arr=new Object[count+1];
			for(int i=0;i<count;i++) {
				arr[i]=temp[i];
			}
			temp=null;
		}
		arr[count]=data;
		count+=1;
	}
	
	void add(int idx, T data) {
		if(count==0) {
			arr=new Object[1];
		}else {
			Object[] temp = arr;
			arr=new Object[count+1];
			for(int i=0; i<idx;i++) {
				arr[i]=temp[i];
			}
			for(int i=idx;i<count;i++) {
				arr[i+1]=temp[i];
			}
			temp = null;
		}
		arr[idx]=null;
		count+=1;
	}
	
	void remove(T data) {
		int idx=0;
		
		if(count==0) {
			System.out.println("삭제할 데이터가 없습니다.");
		}else {
			for(int i=0;i<count;i++) {
				if(data==arr[i]) {
					idx=i;
				}
			}
			
			Object[] temp=arr;
			arr = new Object[count-1];
			for(int i=0; i<idx;i++) {
				arr[i] =temp[i];
			}
			for(int i=idx;i<count-1;i++) {
				arr[i]=temp[i+1];
			}
			temp=null;
		}
		count-=1;
	}
	void remove(int idx) {
		if(count==0) {
			System.out.println("삭제할 데이터가 없습니다.");
		}else {
			Object[] temp=arr;
			arr= new Object[count-1];
			
			for(int i=0; i<idx;i++) {
				arr[i] =temp[i];
			}
			for(int i=idx;i<count-1;i++) {
				arr[i]=temp[i+1];
			}
			temp=null;
		}
		count-=1;
	}
	@Override
	public String toString() {
		String result="";
		result="[";
		for(int i=0;i<count;i++) {
			result+=arr[i];
			if(i!=count) {
				result+=",";
			}
		}
		result +="]";
		return result;
	}
	
}

class User{
	String name;
	void print_name() {
		System.out.println(name);
	}
}
	public static void main(String[] args) {
		MyVector<User> vec = new MyVector<>();
		User temp = new User();
		temp.name = "서현 ";
		vec.add(temp);
		
	}
}
