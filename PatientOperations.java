package com.Operations;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Patient;

public class PatientOperations {
	static Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	static SessionFactory factory = cfg.buildSessionFactory();
	static Scanner scanner = new Scanner(System.in);

	public static void savePaitent() {
		String pname;
		String Pdept;
		String Pdiagnose;
		int fee;
		Session session = factory.openSession();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Paitent name");
		pname = scanner.nextLine();
		System.out.println("Enter Paitent Diagnose");
		Pdiagnose = scanner.nextLine();
		System.out.println("Enter Paitent Dept");
		Pdept = scanner.nextLine();
		
		System.out.println("Enter Paitent  Feee");
		fee = scanner.nextInt();
		Patient paitent = new Patient(pname,Pdept,Pdiagnose,fee);
		session.beginTransaction();
		session.save(paitent);
		session.getTransaction().commit();
		session.close();
	}
	
	public static void getPaitent() {
		Session session = factory.openSession();
		List<Patient> paitents = session.createQuery("from Paitent").list();
		for(Patient pait: paitents) {
			System.out.println(pait.toString());
		}
		System.out.println("Listed all");
	}
	
	public static void updatePaitentFee(int id) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Patient paitent = session.get(Patient.class, id);
		int newFee = paitent.getP_Free()-1000;
		paitent.setP_Free(paitent.getP_Free()-100);
		System.out.println("new fee: "+paitent.getP_Free());
		session.update(paitent);
		tx.commit();
		session.close();
	}
	
	public static  void  deletePaitent(int id) {
		Session session = factory.openSession();
		  Transaction tx = session.beginTransaction();
		Patient paitent = session.get(Patient.class, id);
		session.remove(paitent);
		tx.commit();
		session.close();
	}

}
