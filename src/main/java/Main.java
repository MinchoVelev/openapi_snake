import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.test.openapi.model.Pet;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        Pet dog = new Pet();
        dog.setId(1l);
        dog.setPetName("dog");
        String line = new ObjectMapper().writer().writeValueAsString(dog);
        System.out.println(line);
    }
}
