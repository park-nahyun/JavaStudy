


import java.util.*;


	

class CarFrame
{
	private String carNum;						//-- 차 번호
	private String carModel;					//-- 차종 모델명
	private String carType;						//-- 차 분류(경차, 소형, 중형, 대형, SUV)					
	private String oilOption;					//-- 오일 분류(가솔린, 전기차)
	private boolean rentalState = true;			//-- 대여상태
	private int pricePerHour;					//-- 시간당 가격 변수
	private int[] insurance;					//-- 기본 보험료(자기부담금 5,30,70)
	

	
	
	// 인수가 없는 사용자 정의 생성자
	CarFrame()
	{
	}


	// 인수가 있는 사용자 정의 생성자 
	CarFrame(String carModel, String carType, String oilOption, 
			int pricePerHour, int[] insurance)
	{
		this.insurance = new int[3];
		
		this.carNum = carNum;
		this.carModel = carModel;
		this.carType = carType;
		this.oilOption= oilOption;
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

	public void setOilOption(String oilOption)		
	{
		this.oilOption = oilOption;
	}

	public String getOilOption()			
	{
		return oilOption;
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

}

class Cars
{
	HashMap<String, CarFrame> carInfo = new HashMap<>();
	HashMap<String, CarFrame> nowCar = new HashMap<>(); 
	String[] nowCarKeys;
	
	Cars()
	{
		inputCars();
		possCar();
	}

	String[] carNums = {"94허2440", "91허7170", "26허9534", "64허3801", "90허3756",
						"45허9522", "06허0751", "44허3063", "71허3339", "48허0764",
						"79허4836", "77허1867", "58허2665", "90허8409", "56허1020",
						"43허6214", "97허8728", "53허1738", "23허1186", "10허7520",
						"01허1299", "77허4793", "72허0530", "78허8744", "79허6157",
						"85허2089", "90허2071", "49허1568", "55허1089", "42허0497",
						"60허4124", "63허4371", "71허7208", "06허9068", "15허0147",
						"14허5928", "52허6565", "87허1271", "11허1228"};

	String[] carModels = {"레이", "레이", "레이", "스파크", "스파크", "스파크", "스파크",
		"K3", "K3", "K3", "K3", "K3", "아반떼AD", "아반떼AD", "아반떼AD", "아반떼AD",
		"K5", "K5", "K5", "K5", "K5", "SM6", "SM6", "SM6", "볼보XC40", "볼보XC40",
		"K9", "K9", "K9", "K9", "K9", "올뉴제네시스G80", "올뉴제네시스G80",
		 "올뉴제네시스G80", "르노삼성XM3", "르노삼성XM3", "르노삼성XM3",
		"볼보XC90", "레인지로버 P360"};


	String[] carType = {"경차", "경차", "경차", "경차", "경차", "경차", "경차", 
		"소형차", "소형차", "소형차", "소형차", "소형차", "소형차", "소형차", "소형차", "소형차",
		"중형차", "중형차", "중형차", "중형차", "중형차", "중형차", "중형차", "중형차", "중형차", "중형차",
		"대형차", "대형차", "대형차",  "대형차",  "대형차", "대형차", "대형차", "대형차", 
		"SUV", "SUV", "SUV", "SUV", "SUV"}; 


	String[] oilOption = {"가솔린", "가솔린", "가솔린", "가솔린", "가솔린", "가솔린", "가솔린",
						  "가솔린", "전기차", "전기차", "가솔린", "가솔린", "전기차", "전기차", 
						  "전기차", "가솔린", "가솔린", "가솔린", "가솔린", "가솔린", "가솔린", 
						  "가솔린", "가솔린", "전기차", "전기차", "가솔린", "가솔린", "전기차", 
						  "전기차", "전기차", "가솔린", "가솔린", "가솔린", "가솔린", "가솔린", 
						  "가솔린", "가솔린", "가솔린", "전기차"};
	
	int[] pricePerHour = {5580, 5580, 5580, 5580, 5580, 5580, 5580, 
						7040, 7040, 7040, 7040, 7040, 7040, 7040, 7040, 7040,
						9580, 9580, 9580, 9580, 9580, 9580, 9580, 9580, 9580, 9580, 
						12130, 12130, 12130, 12130, 12130, 12130, 12130, 12130, 
						15210, 15210, 15210, 15210, 15210};
	

	int[][] insurance = {{2700, 1700, 1420}, {2700, 1700, 1420}, {2700, 1700, 1420}, {2700, 1700, 1420}, {2700, 1700, 1420}, {2700, 1700, 1420}, {2700, 1700, 1420},
						 {4040, 2670, 2120}, {4040, 2670, 2120}, {4040, 2670, 2120}, {4040, 2670, 2120}, {4040, 2670, 2120}, {4040, 2670, 2120}, {4040, 2670, 2120}, {4040, 2670, 2120}, {4040, 2670, 2120},
						 {4430, 2960, 2320}, {4430, 2960, 2320}, {4430, 2960, 2320}, {4430, 2960, 2320}, {4430, 2960, 2320}, {4430, 2960, 2320}, {4430, 2960, 2320}, {4430, 2960, 2320}, {4430, 2960, 2320}, {4430, 2960, 2320}, 
						 {5070, 3670, 3070}, {5070, 3670, 3070}, {5070, 3670, 3070}, {5070, 3670, 3070}, {5070, 3670, 3070}, {5070, 3670, 3070}, {5070, 3670, 3070}, {5070, 3670, 3070}, 
						 {6140, 4740, 4140}, {6140, 4740, 4140}, {6140, 4740, 4140}, {6140, 4740, 4140}, {6140, 4740, 4140}};

	
	public void inputCars()
	{
		for (int i=0; i<carNums.length; i++)
		{
			carInfo.put(carNums[i], new CarFrame(carModels[i], carType[i], oilOption[i], pricePerHour[i], insurance[i]));			
		}

	}
	
	// ② 대여 가능한 차만 따로 담기
	public void possCar()
	{
		// 대여 가능한 차
		
		for (int i = 0; i<carNums.length; i++)
		{
			CarFrame cf = (CarFrame)carInfo.get(carNums[i]);
			if (cf.getRentalState())		// 키가 carNums[i] 요소의 value의 RentarState가 true라면
			{
				nowCar.put(carNums[i], carInfo.get(carNums[i]));		// carNums[i]를 nowCar 리스트에 넣어라
			}
		}

		// 대여 가능한 차의 key 값만 있는 set을 String 배열로 만들기
		nowCarKeys = nowCar.keySet().toArray(new String[nowCar.size()]);
	
	
	}
	

	
	// 테스트 출력
	
	public void print()
	{


		System.out.println("번" + carNums.length);
		System.out.println("종" + carType.length);
		System.out.println("델" + carModels.length);
		System.out.println("기름" + oilOption.length);
		/*
		for (int i = 0; i<nowCarKeys.length; i++)
		{
			
		}

		*/

	}

}


// 대여 시간 임시로 설정.. 2시간 대여중임

class SelectCars
{
	Cars c;
	
	{
		c = new Cars();
		c.inputCars();
		c.possCar();
	}


	int[] selectNum;		// 사용가능한 차 리스트 번호(사용자가 보고 선택할 번호) 배열
	HashMap<String, CarFrame> userCar = new HashMap<>(); 		// 사용자가 선택한 차량을 담을 해시맵
	
	// 대여 가능한 차 출력(일단 모든 차 출력)
	public void printExist()
	{
		
		selectNum = new int[c.nowCarKeys.length];
		
	
		System.out.print("     차종     |   시간당 가격   |     대여금액\n");
		System.out.print("=================[경 차]=================\n");
		for (int i=0;i<c.nowCarKeys.length;i++)
		{
			CarFrame nc = (CarFrame)c.nowCar.get(c.nowCarKeys[i]);	// nowCar Hashmap의 요소를 담을 변수

			if (nc.getCarType().equals("경차"))	// 해당 요소의 value에 있는 CarType이 "경차"라면 출력		
			{
				System.out.printf("%2d.  %s  	   %d   	  %d\n", i+1, nc.getCarModel(), nc.getPricePerHour(), nc.getPricePerHour()*2);
			
				// 사용자 선택 번호 i+1을 배열에..? 담아야하나요..
				selectNum[i] = i+1;

				// selectNum = {0, 1, 2, 3..} 이렇게 차곡차곡 담기게 될 것
			}
		}

		/*
		System.out.print("===============[소형차]=============");
		for (int i=0;i<c.nowCarKeys.length;i++)		// 이거 고쳐야함ㅠㅠ i를 어디서 부터 시작해야 위의 i와 연속해서 번호가 나올지
		{
			CarFrame nc = (CarFrame)c.nowCar.get(c.nowCarKeys[i]);	

			if (nc.getCarType().equals("소형차"))	
			{
				System.out.printf("%d.    %s      %f    %f", i+1, nc.getCarModel(), nc.getPricePerHour(), nc.getPricePerHour()*2);
			
				selectNum[i] = i+1;
			}
		}	
		*/
	}

	// 지금해야하는 것
	// 지멋대로 들어가있는 nowCar 해시맵의 키 배열을 ( = nowCarkeys)
	// 경,소,중,대 순서로 넣고
	// 여기서 차 모델 중복되는 것 제거 후 
	// 출..

	
	// 사용자 차 선택

	public void selectCar()
	{
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

		else if (selectNum[0]<=n || n<=selectNum[selectNum.length-1])	// 만약에 사용자가 선택한 번호가 selectNum 배열 안에 있는 숫자라면
		{
			// 예를 들어 사용자가 5를 입력했다면
			// 231 구문의 i+1가 5라는 것
			// 즉 사용자는 nowCarKeys의 인덱스(i)가 4인 차량을 골랐음
			// 그럼 그 차를 호출해서 이 사용자에게 배정하면 될 일..맞나요..
			
			
			userCar.put(c.nowCarKeys[n-1], (CarFrame)c.nowCar.get(c.nowCarKeys[n-1]));
			
			// userCar해시맵을 따로 만들었는데
			// 결국 여기 담긴 차의 RentalState를 바꾼 것, 여기에 user 정보 담는 것이 Car에도 반영이 되어야함
			// 어떡해야 할 지 모르겠음ㅠㅠ
			// 아니면 사용자가 선택한 차를 userCar로 옮기지 않고 바로 Car에서 정보를 바꾸면 되나?
			// 그런데 대여기간이 끝났을 때 rentalstate를 true로는 어떻게 바꿔?
			
		}

		else
			System.out.println("해당 차가 존재하지 않습니다");
			
	}

	// 

	// 확인용 출력
	public void print()
	{
		/*
		for (int i=0;i<selectNum.length ;i++ )
		{
			System.out.println("이용 가능한 차 넘버링: " + selectNum[i]);
		}
		*/

		//System.out.println("가능한 차 키 : " + nowCarKeys[i]);
	
	}
}

	


public class HashMapTest
{
	public static void main(String[] args)
	{
		Cars cd = new Cars();
		//cd.inputCars();
		//cd.possCar();
		
		cd.print();

		SelectCars secar = new SelectCars();
		secar.printExist();
		secar.selectCar();
		
	
		
		
	}
}