package com.bwei.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.bwei.dto.Dog;

/**
* 
* <p>Title: pojoToJson</p>
* <p>Description: </p>
* @Param
* @Author:Jiangsy
* @Date:2016��9��1�� ����7:22:28
*/
public class TestSerialize {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		//SerializeDog();
		//System.out.println("���б�ɹ�");
		Dog dog = DeserializeDog();
		System.out.println(dog.getName());
	}
	
	private static void SerializeDog() throws FileNotFoundException, IOException {
		Dog dog = new Dog();
		dog.setName("�绨");
		dog.setAge(4);
		
		ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(new File("D:\\Dog.txt")));
		oo.writeObject(dog);
		oo.close();
	}
	
	private static Dog DeserializeDog() throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream nn = new ObjectInputStream(new FileInputStream(new File("D:\\Dog.txt")));
		Dog dog = (Dog) nn.readObject();
		return dog;
	}

}
