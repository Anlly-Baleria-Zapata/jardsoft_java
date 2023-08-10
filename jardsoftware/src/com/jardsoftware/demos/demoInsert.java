package com.jardsoftware.demos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jardsoftware.entidades.depreciacion;
import com.jardsoftware.entidades.dpto_infraestructura_ti;
import com.jardsoftware.entidades.rlhv_e;
import com.jardsoftware.entidades.ubicacion;


public class demoInsert {

	public static void main(String[] args) {
		
		 // Crear la fábrica de sesiones de Hibernate y configurarla con "hibernate.cfg.xml"
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(dpto_infraestructura_ti.class)
				.addAnnotatedClass(rlhv_e.class)
				.addAnnotatedClass(ubicacion.class)
				.addAnnotatedClass(depreciacion.class)
				.buildSessionFactory();
		
		// Obtener la sesión actual de Hibernate
		Session session = factory.getCurrentSession();
		
		try {
			// Iniciar la transacción para guardar el registro en la base de datos
			session.beginTransaction();
			
			
			// Insertar datos en la tabla "dpto_infraestructura_ti"
			dpto_infraestructura_ti user = new dpto_infraestructura_ti("38493");
			
			// Guardar el objeto en la base de datos
			session.save(user);
			
			
			// Insertar datos en la tabla "rlhv_e"
			rlhv_e hv = new rlhv_e("1","Microsoft Windows 10 Home Single Language","LAPTOP-V7HDPN41","HP NOTEBOOK - 14-BS007LA","ninguna","jose perez","puerto usb 2 malo","ninguno","ninguno");
			session.save(hv);
			
			
			// Insertar datos en la tabla "ubicacion"
			ubicacion location = new ubicacion("1","empleado 1");
			session.save(location);
			
			
			// Insertar datos en la tabla "depreciacion"
			depreciacion depreciation = new depreciacion("$1,000","$200","5");
			session.save(depreciation);
			
			
			 // Confirmar la transacción
			session.getTransaction().commit();
			
			
			 // Mostrar mensaje de éxito
			System.out.println("Registros almacenados en la base de datos exitosamente");
			
			
		}finally {
			 // Cerrar la fábrica de sesiones al finalizar
			factory.close();
		}
	}
}
