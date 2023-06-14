package e1_onetoone_hibernate.controller;

import java.util.Scanner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import e1_onetoone_hibernate.PanCard;

import e1_onetoone_hibernate.Person;
import e1_onetoone_hibernate_crud.PanCardCrud;
import e1_onetoone_hibernate_crud.PersonCrud;

public class PersonPanCardMain {

	public static void main(String[]args) {
		
		
		PanCardCrud crud=new PanCardCrud();
		PersonCrud crud1=new PersonCrud();
		Scanner sc=new Scanner(System.in);
		boolean check=true;
		do {
			System.out.println("choose option \n1.savepanCard \n2.save person \n3.update pancard \n4.update person");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("enter your name");
				String name=sc.next();
				System.out.println("enter your email");
				String email=sc.next();
				System.out.println("enter your phone");
				long phone=sc.nextLong();
				System.out.println("enter your pannumber");
				String pannum=sc.next();
				
				
				PanCard card=new PanCard(name,email,phone,pannum);
				crud.savePanCard(card);
				
				
			}
			break;
			
			case 2:{
				System.out.println("enter your name");
				String name=sc.next();
				System.out.println("enter your email");
				String email=sc.next();
				System.out.println("enter your phone");
				long phone=sc.nextLong();
				System.out.println("enter your address");
				String address=sc.next();
				
				
				
				System.out.println("enter your panid");
				int cardid=sc.nextInt();
				Person person=new Person(name,email,phone,address);
				crud1.savePerson(person,cardid);
				
				
			}break;
			case 3:{
				System.out.println("enter your name");
				String name=sc.next();
				System.out.println("enter your id");
				int id=sc.nextInt();
				System.out.println("enter your phone");
				long phone=sc.nextLong();
				
				PanCard card=new PanCard();
				card.setName(name);
				card.setPhone(phone);
				crud.updateCard(id, card);
				
			}break;
			
			case 4:{
				System.out.println("enter your name");
				String name=sc.next();
				System.out.println("enter your id");
				int id=sc.nextInt();
				System.out.println("enter your phone");
				long phone=sc.nextLong();
				System.out.println("enter your address");
				String address=sc.next();
				
				Person person=new Person();
				person.setName(name);
				person.setPhone(phone);
				person.setAddress(address);
				//person.setCard(id);
				crud1.updatePerson(id, person);
				
				
			}break;
			default:
				break;
			}
			
			
		}while(check);
	}

}

