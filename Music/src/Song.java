import java.util.ArrayList;

public class Song 
{
	ArrayList<String> keySignatureArray;
	String key;
	int beatsPerMeasure;
	int numberOfMeasures;
	int totalBeats;
	
	ArrayList<String> chordProgression;
	ArrayList<ArrayList<String>> bassVoice;
	ArrayList<ArrayList<String>> sopranoVoice;
	ArrayList<ArrayList<String>> altoVoice;
	ArrayList<ArrayList<String>> tenorVoice;
	
	public Song() //constructor for song
	{
		keySignatureArray = chooseKeySignature();  
		keySignatureArray.get(1); //sets key to tonic of keySignature
		beatsPerMeasure = chooseBeatsPerMeasure();
		numberOfMeasures = chooseNumberOfMeasures();
		totalBeats = beatsPerMeasure * numberOfMeasures;
		
		chordProgression = generateInitialChordProgression(); 
		bassVoice = generateBassVoice(); //ArrayList of measure; measure contains individual notes 
		sopranoVoice = generateSopranoVoice();
		altoVoice = generateAltoVoice();
		tenorVoice = generateTenorVoice();
	}
	public int chooseBeatsPerMeasure() //returns 2,3, or 4
	{
		
	}
	public int chooseNumberOfMeasures() //returns int as number of measures; probably a multiple of 4
	{
		
	}
	public ArrayList<String> chooseKeySignature()
	{
		ArrayList<String> cMajor = new ArrayList<String>(); 
		cMajor.add("ERROR"); cMajor.add("C"); cMajor.add("D"); cMajor.add("E"); cMajor.add("F"); cMajor.add("G"); cMajor.add("A"); cMajor.add("B"); 
		ArrayList<String> gMajor = new ArrayList<String>();
		gMajor.add("ERROR"); gMajor.add("D"); gMajor.add("E"); gMajor.add("F#"); gMajor.add("A"); gMajor.add("B"); gMajor.add("C"); gMajor.add("D"); 
		ArrayList<String> dMajor = new ArrayList<String>();
		
		ArrayList<String> aMajor = new ArrayList<String>();
		
		ArrayList<String> eMajor = new ArrayList<String>();
		
		ArrayList<String> bMajor = new ArrayList<String>();
		
		ArrayList<String> fSharpMajor = new ArrayList<String>();
		
		ArrayList<String> cSharpMajor = new ArrayList<String>();
		
		ArrayList<String> fMajor = new ArrayList<String>();
		
		ArrayList<String> bFlatMajor = new ArrayList<String>();
		
		ArrayList<String> eFlatMajor = new ArrayList<String>();
		
		ArrayList<String> aFlatMajor = new ArrayList<String>();
		
		ArrayList<String> dFlatMajor = new ArrayList<String>();
		
		ArrayList<String> gFlatMajor = new ArrayList<String>();
		
		ArrayList<String> cFlatMajor = new ArrayList<String>();
		
		ArrayList<ArrayList<String>> keys = new ArrayList<ArrayList<String>>();
		keys.add(cMajor); keys.add(gMajor); keys.add(dMajor);keys.add(aMajor);keys.add(eMajor);keys.add(bMajor);keys.add(fSharpMajor);keys.add(cSharpMajor);
		keys.add(fMajor);keys.add(bFlatMajor);keys.add(eFlatMajor);keys.add(aFlatMajor);keys.add(dFlatMajor);keys.add(gFlatMajor); keys.add(cFlatMajor);
		
		int randomNum = (int) (Math.random() * 15);
		return keys.get(randomNum);
        
	}
	public ArrayList<String> generateInitialChordProgression() //generates chordProgression with no inversion
	{
		ArrayList<String> tempChordProgression = new ArrayList<String>();
		tempChordProgression.add("ERROR");
		
		
		
		
		return tempChordProgression;
	}
	public ArrayList<ArrayList<String>> generateBassVoice()
	{
		
	}
	public void optimizeBass()
	{
		
	}
	public ArrayList<ArrayList<String>> generateSopranoVoice()
	{
		
	}
	public void optimizeSoprano()
	{
		
	}
	public ArrayList<ArrayList<String>> generateAltoVoice()
	{
		
	}
	public void optimizeAlto()
	{
		
	}
	public ArrayList<ArrayList<String>> generateTenorVoice()
	{
		
	}
	public void optimizeTenor()
	{
		
	}
}

