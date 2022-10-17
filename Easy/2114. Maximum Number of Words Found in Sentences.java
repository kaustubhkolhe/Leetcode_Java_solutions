//Bruteforce way
public int mostWordsFound(String[] sentences) {
        int counter = 0;
        int max =0;
        for(int i=0; i<sentences.length; i++){
            for(int j=0; j < sentences[i].length(); j++){
                if(sentences[i].charAt(j) == ' '){
                    counter++;
                }
            }
            max = Math.max(max,counter);
            counter = 0;
        }
        return max+1;

    }





//Efficient way
public static int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0; i<sentences.length; i++) {
            max = Math.max(max,(sentences[i].split(" ")).length);
        }
        return max;
    }


