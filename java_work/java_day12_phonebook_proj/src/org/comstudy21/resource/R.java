package org.comstudy21.resource;

import java.util.Scanner;

import org.comstudy21.controller.PhonebookController;
import org.comstudy21.model.DAO;
import org.comstudy21.view.Delete;
import org.comstudy21.view.Input;
import org.comstudy21.view.Output;
import org.comstudy21.view.Search;
import org.comstudy21.view.Menu;
import org.comstudy21.view.Modify;

// ����� ��Ƶδ� �� 
public interface R {
	String appName = "Phone Book";
	PhonebookController controller = new PhonebookController();
	int MAX = 100;	
	
	Input input = new Input();
	Output output = new Output();
	Menu menu = new Menu();
	Search search = new Search();
	Modify modify = new Modify();
	Delete delete = new Delete();
	
	// DAO dao = new DAO();
	// �̱��� ��ü�� �����Ѵ�.
	DAO dao = DAO.getInstance();
	
	Scanner scan = new Scanner(System.in);
	
	// ���߿� �÷��� ��ü�� ���� �� �� �ִ�.
	Data data = new Data();
	
}
