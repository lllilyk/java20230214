package ch13.sec02.exam01;

//제네릭 타입
public class Product<K, M> { //타입 파라미터로 K,M 정의
	//필드
	private K kind; //타입 파라미터를 필드 타입으로 사용
	private M model;
	
	//메소드
	public K getKind() {return this.kind;} //타입 파라미터를 리턴 타입으로 사용
	public M getModel() {return this.model;}
	public void setkind(K kind) {this.kind = kind;} //타입 파라미터를 매개변수 타입으로 사용
	public void setModel(M model) {this.model = model;}
}
