package mx.uaemex.fi.paradigmas_i.lemuria.admin.control;


import javax.swing.JOptionPane;

import mx.uaemex.fi.paradigmas_i.lemuria_dao.daos.EnemigoDAO;
import mx.uaemex.fi.paradigmas_i.lemuria_dao.error.PersistenciaException;
import mx.uaemex.fi.paradigmas_i.lemuria_dao.transfer_objs.Enemigo;

public class ControlEnemigos {
		private EnemigoDAO dao;
		//EXCEPTION FROM RUNTIME DOESN'T HAVE TO BE CATCHED, PERSISTENCIA EXCEPTION MUST BE
	public void creaEnemigo(Enemigo e) {
		try{
			this.dao.create(e);
			JOptionPane.showMessageDialog(null, "Great!, enjoy yourself!");
		}catch(PersistenciaException exp){
			JOptionPane.showMessageDialog(null,exp.getMessage());
		}
	}
	
	public void setDao(EnemigoDAO e) {
		this.dao=e;
	}
}
