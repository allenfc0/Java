package Assignment;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Cars_Information {
	
	static ArrayList<Car> setCarsInformation() {
		
		ArrayList<Car> carList = new ArrayList<Car>();
		String path = "D:\\Program Files\\PerScholas\\Week 3-Java\\Res\\cars.csv";
		
		//File doc = null;
		Scanner sc = null;
		String line = "";
		
		try {
			sc = new Scanner(new File(path));
			sc.nextLine();
			sc.nextLine();
			while(sc.hasNextLine()) {
				line = sc.nextLine();
				String[] row = line.split(",");
				//System.out.printf("%-30s", row[i]);
				Car carRow = new Car();
				carRow.setCar(row[0]);
				carRow.setMPG(Double.parseDouble(row[1]));
				carRow.setCylinders(Integer.parseInt(row[2]));
				carRow.setDisplacement(Double.parseDouble(row[3]));
				carRow.setHorsepower(Double.parseDouble(row[4]));
				carRow.setWeight(Double.parseDouble(row[5]));
				carRow.setAcceleration(Double.parseDouble(row[6]));
				carRow.setModel(Integer.parseInt(row[7]));
				carRow.setOrigin(row[8]);
				carList.add(carRow);
				
				//System.out.println();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			sc.close();
		}
		
		return carList;
		
	}
	
	
	public static void getCarsInformation() {
		ArrayList<Car> carsInfo = setCarsInformation();
		for(Car x : carsInfo) {
			System.out.println(x.getCar()+ " " + x.getMPG() + " " + x.getCylinders() + " " + 
					x.getDisplacement() + " " + x.getHorsepower() + " " + x.getWeight() + " " +
					x.getAcceleration() + " " + x.getModel() + " " + x.getOrigin());
		}
	}
	
}















