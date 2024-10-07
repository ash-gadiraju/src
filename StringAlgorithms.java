public class StringAlgorithms {
    public static void main(String[] args) {

        // PART I
        String mySchool = "Fremd Vikings";

        // print every other character of mySchool on the same line
        // print every other character of mySchool on the same line
        for(int i = 0; i < mySchool.length(); i += 2){
            System.out.print(mySchool.substring(i,i+1));
        }

        // print the String mySchool in reverse (all characters on the same line)
        String otherStr = "";
        for(int i = mySchool.length()-1; i >= 0; i--){
            otherStr +=  mySchool.substring(i, i+1);
        }
        System.out.println("\n"+otherStr);




         /* PART II
           Given the String animal, print the output such that the first line shows
           the first character, the second line shows the second character, and so on

           Ex:  If animal = "monkey" then the output would be:
               m
               mo
               mon
               monk
               monke
               monkey
        */
        String animal = "monkey";
        String animalStr = "";

        for(int i = 0; i < animal.length(); i++){
            animalStr += animal.substring(i, i+1);
            System.out.println(animalStr);
        }


        // PART III
        String phrase = "Mary had a little lamb, little lamb, little lamb";
        phrase += "Mary had a little lamb, its fleece was white as snow";
        // Print the amount of times the word "little" appears within phrase?
        int locPhrase = phrase.indexOf("little");
        //phrase.substring(locPhrase+6,phrase.length-1);


        // create a new String, or modify the existing String, that removes
        // the word "little" entirely





        // create a new String (based on phrase), or modify the existing String,
        // that replaces the word "little" with the word "BIG"




    }
}