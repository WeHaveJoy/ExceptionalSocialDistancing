package Social;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

 class Tester {

    Path path;

public Tester(String fileName){
    this.path= Paths.get("/home/sinovuyo/IdeaProjects/SocialDistanceChecker/src/"+ fileName+".txt");
}

    boolean check() throws SocialDistancingViolation {
       boolean assertion = false;
        try {
            if(" x x x x x".equals(Files.readAllLines(path).get(0).toLowerCase())){
             assertion = true;

            } else {
                throw new SocialDistancingViolation();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return assertion;
    }


}

public class SocialDistanceChecker{
    public static void main(String[] args) throws SocialDistancingViolation {
        Tester buns = new Tester("bookings");
        buns.check();
    }
}

class SocialDistancingViolation extends Exception {

}