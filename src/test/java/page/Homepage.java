package page;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import resource.Payload;



public class Homepage {

	WebDriver driver=null;
	List<Map<String, Object>> listOfDictionaries = Payload.payload_dict();
	
	public void user_launch_the_url() {
		driver = new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/tag/dynamic-table.html");
		driver.manage().window().maximize();	

	}
	
	public void user_click_on_table_data() {
		WebElement table_data= driver.findElement(By.xpath("//summary"));
		table_data.click();
	}

	public void user_update_the_input_text_box_with_new_data() {
		
		ObjectMapper mapper = new ObjectMapper();


		String json = null;
		try {
			json = mapper.writeValueAsString(listOfDictionaries);
		} catch (JsonProcessingException e) {

			e.printStackTrace();
		}
		WebElement textarea= driver.findElement(By.xpath("//textarea[@id=\"jsondata\"]"));
		textarea.clear();
		textarea.sendKeys(json);
	}


	public void user_click_on_refresh_table_button() {

		WebElement refresh_table= driver.findElement(By.xpath("//button[@id=\"refreshtable\"]"));
		refresh_table.click();
	}


	public void data_table_is_update_as_per_expectation() {


		Map<String, Object> firstPerson = listOfDictionaries.get(0);
		String firstPersonName = (String) firstPerson.get("name");

		Map<String, Object> secondPerson = listOfDictionaries.get(1);
		String secondPersonName = (String) secondPerson.get("name");

		Map<String, Object> thirdPerson = listOfDictionaries.get(2);
		String thirdPersonName = (String) thirdPerson.get("name");

		Map<String, Object> fourthPerson = listOfDictionaries.get(3);
		String fourthPersonName = (String) fourthPerson.get("name");

		Map<String, Object> fifthPerson = listOfDictionaries.get(4);
		String fifthPersonName = (String) fifthPerson.get("name");


		// fetching names for httml data table

		WebElement firstPersonName_element = driver.findElement(By.xpath("(//tr//td)[2]"));
		String firstPersonName_table= firstPersonName_element.getText();

		WebElement secondPersonName_element = driver.findElement(By.xpath("(//tr//td)[5]"));
		String secondPersonName_table= secondPersonName_element.getText();

		WebElement thirdPersonName_element = driver.findElement(By.xpath("(//tr//td)[8]"));
		String thirdPersonName_table= thirdPersonName_element.getText();

		WebElement fourthPersonName_element = driver.findElement(By.xpath("(//tr//td)[11]"));
		String fourthPersonName_table=fourthPersonName_element.getText();

		WebElement fifthPersonName_element = driver.findElement(By.xpath("(//tr//td)[14]"));
		String  fifthPersonName_table=fifthPersonName_element.getText(); 

		assertTrue(firstPersonName.equals(firstPersonName_table));
		assertTrue(secondPersonName.equals(secondPersonName_table));
		assertTrue(thirdPersonName.equals(thirdPersonName_table));
		assertTrue(fourthPersonName.equals(fourthPersonName_table));
		assertTrue(fifthPersonName.equals(fifthPersonName_table));


		driver.quit();
	}

}
