import java.util.Scanner;
// Wyatt Ward
//this will tell you what your perfect pet is depending on your favorite color, season, and name

public class Pet {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String favColor = ("none");
        String favSeason = ("none");
        String yourName = ("none");
        String spellColor = ("blue green red");
        String spellSeason = ("fall spring winter summer");
        boolean next = false;
        String pet = ("none");
        String letters = ("abcdefghijklmnopqrstuvwxys");
        String consonants = "[bcdfgjklmnpqstvxz]";
        if (favColor.equals("none")) {
            System.out.println("what is your favorite color: blue, green, or red");
            favColor = scan.nextLine().toLowerCase();
            if(spellColor.contains(favColor) && !favColor.equals("") && !favColor.contains(" ")) {
                System.out.println("favorite color is: " +favColor);
                next = true;
            } else{
                System.out.println("sorry you spelt something wrong please try again");
                next = false;
            }
        }
        if (favSeason.equals("none") && spellColor.contains(favColor) && next) {
            System.out.println("what is your favorite season");
            favSeason = scan.nextLine().toLowerCase();
            if(spellSeason.contains(favSeason) && !favSeason.equals("") && !favSeason.contains(" ")){
                System.out.println(favColor + ", " + favSeason);
                next = true;
            } else {
                System.out.println("sorry you spelt something wrong please try again");
                next = false;
            }
        }
        if (yourName.equals("none") && spellSeason.contains(favSeason) && next) {
            System.out.println("what is your name");
            yourName = scan.nextLine().toLowerCase();
            System.out.println(favColor + ", " + favSeason + ", " + yourName);
        }
        if (pet.equals("none") && !yourName.equals("none")){
            if(favColor.equals("blue") == true){
                if(favSeason.equals("fall") == true){
                    pet = "alligator";
                }
                if(favSeason.equals("spring") == true){
                    pet = "ostrich";
                }
                // default x1 && x2 || x3 we do the and step first and then the or step
                //if you want the or step first do x1 && (x2||x3)
                if(consonants.contains(yourName.substring(0,1)) && !favSeason.equals("summer") && !favSeason.equals("fall") && !pet.equals("ostrich")){
                    pet = "axolotl";
                }
            } 
            if(favColor.equals("green")) {
                if(consonants.contains(yourName.substring(0,1)) && favSeason.equals("winter")) {
                    pet = "giraffe";
                }
                if(!favSeason.equals("fall") && !pet.equals("giraffe")) {
                    pet = "dog";
                }
            }
            if(favColor.equals("red")) {
                if(!"[aeiou]".contains(yourName.substring(0,1))) {
                    pet = "panda";
                } else {
                    pet = "porcupine";
                }
                }
            if(favSeason.equals("summer") && !pet.equals("dog") && !pet.equals("panda") && !pet.equals("porcupine")){
                pet = "pony";
            }if(pet.equals("none")){
                pet = "rock";
            }
            System.out.println("your perfect pet is: " + pet);
            }
            
        }
        }
