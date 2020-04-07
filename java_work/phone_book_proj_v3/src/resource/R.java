package resource;

import java.util.Scanner;

import model.DAO;
import view.*;

public interface R {
	
	String appTitle = ":::::::::: ��ȭ��ȣ�� ::::::::::";
	String menuTitle = ":::::::::: MENU ::::::::::";
	String[] menuArr = {"", "�Է�", "���", "�˻�", "����", "����" , "����"};
	String inputTitle = ":::::::::: �Է� ��� ::::::::::";
	String outputTitle = ":::::::::: ��� ��� ::::::::::";
	String searchTitle = ":::::::::: �˻� ��� ::::::::::";
	String modifyTitle = ":::::::::: ���� ��� ::::::::::";
	String deleteTitle = ":::::::::: ���� ��� ::::::::::";
	
	Scanner scan = new Scanner(System.in);
	
	Data data = new Data();
	
	View[] viewArr = {new Menu(), new Input(), new Output(), new Search(), new Modify(), new Delete()};
	
	DAO dao = DAO.getInstance();
}
