package org.comstudy21.page319.ex10;

public abstract class PairMap {
	protected String[] keyArray; // key ���� �����ϴ� �迭
	protected String[] valueArray; // value ���� �����ϴ� �迭
	
	public abstract String get(String key); // key ���� ���� value ����. ������ null ����
	public abstract void put(String key, String value); // key�� value�� ������ ����. ������ key�� ������, ���� value�� ����
	
	public abstract String delete(String key); // key ���� ���� ������(value�� �Բ�) ����. ������ value �� ����
	public abstract int length(); // ���� ����� �������� ���� ����
}
