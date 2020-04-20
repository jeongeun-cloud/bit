package controller;

import java.util.Vector;

public class ListController implements Controller {

	
	@Override
	public void service() {
		Vector<Vector> dataVector = dao.selectAll();
		dm.setDataVector(dataVector, columnIdentifiers);
		
	}
	
}
