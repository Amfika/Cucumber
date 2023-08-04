import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features") //класс для запуска тестов кукумбер
public class CucumberTest {
}

//для testng имя класса должно заканчиваться а тест
//указать аннотацию в которой будет место нахождения фича -файлов
//фича-файлы кладуться в отдельный пакет

