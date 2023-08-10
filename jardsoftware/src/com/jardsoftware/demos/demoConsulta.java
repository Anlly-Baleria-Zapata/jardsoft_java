package com.jardsoftware.demos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jardsoftware.entidades.depreciacion;
import com.jardsoftware.entidades.dpto_infraestructura_ti;
import com.jardsoftware.entidades.rlhv_e;
import com.jardsoftware.entidades.ubicacion;

public class demoConsulta {

	public static void main(String[] args) {
		
		// Configuración de la sesión de Hibernate y mapeo de las entidades
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(dpto_infraestructura_ti.class)
				.addAnnotatedClass(rlhv_e.class)
				.addAnnotatedClass(ubicacion.class)
				.addAnnotatedClass(depreciacion.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			// Inicio de la transacción
			session.beginTransaction();
			
			
			
			// Ejemplo de consulta de un registro específico en la tabla 'dpto_infraestructura_ti' mediante su id (clave primaria)
			dpto_infraestructura_ti resultado = session.get(dpto_infraestructura_ti.class, 2);
			System.out.println("registro obtenido: "+resultado);
			
			// Ejemplo de consulta general en la tabla 'dpto_infraestructura_ti'
			List<dpto_infraestructura_ti> resultados = session.createQuery("from dpto_infraestructura_ti").list();
			System.out.println("/nCOnsulta general");
			for (dpto_infraestructura_ti a: resultados) {
			System.out.println(a);
			
			}
			
			
			
			 // Ejemplo de consulta de un registro específico en la tabla 'rlhv_e' mediante su id (clave primaria)
			rlhv_e resultadob = session.get(rlhv_e.class, 10);
			System.out.println("registro obtenido: "+resultadob);
			
			// Ejemplo de consulta general en la tabla 'rlhv_e'
			List<rlhv_e> resultado2 = session.createQuery("from rlhv_e").list();
			System.out.println("/nCOnsulta general");
			for (rlhv_e b: resultado2) {
				System.out.println(b);
			}
			
			
			
			
			 // Ejemplo de consulta de un registro específico en la tabla 'ubicacion' mediante su id (clave primaria)
			ubicacion resultadoc = session.get(ubicacion.class, 3);
			System.out.println("registro obtenido: "+resultadoc);
			
			// Ejemplo de consulta general en la tabla 'ubicacion'
			List<ubicacion> resultado3 = session.createQuery("from ubicacion").list();
			System.out.println("/nCOnsulta general");
			for (ubicacion c: resultado3) {
				System.out.println(c);
			}
			
			
			
			
			// Ejemplo de consulta de un registro específico en la tabla 'depreciacion' mediante su id (clave primaria)
			depreciacion resultadod = session.get(depreciacion.class, 4);
			System.out.println("registro obtenido: "+resultadod);
			
			// Ejemplo de consulta general en la tabla 'depreciacion'
			List<depreciacion> resultado4 = session.createQuery("from depreciacion").list();
			System.out.println("/nCOnsulta general");
			for (depreciacion d: resultado4) {
				System.out.println(d);
			}
			

			
			// Confirmación de la transacción
			session.getTransaction().commit();
			
			System.out.println("proceso finalizado");
			
	}finally {
		factory.close();
	}

}
	
}
