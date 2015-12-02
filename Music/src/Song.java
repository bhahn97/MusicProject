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
		gMajor.add("ERROR"); gMajor.add("G"); gMajor.add("A"); gMajor.add("B"); gMajor.add("C"); gMajor.add("D"); gMajor.add("E"); gMajor.add("F#"); 
		ArrayList<String> dMajor = new ArrayList<String>();
		dMajor.add("ERROR");dMajor.add("D");dMajor.add("E");dMajor.add("F#");dMajor.add("G");dMajor.add("A");dMajor.add("B");dMajor.add("C#");
		ArrayList<String> aMajor = new ArrayList<String>();
		aMajor.add("ERROR");aMajor.add("A");aMajor.add("B");aMajor.add("C#");aMajor.add("D");aMajor.add("E");aMajor.add("F#");aMajor.add("G#");
		ArrayList<String> eMajor = new ArrayList<String>();
		eMajor.add("ERROR");eMajor.add("E");eMajor.add("F#");eMajor.add("G#");eMajor.add("A");eMajor.add("B");eMajor.add("C#");eMajor.add("D#");
		ArrayList<String> bMajor = new ArrayList<String>();
		bMajor.add("ERROR");bMajor.add("B");bMajor.add("C#");bMajor.add("D#");bMajor.add("E");bMajor.add("F#");bMajor.add("G#");bMajor.add("A#");
		ArrayList<String> fSharpMajor = new ArrayList<String>();
		fSharpMajor.add("ERROR");fSharpMajor.add("F#");fSharpMajor.add("G#");fSharpMajor.add("A#");fSharpMajor.add("B");fSharpMajor.add("C#");fSharpMajor.add("D#");fSharpMajor.add("E#");
		ArrayList<String> cSharpMajor = new ArrayList<String>();
		cSharpMajor.add("C#");cSharpMajor.add("D#");cSharpMajor.add("E#");cSharpMajor.add("F#");cSharpMajor.add("G#");cSharpMajor.add("A#");cSharpMajor.add("B");
		ArrayList<String> fMajor = new ArrayList<String>();
		fMajor.add("ERROR");fMajor.add("F");fMajor.add("G");fMajor.add("A");fMajor.add("Bb");fMajor.add("C");fMajor.add("D");fMajor.add("E");
		ArrayList<String> bFlatMajor = new ArrayList<String>();
		bFlatMajor.add("ERROR");bFlatMajor.add("Bb");bFlatMajor.add("C");bFlatMajor.add("D");bFlatMajor.add("Eb");bFlatMajor.add("F");bFlatMajor.add("G");bFlatMajor.add("A");
		ArrayList<String> eFlatMajor = new ArrayList<String>();
		eFlatMajor.add("ERROR");eFlatMajor.add("Eb");eFlatMajor.add("F");eFlatMajor.add("G");eFlatMajor.add("Ab");eFlatMajor.add("Bb");eFlatMajor.add("C");eFlatMajor.add("D");
		ArrayList<String> aFlatMajor = new ArrayList<String>();
		aFlatMajor.add("ERROR");aFlatMajor.add("Ab");aFlatMajor.add("Bb");aFlatMajor.add("C");aFlatMajor.add("Db");aFlatMajor.add("Eb");aFlatMajor.add("F");aFlatMajor.add("G");
		ArrayList<String> dFlatMajor = new ArrayList<String>();
		dFlatMajor.add("ERROR");dFlatMajor.add("Db");dFlatMajor.add("Eb");dFlatMajor.add("F");dFlatMajor.add("Gb");dFlatMajor.add("Ab");dFlatMajor.add("Bb");dFlatMajor.add("C");
		ArrayList<String> gFlatMajor = new ArrayList<String>();
		gFlatMajor.add("ERROR");gFlatMajor.add("Gb");gFlatMajor.add("Ab");gFlatMajor.add("Bb");gFlatMajor.add("Cb");gFlatMajor.add("Db");gFlatMajor.add("Eb");gFlatMajor.add("F");
		ArrayList<String> cFlatMajor = new ArrayList<String>();
		cFlatMajor.add("ERROR");cFlatMajor.add("Cb");cFlatMajor.add("Db");cFlatMajor.add("Eb");cFlatMajor.add("Fb");cFlatMajor.add("Gb");cFlatMajor.add("Ab");cFlatMajor.add("Bb");
		
		ArrayList<ArrayList<String>> keys = new ArrayList<ArrayList<String>>();
		keys.add(cMajor); keys.add(gMajor); keys.add(dMajor);keys.add(aMajor);keys.add(eMajor);keys.add(bMajor);keys.add(fSharpMajor);keys.add(cSharpMajor);
		keys.add(fMajor);keys.add(bFlatMajor);keys.add(eFlatMajor);keys.add(aFlatMajor);keys.add(dFlatMajor);keys.add(gFlatMajor); keys.add(cFlatMajor);
		
		int randomNum = (int) (Math.random() * keys.size());
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

