import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.openapi.model.Pet;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        Pet dog = new Pet(1L, "Dog");
        String line = new ObjectMapper().writer().writeValueAsString(dog);
        System.out.println(line);
    }
}
