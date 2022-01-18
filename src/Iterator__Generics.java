import java.util.*;


public class Iterator__Generics {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("자바왕",1,1));
		list.add(new Student("자바짱",1,1));
		list.add(new Student("홍길동",1,1));
		
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
//			Student s = (Student) it.next();  지네릭스를 사용하지 않으면 형 변환 필요.
			Student s = it.next(); //지네릭스 사용하면 next()의 반환 타입이 Object->지네릭 타입으로 바뀜==>형 변환 불 필요  
			System.out.println(s.name);
		}
		

	}

}

class Student{
	String name ="";
	int ban;
	int no;
	
	
	Student(String name,int ban,int no){
		this.name  = name;
		this.ban = ban;
		this.no = no;
	}
}
