

import java.util.*;


	

class CarFrame
{
	private String carNum;						//-- 차 번호
	private String carModel;					//-- 차종 모델명
	private String carType;						//-- 차 분류(경차, 소형, 중형, 대형, SUV)					
	private boolean rentalState = true;			//-- 대여상태
	private int pricePerHour;					//-- 시간당 가격 변수
	private int[] insurance;					//-- 기본 보험료(자기부담금 5,30,70)
	

	
	
	// 인수가 없는 사용자 정의 생성자
	CarFrame()
	{
	}


	// 인수가 있는 사용자 정의 생성자 
	CarFrame(String carNum, String carModel, String carType, 
			int pricePerHour, int[] insurance)
	{
		this.insurance = new int[3];
		this.carNum = carNum;
		this.carModel = carModel;
		this.carType = carType;
		this.pricePerHour = pricePerHour;
	}

	public void setCarNum(String carNum)
	{
		this.carNum = carNum;
	}

	public String getCarNum()
	{
		return carNum;
	}

	public void setCarModel(String carModel)
	{
		this.carModel = carModel;
	}

	public String getCarModel()
	{
		return carModel;
	}

	public void setCarType(String carType)
	{
		this.carType = carType;
	}

	public String getCarType()
	{
		return carType;
	}

	public void setPricePerHour(int pricePerHour)
	{
		this.pricePerHour = pricePerHour;
	}

	public int getPricePerHour()
	{
		return pricePerHour;
	}

	
	public void setInsurance(int[] insurance) 
	{
		this.insurance = insurance;
	}

	public int[] getInsurance()
	{
		return insurance;
	}

	public void setRentalState(boolean rentalState)
	{
		this.rentalState = rentalState;
	}

	public boolean getRentalState()
	{
		return rentalState;
	}

	@Override
	public String toString()
	{
		return String.format("차 번호 : %s", carNum); 
	}

}


class Cars
{
	CarFrame[] allCar = new CarFrame[15];
	CarFrame[] kyung = new CarFrame[3];
	CarFrame[] so = new CarFrame[3];
	CarFrame[] jung = new CarFrame[3];
	CarFrame[] dae = new CarFrame[3];
	CarFrame[] suv = new CarFrame[3];

	Vector<String> list = new Vector<String>();
	Cars()
	{
		inputCars();
	}

	String[] carNums = {"94허2440", "91허7170", "26허9534", "64허3801", "90허3756",
						"45허9522", "06허0751", "44허3063", "71허3339", "48허0764",
						"79허4836", "77허1867", "58허2665", "90허8409", "56허1020"};

	String[] carModels = {"레이", "레이", "스파크", "K3", "아반떼", "K3", "K5", "K5", "SM6", 
		"K9", "K9", "G80", "르노삼성XM3", "르노삼성XM3", "레인지로버"};


	String[] carType = {"경차", "경차", "경차", "소형차", "소형차", "소형차",
						"중형차", "중형차", "중형차", "대형차", "대형차", "대형차",   
						"SUV", "SUV", "SUV"}; 

	
	int[] pricePerHour = {5580, 5580, 5580, 
						7040, 7040, 7040, 
						9580, 9580, 9580, 
						12130, 12130, 12130, 
						15210, 15210, 15210};
	

	int[][] insurance = {{2700, 1700, 1420}, {2700, 1700, 1420}, {2700, 1700, 1420}, 
						 {4040, 2670, 2120}, {4040, 2670, 2120}, {4040, 2670, 2120}, 
						 {4430, 2960, 2320}, {4430, 2960, 2320}, {4430, 2960, 2320},
						 {5070, 3670, 3070}, {5070, 3670, 3070}, {5070, 3670, 3070}, 
						 {6140, 4740, 4140}, {6140, 4740, 4140}, {6140, 4740, 4140}};

	
	public void inputCars()
	{
		String s;
		for (int i=0; i<carNums.length; i++)
			allCar[i] = new CarFrame(carNums[i], carModels[i], carType[i], pricePerHour[i], insurance[i]);

	
		int j,k,l,m,n;
		j=k=l=m=n=0;

		for (int i=0;i<allCar.length ;i++)
		{
			
			if (allCar[i].getCarType().equals("경차"))
			{
				kyung[j] = allCar[i];
				j++;
			}
			else if (allCar[i].getCarType().equals("소형차"))
			{
				so[k] = allCar[i];
				k++;
			}
			else if (allCar[i].getCarType().equals("중형차"))
			{
				jung[l] = allCar[i];
				l++;
			}
			else if (allCar[i].getCarType().equals("대형차"))
			{
				dae[m] = allCar[i];
				m++;
			}
			else 
			{
				suv[n] = allCar[i];
				n++;
			}
			
		
		}
			
	}


	// 테스트용
	/*
	public void print()
	{
		for (int i=0;i<3 ;i++ )
		{
			System.out.println("되나..? : " + kyung[i]);
			System.out.println("되나..?2 : " + so[i]);
			System.out.println("되나..?3 : " + jung[i]);
		}
	}
	*/

	// 사용 가능한 차 출력
	public void printCar()
	{
		int j = 1;
		

		System.out.print("     차종     |   시간당 가격   |     대여금액\n");
		System.out.print("====================[경 차]====================\n");
		for (int i=0;i<kyung.length;i++)
		{	
			if (kyung[i].getRentalState())
			{
				System.out.println(j+". "+kyung[i]);
				list.add(kyung[i].getCarNum());
				j++;
			}
		}
		System.out.print("====================[소형차]====================\n");
		for (int i=0;i<so.length;i++)
		{	
			if (so[i].getRentalState())
			{
				System.out.println(j+". "+so[i]);
				list.add(so[i].getCarNum());
				j++;
			}
		}
		System.out.print("====================[중형차]====================\n");
		for (int i=0;i<jung.length;i++)
		{	
			if (jung[i].getRentalState())
			{
				System.out.println(j+". "+jung[i]);
				list.add(jung[i].getCarNum());
				j++;
			}
		}
		System.out.print("====================[대형차]====================\n");
		for (int i=0;i<dae.length;i++)
		{	
			if (dae[i].getRentalState())
			{
				System.out.println(j+". "+dae[i]);
				list.add(dae[i].getCarNum());
				j++;
			}
		}
		System.out.print("====================[S U V]====================\n");
		for (int i=0;i<suv.length;i++)
		{	
			if (suv[i].getRentalState())
			{
				System.out.println(j+". "+suv[i]);
				list.add(suv[i].getCarNum());
				j++;
			}
		}

		Iterator<String> it = list.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}

	}

	// 사용자가 차 선택
	public void selectCar()
	{
		CarFrame selCar = new CarFrame();

		Scanner sc = new Scanner(System.in); // 이렇게 하는 거 맞나.. 여기 써도 되나..
		int n;  // 사용자가 선택한 번호

		System.out.println();
		System.out.println("차종을 선택해주세요. 이전 단계로 돌아가시려면 -1을 입력해주세요.");
		n = sc.nextInt();

		if (n==-1)
		{
			// 날짜 및 대여 시간 메소드 호출
			System.out.println();
			System.out.println("날짜 및 대여 시간 호출 할 예정");
		}

		else if (n>0 && n<=list.size())
		{

			for (int i=0;i<allCar.length;i++)
			{
				if(allCar[i].getCarNum().equals(list.get(n-1)))
					selCar = allCar[i];
			}
			System.out.println(selCar);
		} 

		else 
			System.out.println("다시다시");

	}
	
}

public class Newnew
{
	public static void main(String[] args)
	{
		Cars ccc = new Cars();
		ccc.inputCars();
		// ccc.print();
		ccc.printCar();
		ccc.selectCar();
	}
}