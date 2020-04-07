package resource;

import java.util.Scanner;

import model.DAO;
import view.Delete;
import view.Input;
import view.Menu;
import view.Modify;
import view.Output;
import view.Search;
import view.View;

// ��� ��Ƶδ� ��
public interface R {
	
	String appTitle = ":::::::::: ��ȭ��ȣ�� ::::::::::";
	String menuTitle = ":::::::::: MENU ::::::::::";
	String inputTitle = ":::::::::: �Է� ��� ::::::::::";
	String outputTitle = ":::::::::: ��� ��� ::::::::::";
	String searchTitle = ":::::::::: �˻� ��� ::::::::::";
	String modifyTitle = ":::::::::: ���� ��� ::::::::::";
	String deleteTitle = ":::::::::: ���� ��� ::::::::::";
	
	String[] menuArr = {"","�Է�","���","�˻�","����","����","����"};
	
	Scanner scan = new Scanner(System.in);
	
	Data data = new Data();
	
	View[] viewArr = {new Menu(), new Input(), new Output(), new Search(), new Modify(), new Delete()};
	
	DAO dao = DAO.getInstance();
	
}