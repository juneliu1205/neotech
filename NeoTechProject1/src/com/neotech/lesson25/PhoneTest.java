package com.neotech.lesson25;

public class PhoneTest {

	public static void main(String[] args) {
		
		
					//we cannot instantiate abstract classes
					//we cannot create objects from abstract classes
					//Phone p = new Phone();
					//p.takePicture();
					
					
					Phone iphone1 = new iPhone(); //upcasting
					iphone1.call();
					iphone1.text();
					iphone1.takePicture();
					iphone1.playMusic();
					
					Phone samsung = new Samsung();
					samsung.call();
					samsung.text();
					samsung.takePicture();
					samsung.playMusic();
				//	samsung.googlePlay();
					
					
				}
			}