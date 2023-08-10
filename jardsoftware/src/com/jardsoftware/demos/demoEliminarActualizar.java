package com.jardsoftware.demos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jardsoftware.entidades.depreciacion;
import com.jardsoftware.entidades.dpto_infraestructura_ti;
import com.jardsoftware.entidades.rlhv_e;
import com.jardsoftware.entidades.ubicacion;

public class demoEliminarActualizar {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(dpto_infraestructura_ti.class)
				.addAnnotatedClass(rlhv_e.class)
				.addAnnotatedClass(ubicacion.class)
				.addAnnotatedClass(depreciacion.class)
				.buildSessionFactory();
		
	Session session = factory.getCurrentSession();
	
	try {
		session.beginTransaction();
		
		// Ejemplo de actualización de un registro en la tabla 'dpto_infraestructura_ti'
		dpto_infraestructura_ti dpto = session.get(dpto_infraestructura_ti.class, 2);
		
		dpto.setNit_empresa("38495"); // Se actualiza el valor del atributo 'nit_empresa'
		session.createQuery("update dpto_infraestructura_ti a set a.nit_empresa = '38495' where a.nit_empresa = '45675'").executeUpdate();
		
		session.delete(dpto);// Se elimina el registro 'dpto' de la tabla
		
		// eliminación de registros en la tabla 'dpto_infraestructura_ti'
		session.createQuery("delete from dpto_infraestructura_ti a where a.nit_empresa = '45677'").executeUpdate();
		
		
		
		
		// Ejemplo de actualización de un registro en la tabla 'rlhv_e'
		rlhv_e rl = session.get(rlhv_e.class, 1);
		
		rl.setPrecauciones_utilizacion("ninguna");// Se actualiza el valor del atributo 'Precauciones_utilizacion'
		session.createQuery("update rlhv_e b set b.id_equipo = 'ninguna' where b.precauciones_utilizacion = 'actualizar cada semana'").executeUpdate();
		
		session.delete(rl);// Se elimina el registro 'rl' de la tabla
		
		// eliminación de registros en la tabla 'rlhv_e'
		session.createQuery("delete from rlhv_e b where b.precauciones_utilizacion = '2'").executeUpdate();
		
		
		
		
		
		// Ejemplo de actualización de un registro en la tabla 'ubicacion'
		ubicacion ubi = session.get(ubicacion.class, 2);
		
		ubi.setUbicacion("administrador");// Se actualiza el valor del atributo 'ubicacion'
		session.createQuery("update ubicacion c set c.ubicacion = 'administrador' where c.ubicacion = 'gerente'").executeUpdate();
		
		session.delete(ubi);// Se elimina el registro 'ubi' de la tabla
		
		// eliminación de registros en la tabla 'ubicacion'
		session.createQuery("delete from ubicacion c where c.ubicacion = 'empleado 1'").executeUpdate();
		
		
		
		
		// Ejemplo de actualización de un registro en la tabla 'depreciacion'
		depreciacion dp = session.get(depreciacion.class, 1);
		
		dp.setValor_de_rescate("$200");// Se actualiza el valor del atributo 'Valor_de_rescate'
		session.createQuery("update depreciacion d set d.Valor_de_rescate = '$200' where d.Valor_de_rescate = '$300'").executeUpdate();
		
		session.delete(dp);// Se elimina el registro 'dp' de la tabla
		
		// eliminación de registros en la tabla 'depreciacion'
		session.createQuery("delete from depreciacion d where d.Costo_computador = '$5,000'").executeUpdate();
		session.getTransaction().commit();
		
		System.out.println("proceso finalizado");
		
		
	}finally {
		factory.close();
		
	}
	
	}
	
}
