class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuffer strand=new StringBuffer(dnaStrand);
        for(int i =0;i<dnaStrand.length();i++){
            switch(strand.charAt(i)){
                case 'G':
                    strand.setCharAt(i,'C');
                    break;
                case 'C':
                    strand.setCharAt(i,'G');
                    break;
                case 'A':
                    strand.setCharAt(i,'U');
                    break;
                case 'T':
                    strand.setCharAt(i,'A');
                    break;
            }
        }
        
        return strand.toString();
        }

}
