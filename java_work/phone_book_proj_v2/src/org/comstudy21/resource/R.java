package org.comstudy21.resource;

import java.util.Scanner;

import org.comstudy21.model.Dao;
import org.comstudy21.view.Delete;
import org.comstudy21.view.Input;
import org.comstudy21.view.Menu;
import org.comstudy21.view.Modify;
import org.comstudy21.view.Output;
import org.comstudy21.view.Search;
import org.comstudy21.view.View;

public interface  R {
	String appTitle = "::::::::: ��ȭ��ȣ�� :::::::::";
	String menuTitle = ":::::::::: MENU ::::::::::";
	String inputTitle = "::::: �Է� ��� :::::";
	String outputTitle = "::::: ��� ��� :::::";
	String searchTitle = "::::: �˻� ��� :::::";
	String modifyTitle = "::::: ���� ��� :::::";
	String deleteTitle = "::::: ���� ��� :::::";
	String[] menuArr = {"","�Է�","���","�˻�","����","����","����"};
	
	Scanner scan = new Scanner(System.in);
	
	// ���ε� 
	Data data = new Data();
	
	View[] viewArr = {new Menu(), new Input(), new Output(), new Search(), new Modify(), new Delete()};
	
	// Dao dao = new Dao(); // �̱����� �ܺο��� �̰� �Ұ��� �ϰԲ� �ϴ� �� (�������⼭ ����� ����� �þ�� ����)
	Dao dao = Dao.getInstance(); // �̱����̱⶧���� �̷��� �����
	
	
}