import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalSample {
	static Map<String, String> ageMap = new HashMap<String, String>();

	static void setAgeMap() {
		ageMap.put("ロビン", "A");
		ageMap.put("アリス", "B");
		ageMap.put("レオナルド", "O");
	}

	public static void main(String[] args) {
		setAgeMap();

		String input = "ロビン";

		String bloodType = checkBloodType(input);

		if (null != bloodType) {
			System.out.println(input + "の血液型は" + bloodType + "型です");
		}
		
		Optional<String> bloodTypeOptional = checkAgeOptional(input);
		
		bloodTypeOptional.ifPresent(x-> System.out.println(input + "の血液型は" + x + "型です"));
	}

	private static String checkBloodType(String input) {
		return ageMap.get(input);
	}
	
	private static Optional<String> checkAgeOptional(String input){
		return Optional.ofNullable(ageMap.get(input));
	}
}
