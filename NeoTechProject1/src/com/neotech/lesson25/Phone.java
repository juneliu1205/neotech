package com.neotech.lesson25;

public abstract class Phone {
	//implemented methods
		public void call()
		{
			System.out.println("Phones can make calls!");
		}
		
		public void text()
		{
			System.out.println("Phones can send texts!");
		}
		
		//unimplemented method; abstract methods; undefined methods
		public abstract void takePicture();
			
			
		public abstract void playMusic();
			
		
	}
        class iPhone extends Phone
	{
		@Override
		public void takePicture() {
			System.out.println("iPhones can take good pictures!");		
		}
		
		@Override
		public void playMusic() {
			System.out.println("iPhones can play music!");
		}
		//overriding the parent method
		public void call()
		{
			System.out.println("iPhones can also make Facetime calls");
		}
		
	}
	//A concrete cannot have abstract methods
	//1. I can change this class to abstract
	//2. Implement the abstract methods
	class Samsung extends Phone
	{
		@Override
		public void takePicture() {
			System.out.println("Samsung takes best pictures");
		}
		@Override
		public void playMusic() {
			System.out.println("Samsung can play music too!");
		}
		
		public void googlePlay()
		{
			System.out.println("Samsung has google play!");
		}
		
	}