package resource;

import java.util.Scanner;

import model.DAO;
import view.Delete;
import view.Input;
import view.Menu;
import view.Modify;
import view.Output;
import view.Rank;
import view.Search;
import view.View;

public interface R {
	
	String appTitle = ":::::::::: 성적관리 프로그램 ::::::::::";
	String menuTitle = ":::::::::: MENU ::::::::::";
	String inputTitle = ":::::::::: 입력 기능 ::::::::::";
	String outputTitle = ":::::::::: 출력 기능 ::::::::::";
	String rankTitle = ":::::::::: 등수 보기 ::::::::::";
	String searchTitle = ":::::::::: 검색 기능 ::::::::::";
	String modifyTitle = ":::::::::: 수정 기능 ::::::::::";
	String deleteTitle = ":::::::::: 삭제 기능 ::::::::::";
	
	String[] menuArr = {"","입력","출력","등수 보기","검색","수정","삭제","종료"};
	
	Scanner scan = new Scanner(System.in);
	
	Data data = new Data();
	
	View[] viewArr = {new Menu(), new Input(), new Output(), new Rank(), new Search(), new Modify(), new Delete()};
	
	DAO dao = DAO.getInstance();
	
	
}
